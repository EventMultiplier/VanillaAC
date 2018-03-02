package xyz.vanilla.anticheat.detection.detections.example;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import xyz.vanilla.anticheat.detection.Detection;
import xyz.vanilla.anticheat.detection.DetectionType;

public class ExampleDetection extends Detection {

	public ExampleDetection() {
		super("Example", DetectionType.EXPLOIT, 1);
	}

	// sorry for the handler.
	// You better be!
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		event.getPlayer().sendMessage("[V]: Done!");
	}
}
