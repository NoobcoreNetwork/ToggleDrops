package com.noobcore.toggledrops;

import drophandler.DropHandler;
import org.bukkit.plugin.java.JavaPlugin;

public class ToggleDrops extends JavaPlugin {
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new DropHandler(), this);
    }

    public void onDisable() {
    }
}
