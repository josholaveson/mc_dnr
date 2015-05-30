package messages;

import messages.MC_Listen;
import messages.Message;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by josh on 5/29/15.
 */
public class Mc_Main  extends JavaPlugin{

    public static Plugin plugin = null;

    @Override
    public void onEnable() {
        plugin = this;
        getLogger().info(Message.NC_PREFIX+"enabled");
        getServer().getPluginManager().registerEvents(new MC_Listen(), this);
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

    @Override
    public void onDisable() {
        plugin = null;
    }
}

