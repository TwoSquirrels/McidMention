/*
 * (C) 2022 TwoSquirrels
 * This software is released under the MIT License, see LICENSE.
 */

package com.github.twosquirrels.mention4paper;

import com.github.twosquirrels.mention4paper.mention.MentionDetector;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Plugin's CORE
 */
public final class Mention4Paper extends JavaPlugin {

    @Override
    public void onEnable() {
        new MentionDetector(this);
        super.getLogger().info(this.getName() + " has been enabled!");
    }

    @Override
    public void onDisable() {
        super.getLogger().info(this.getName() + " has been disabled!");
    }

}
