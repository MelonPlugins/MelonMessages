package org.vanillacraft.melonmessages;

import org.bukkit.configuration.file.FileConfiguration;

public class Config {
    public static String joinMessage;
    public static String joinColor;

    public static String firstJoinMessage;
    public static String firstJoinColor;

    public static String leaveMessage;
    public static String leaveColor;

    public static void load(FileConfiguration raw) {
        joinMessage = raw.getString("join.message");
        joinColor = raw.getString("join.color");
        firstJoinMessage = raw.getString("first-join.message");
        firstJoinColor = raw.getString("first-join.color");
        leaveMessage = raw.getString("leave.message");
        leaveColor = raw.getString("leave.color");
    }
}
