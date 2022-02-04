/*
 * (C) 2022 TwoSquirrels
 * This software is released under the MIT License, see LICENSE.
 */

package com.github.twosquirrels.mention4paper;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * plugin's core
 */
public final class Mention4Paper extends JavaPlugin {

    @Override
    public void onEnable() {
        super.getLogger().info(this.getName() + " has been enabled!");
    }

    @Override
    public void onDisable() {
        super.getLogger().info(this.getName() + " has been disabled!");
    }

}
