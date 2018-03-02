package xyz.vanilla.anticheat.utility.commons;

import org.bukkit.ChatColor;

public class VanillaChat {

	public String colorize(String msg) {
		return ChatColor.translateAlternateColorCodes('&', msg);
	}
}
