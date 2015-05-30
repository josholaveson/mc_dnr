package messages;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;

/**
 * Created by josh on 5/30/15.
 */
public class Fishing implements Listener {

    public Mc_Main gc(){
        return (Mc_Main) Mc_Main.plugin;
    }

    @EventHandler
    public void onCast(PlayerFishEvent e){
        Player p = e.getPlayer();
        if(gc().getConfig().getBoolean(p.getDisplayName()+"fishing")== false){
            e.setCancelled(true);
            p.sendMessage(Message.M_TEXT+"you do not have a license");
        }
    }
}
