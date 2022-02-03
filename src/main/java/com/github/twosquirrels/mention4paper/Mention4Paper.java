package com.github.twosquirrels.mention4paper;

import org.bukkit.plugin.java.JavaPlugin;

public final class Mention4Paper extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        super.getLogger().info("Hello, World!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
