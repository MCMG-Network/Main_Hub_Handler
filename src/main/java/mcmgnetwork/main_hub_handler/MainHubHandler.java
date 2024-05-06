package mcmgnetwork.main_hub_handler;

import mcmgnetwork.main_hub_handler.Listeners.PlayerGriefPrevention;
import mcmgnetwork.main_hub_handler.Listeners.VoidHandler;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class MainHubHandler extends JavaPlugin {

    @Override
    public void onEnable()
    {
        // Register event listeners/handlers
        PluginManager pluginManager = getServer().getPluginManager();
        pluginManager.registerEvents(new PlayerGriefPrevention(), this);
        pluginManager.registerEvents(new VoidHandler(), this);

        // Set world game rules/attributes
        PlayerGriefPrevention.setGameRules();
        HubProperties.setGameRules();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
