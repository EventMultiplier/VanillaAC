package xyz.vanilla.anticheat.managers;

import xyz.vanilla.anticheat.Vanilla;
import xyz.vanilla.anticheat.detection.Detection;
import xyz.vanilla.anticheat.detection.detections.example.ExampleDetection;
import xyz.vanilla.anticheat.inject.VanillaInjected;

import java.util.ArrayList;
import java.util.List;

public class DetectionManager extends VanillaInjected {

	private List<Detection> detections = new ArrayList<>();

	public void registerDetections() {
		detections.add(new ExampleDetection());
		detections.stream().forEach(Vanilla.getInstance().getListenerInjection()::injectListeners);
	}

}
