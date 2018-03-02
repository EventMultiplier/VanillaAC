package xyz.vanilla.anticheat.inject;

import xyz.vanilla.anticheat.utility.Util;

public abstract class VanillaInjected {

	private Util util;

	public VanillaInjected() {
		this.util = new Util();
	}

	public Util getUtility() {
		return util;
	}
}
