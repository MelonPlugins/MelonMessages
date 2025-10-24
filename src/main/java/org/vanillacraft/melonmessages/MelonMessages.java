package org.vanillacraft.melonmessages;

import org.bukkit.plugin.java.JavaPlugin;

public final class MelonMessages extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        Config.load(getConfig());
        getServer().getPluginManager().registerEvents(new JoinEvent(), this);
        getServer().getPluginManager().registerEvents(new LeaveEvent(), this);
    }

    @Override
    public void onDisable() {

    }
}
