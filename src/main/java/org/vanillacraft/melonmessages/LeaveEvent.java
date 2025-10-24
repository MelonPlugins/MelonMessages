package org.vanillacraft.melonmessages;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class LeaveEvent implements Listener {
    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();

        PlaceholderMap placeholderMap = new PlaceholderMap();
        placeholderMap.add("player", player.getName());

        String message = placeholderMap.substitute(Config.leaveMessage);
        String color = Config.leaveColor;

        event.quitMessage(Component.text(message, TextColor.fromHexString(color)));
    }
}
