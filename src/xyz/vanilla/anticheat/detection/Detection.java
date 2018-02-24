package xyz.vanilla.anticheat.detection;

import com.google.common.collect.ImmutableList;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import xyz.vanilla.anticheat.Vanilla;
import xyz.vanilla.anticheat.detection.detections.DetectionType;
import xyz.vanilla.anticheat.inject.VanillaInjected;

public abstract class Detection extends VanillaInjected implements Listener {

    private String checkName;
    private DetectionType detectionType;
    private long violations;

    public Detection(Vanilla plugin, String checkName, DetectionType detectionType, long violations) {
        super(plugin);

        this.checkName = checkName;
        this.detectionType = detectionType;
        this.violations = violations;
    }

    protected void addViolation(Player player)
    {
        final ImmutableList<Player> players = ImmutableList.copyOf(Bukkit.getOnlinePlayers());
        for (int i = 0; i < players.size(); i++) {
            final Player toSend = players.get(i);

            if (toSend.hasPermission("vanilla.alerts"))
            {
                toSend.sendMessage(getUtility().getVanillaChat().colorize("&7&l[&b&lVanilla&7&l]: &b" + player.getName() + " &7failed &b&l" + checkName + " &7[" + detectionType + "]"));
            }
        }
    }
}
