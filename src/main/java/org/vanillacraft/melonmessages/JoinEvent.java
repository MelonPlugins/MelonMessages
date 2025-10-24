package org.vanillacraft.melonmessages;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        PlaceholderMap placeholderMap = new PlaceholderMap();
        placeholderMap.add("player", player.getName());

        String message;
        String color;

        if (!player.hasPlayedBefore()) {
            message = placeholderMap.substitute(Config.firstJoinMessage);
            color = Config.firstJoinColor;
        } else {
            message = placeholderMap.substitute(Config.joinMessage);
            color = Config.joinColor;
        }

        event.joinMessage(Component.text(message, TextColor.fromHexString(color)));
    }
}
