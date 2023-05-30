package fr.clemkill.legendjobs.Listeners;
import fr.clemkill.legendjobs.LegendJobs;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import java.util.ArrayList;
import java.util.List;

public class LumberJack implements Listener {

    private List<Material> blocs = new ArrayList<Material>();
    private double amount;

    @EventHandler
    public void BlockBreak(BlockBreakEvent e) {

        Player player = e.getPlayer();

        Material oak = Material.OAK_LOG;
        Material birch = Material.BIRCH_LOG;
        Material spruce = Material.SPRUCE_LOG;
        Material dark = Material.DARK_OAK_LOG;
        Material paletuvier = Material.MANGROVE_LOG;
        Material crimson = Material.CRIMSON_STEM;
        Material jungle = Material.JUNGLE_LOG;
        Material acacia = Material.ACACIA_LOG;
        Material warped = Material.WARPED_STEM;
        Material roots = Material.MANGROVE_ROOTS;

        blocs.add(oak);
        blocs.add(birch);
        blocs.add(spruce);
        blocs.add(dark);
        blocs.add(paletuvier);
        blocs.add(crimson);
        blocs.add(jungle);
        blocs.add(acacia);
        blocs.add(warped);
        blocs.add(roots);

        Material block_mine = e.getBlock().getType();

        if (block_mine == oak){amount = 1.0;}
        if (block_mine == birch){amount = 1.0;}
        if (block_mine == spruce){amount = 1.0;}
        if (block_mine == dark){amount = 1.0;}
        if (block_mine == acacia){amount = 1.0;}
        if (block_mine == jungle){amount = 1.0;}
        if (block_mine == crimson){amount = 2.0;}
        if (block_mine == warped){amount = 2.0;}
        if (block_mine == paletuvier){amount = 2.5;}
        if (block_mine == roots){amount = 0.5;}

        if (blocs.contains(block_mine)) {

            if (player.getGameMode() == GameMode.SURVIVAL){

                LegendJobs.PlayerData pd = LegendJobs.getInstance().getPlayerData(player.getUniqueId());
                pd.setLumberjackExp(pd.getLumberjackExp() + amount);
                player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(ChatColor.GRAY + "+" + ChatColor.WHITE+ amount + ChatColor.GRAY+ " exp Bûcheron"));

                if(pd.getLumberjackExp() >= 100){

                    pd.setLumberjackExp(0);
                    pd.setLumberJackLevel(pd.getFishLevel() + 1);
                    player.sendTitle(ChatColor.YELLOW+"Niveau Supérieur !", ChatColor.YELLOW+"Vous passez niveau "+ChatColor.GOLD+pd.getlumberjackLevel()+ChatColor.YELLOW+" Bûcheron");

                }

            }

        }

    }

}
