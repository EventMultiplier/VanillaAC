package xyz.vanilla.anticheat;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.vanilla.anticheat.managers.DetectionManager;
import xyz.vanilla.anticheat.managers.ListenerInjection;

public class Vanilla extends JavaPlugin {
	private DetectionManager detectionManager;
	private ListenerInjection listenerInjection;
	private static Vanilla instance;

	@Override
	public void onEnable() {
		instance = this;
		System.out.println("[V]: Start registering Vanilla");

		listenerInjection = new ListenerInjection();
		System.out.println("[V]: Registered Listener-Injection");

		detectionManager = new DetectionManager();
		System.out.println("[V]: Registered Detection-Manager");

		detectionManager.registerDetections();
		System.out.println("[V]: Registered checks");

		System.out.println("[V]: Registered Successfully");
	}

	public DetectionManager getDetectionManager() {
		return detectionManager;
	}

	public ListenerInjection getListenerInjection() {
		return listenerInjection;
	}

	@Override
	public void onDisable() {
		detectionManager = null;
		listenerInjection = null;
		System.out.println("[V]: Disabled");
	}

	public static Vanilla getInstance() {
		return instance;
	}
}
