package com.github.rnlin430.rnlibrary;

import jdk.nashorn.internal.codegen.ApplySpecialization;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ConsoleLog {

    private static final String red    = "\u001b[00;31m";
    private static final String green  = "\u001b[00;32m";
    private static final String yellow = "\u001b[00;33m";
    private static final String purple = "\u001b[00;34m";
    private static final String pink   = "\u001b[00;35m";
    private static final String cyan   = "\u001b[00;36m";
    private static final String end    = "\u001b[00m";

    private final JavaPlugin plugin;
    private final String pluginName;

    public ConsoleLog(@NotNull JavaPlugin plugin) {
        this.plugin = plugin;
        this.pluginName = plugin.getName();
    }

    public void writeLine(@Nullable String text) { System.out.println(end + text + end); }
    public void sendCaution(@Nullable String text) { System.out.println("[CAUTION] " + yellow + text + end); }
    public void sendWarning(@Nullable String text) { System.out.println("[WARNING] " + red + text + end); }
    public void sendDescription(@Nullable String text) { System.out.println("[INFO] " + cyan + text + end); }
    public void sendDebugMessage(@Nullable String text) { System.out.println("[DEBUG] " + pink + text + end); }

    public void warnInfo(@Nullable String[] messages) {
        plugin.getLogger().info(red + "*--============================== WARNING =============================--*" + end);
        for (String mg : messages) plugin.getLogger().info(red +  mg + end);
        short length = (short)pluginName.length();
        byte width = 68;
        if (length > width) {
            plugin.getLogger().info(red + "*--"+ pluginName + "--*" + end);
            return;
        }
        StringBuffer sb = new StringBuffer();
        byte temp = (byte) (length - width);
        if ((temp & 0x01) == 0x01) {
            temp++;
        }
        temp <<= 2;
        for (short i = 0; i < temp; i++) {
            sb.append('=');
        }
        sb.append(messages);
        for (short i = 0; i < temp; i++) {
            sb.append('=');
        }
        String result = new String(sb);
        plugin.getLogger().info(red + result + end);
    }

    @NotNull
    public String getGreenMessage(@Nullable String message) { return green + message + end; }
    @NotNull
    public String getRedMessage(@Nullable String message) { return red + message + end; }
    @NotNull
    public String getYellowMessage(@Nullable String message) { return yellow + message + end; }
    @NotNull
    public String getPurpleMessage(@Nullable String message) { return purple + message + end; }
    @NotNull
    public String getPinkMessage(@Nullable String message) { return pink + message + end; }
    @NotNull
    public String getCyanMessage(@Nullable String message) { return cyan + message + end; }
}
