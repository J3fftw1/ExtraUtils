package dev.j3fftw.extrautils;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunPlugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class ExtraUtils {
    
    private static final ExtraUtils extraUtils = new ExtraUtils();
    private SlimefunPlugin addon;
    private JavaPlugin plugin;

    private ExtraUtils() {}

    public static void init(SlimefunPlugin addon) {
        extraUtils.addon = addon;
        extraUtils.plugin = addon.getJavaPlugin();
    }

    public SlimefunPlugin getAddon() {
        return addon;
    }

    public JavaPlugin getPlugin() {
        return plugin;
    }

    public static ExtraUtils getInstance() {
        return extraUtils;
    }

}
