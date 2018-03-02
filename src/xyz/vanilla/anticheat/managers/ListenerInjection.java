package xyz.vanilla.anticheat.managers;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import xyz.vanilla.anticheat.Vanilla;
import xyz.vanilla.anticheat.inject.VanillaInjected;

public class ListenerInjection extends VanillaInjected {

	public void injectListeners(Listener... listeners) {
		try {
			PluginManager pluginManager = Bukkit.getPluginManager();

			for (Listener listener : listeners) {
				pluginManager.registerEvents(listener, Vanilla.getInstance());
			}

		} catch (Exception e) {
			System.out.println("[V]: Error while Injecting the Listeners");
		}
	}

}
