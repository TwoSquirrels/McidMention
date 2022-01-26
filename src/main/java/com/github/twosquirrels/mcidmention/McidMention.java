package com.github.twosquirrels.mcidmention;

import org.bukkit.plugin.java.JavaPlugin;

public final class McidMention extends JavaPlugin {

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
