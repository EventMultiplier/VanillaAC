package xyz.vanilla.anticheat.detection.detections.example;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import xyz.vanilla.anticheat.Vanilla;
import xyz.vanilla.anticheat.detection.Detection;
import xyz.vanilla.anticheat.detection.detections.DetectionType;

public class ExampleDetection extends Detection
{

    public ExampleDetection(Vanilla plugin)
    {
        super(plugin, "Example", DetectionType.EXPLOIT, 1);
    }

    //sorry for the handler
    @EventHandler
    public void onJoin(PlayerJoinEvent event)
    {
        event.getPlayer().sendMessage("[V]: Done!");
    }
}
