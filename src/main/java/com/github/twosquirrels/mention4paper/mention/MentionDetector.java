/*
 * (C) 2022 TwoSquirrels
 * This software is released under the MIT License, see /LICENSE.
 */

package com.github.twosquirrels.mention4paper.mention;

import io.papermc.paper.event.player.AsyncChatEvent;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Detecting Mention
 */
public class MentionDetector implements Listener {

    private List<String> listingMentions(@NotNull String text) {
        return new ArrayList<String>();
    }

    private final Logger logger;

    private final MentionEmphasizer emphasizer;

    public MentionDetector(@NotNull Plugin plugin) {
        this.logger = plugin.getLogger();
        this.emphasizer = new MentionEmphasizer();
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onChat(AsyncChatEvent event) {
        Component originalComponent = event.originalMessage();
        if (!(originalComponent instanceof TextComponent)) return;
        List<String> mentions = listingMentions(((TextComponent) originalComponent).content());
        //event.message(emphasizer.emphasize(event.message()));
    }

}
