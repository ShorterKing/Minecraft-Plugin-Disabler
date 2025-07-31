# 🔌 **PluginDisabler**

**PluginDisabler** is a lightweight Minecraft plugin that lets server admins **disable specific plugins** with ease via its config file. Perfect for squashing plugin conflicts, testing setups, or putting plugins on timeout without deleting them! 🚀

---

## 🌟 **Features**

- **Disable Multiple Plugins**: List ‘em in `config.yml` and watch ‘em go offline.  
- **Self-Protection**: Can’t disable itself (nice try, though)! 🔒  
- **Action Logging**: Tracks everything—warnings for missing plugins, info on what’s already off or just got axed.  
- **Smart Delay**: Waits 2 seconds to let all plugins load before pulling the plug. ⏳  

---

## 🛠️ **Installation**

1. **Grab** the `PluginDisabler.jar` file.  
2. **Drop** it into your server’s `plugins` folder.  
3. **Start or Restart** your server to wake it up.  
4. Check the `plugins/PluginDisabler` folder—a shiny new `config.yml` will be waiting!  

---

## 📝 **Usage**

Getting **PluginDisabler** to work is a breeze:  

1. Open `config.yml` in `plugins/PluginDisabler`.  
2. Add plugin names to the `plugins-to-disable` list.  
3. Save, then **reload or restart** your server.  

### **Example Config**  
```yaml
plugins-to-disable:
  - PluginA
  - PluginB
```  
Boom! "PluginA" and "PluginB" are out of commission on startup.  

### **Heads-Up!** ⚠️  
- **No Self-Sabotage**: Listing "PluginDisabler" in the config? It’ll just laugh and log a warning.  
- **2-Second Chill**: Gives plugins time to load before the disabling kicks in.  

---

## 🧠 **How It Behaves**

- **Plugin MIA?**: Logs a warning like `[PluginDisabler] Plugin not found: PluginX`.  
- **Already Disabled?**: Chimes in with `[PluginDisabler] Plugin already disabled: PluginY`.  
- **Mission Accomplished?**: Celebrates with `[PluginDisabler] Disabled plugin: PluginZ`.  

---

## ⚙️ **Configuration**

The `config.yml` has one star player:  

- **`plugins-to-disable`**: A list of plugin names (case-insensitive) to knock out.  

### **Default Setup**  
```yaml
plugins-to-disable: []
```  

---

## 🤝 **Compatibility**

- **Minecraft Versions**: Runs smooth on Bukkit/Spigot (tested 1.13+).  
- **Dependencies**: Nada. It’s a lone wolf! 🐺  

---

## 📜 **License**

Released under the [MIT License](LICENSE). Free to use, tweak, and share!  

---

**PluginDisabler** – Take control of your server with a flick of the config switch! 💪