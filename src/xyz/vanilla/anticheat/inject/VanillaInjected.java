package xyz.vanilla.anticheat.inject;


import xyz.vanilla.anticheat.Vanilla;
import xyz.vanilla.anticheat.utility.Util;

public abstract class VanillaInjected
{
    private Vanilla plugin;
    private Util util;

    public VanillaInjected(Vanilla plugin)
    {
        this.plugin = plugin;
        this.util = new Util();
    }

    public Vanilla getInstance()
    {
        return plugin;
    }

    public Util getUtility()
    {
        return util;
    }
}
