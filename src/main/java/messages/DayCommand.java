package messages;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by josh on 5/30/15.
 */
public class DayCommand implements CommandExecutor {

    public Mc_Main getPlugin(){
        return (Mc_Main) Mc_Main.plugin;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player p = (Player) sender;

        if(cmd.getName().equalsIgnoreCase("day")){
            if(p.hasPermission("day.use")){
                p.sendMessage(Message.M_TEXT +"thank you for purchasing a day license");
                getPlugin().getConfig().set(p.getDisplayName()+"fishing", true);
                getPlugin().saveConfig();

                if(args.length == 1){
                    if (args[0].equalsIgnoreCase("remove")){
                        getPlugin().getConfig().set(p.getDisplayName()+"fishing", false);
                        getPlugin().saveConfig();
                    }
                }
            }
        }


        return true;
    }
}
