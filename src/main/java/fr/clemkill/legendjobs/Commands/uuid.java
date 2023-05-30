package fr.clemkill.legendjobs.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Arrays;

import static org.bukkit.Bukkit.getServer;

public class uuid implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){

        Player player = (Player) sender;

        if (sender instanceof Player){

            if (args.length == 1){

                Player target = getServer().getPlayer(args[0]);

                if(target != null){

                    player.sendMessage("UUID de "+ target.getName() +": "+ ChatColor.YELLOW+target.getUniqueId().toString());

                } else {
                    player.sendMessage("Le joueur n'a pas été trouvé");
                }
            } else {

                player.sendMessage("Il manque un argument : /uuid <joueur>");

            }


        }

        return true;
    }

}
