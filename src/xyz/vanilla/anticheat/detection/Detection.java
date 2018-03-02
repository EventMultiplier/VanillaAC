package xyz.vanilla.anticheat.detection;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import xyz.vanilla.anticheat.inject.VanillaInjected;

public abstract class Detection extends VanillaInjected implements Listener {

	private String checkName;
	private DetectionType detectionType;
	private long violations;

	public Detection(String checkName, DetectionType detectionType, long violations) {
		this.checkName = checkName;
		this.detectionType = detectionType;
		this.violations = violations;
	}

	protected void addViolation(Player player) {
		for (Player toSend : Bukkit.getOnlinePlayers()) {
			if (toSend.hasPermission("vanilla.alerts")) {
				toSend.sendMessage(getUtility().getVanillaChat().colorize("&7&l[&b&lVanilla&7&l]: &b" + player.getName()
						+ " &7failed &b&l" + checkName + " &7[" + detectionType + "]"));
			}
		}
	}

	public String getCheckName() {
		return checkName;
	}

	public DetectionType getDetectionType() {
		return detectionType;
	}

	public long getViolations() {
		return violations;
	}

}
