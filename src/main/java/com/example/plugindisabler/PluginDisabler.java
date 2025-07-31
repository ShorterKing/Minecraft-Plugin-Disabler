package com.zzz.plugindisabler;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.Bukkit;

import java.util.List;

public class PluginDisabler extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        reloadConfig();

        // Delay the disabling so all plugins are loaded
        Bukkit.getScheduler().runTaskLater(this, () -> {
            List<String> pluginsToDisable = getConfig().getStringList("plugins-to-disable");
            PluginManager pm = getServer().getPluginManager();

            for (String pluginName : pluginsToDisable) {
                if (pluginName.equalsIgnoreCase(getName())) {
                    getLogger().warning("Cannot disable myself!");
                    continue;
                }

                Plugin plugin = pm.getPlugin(pluginName);
                if (plugin != null && plugin.isEnabled()) {
                    pm.disablePlugin(plugin);
                    getLogger().info("Disabled plugin: " + pluginName);
                } else if (plugin == null) {
                    getLogger().warning("Plugin not found: " + pluginName);
                } else {
                    getLogger().info("Plugin already disabled: " + pluginName);
                }
            }

            getLogger().info("zzzPluginDisabler finished (delayed).");
        }, 40L); // 2 seconds delay
    }
}
