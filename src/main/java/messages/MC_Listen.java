package messages;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * Created by josh on 5/29/15.
 */
public class MC_Listen implements Listener {

    private Mc_Main gc(){
        return (Mc_Main) Mc_Main.plugin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player joiner = event.getPlayer();
        gc().getConfig().set(joiner.getDisplayName()+"fishing", false);
        gc().saveConfig();

        if(gc().getConfig().getBoolean(joiner.getDisplayName()+"fishing" , true)) {

            gc().getConfig().set(joiner.getDisplayName() + "fishing:", true);
            gc().saveConfig();

        }else {
            gc().getConfig().addDefault(joiner.getDisplayName()+"fishing:", false);
            gc().saveConfig();

        }
    }
}
