package dev.j3fftw.extrautils.utils;

import dev.j3fftw.extrautils.ExtraUtils;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunPlugin;
import org.bukkit.NamespacedKey;

public final class Constants {

    public static final int SERVER_TICK_RATE = 20;

    public static final int CUSTOM_TICKER_DELAY = SlimefunPlugin.getCfg().getInt("URID.custom-ticker-delay");

    public static final NamespacedKey GLOW_ENCHANT = new NamespacedKey(ExtraUtils.getInstance().getPlugin(), "glow_enchant");

    private Constants() {}

}
