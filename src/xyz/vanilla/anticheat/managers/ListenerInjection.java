package xyz.vanilla.anticheat.managers;

import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import xyz.vanilla.anticheat.Vanilla;
import xyz.vanilla.anticheat.inject.VanillaInjected;

public class ListenerInjection extends VanillaInjected
{

    public ListenerInjection(Vanilla plugin)
    {
        super(plugin);
    }

    public void injectListeners(Listener... listeners)
    {
        try
        {
            PluginManager pluginManager = getInstance().getServer().getPluginManager();

            for (Listener listener : listeners)
            {
                pluginManager.registerEvents(listener, getInstance());
            }

        } catch (Exception e)
        {
            System.out.println("[V]: Error while Injecting the Listeners");
        }
    }

}
