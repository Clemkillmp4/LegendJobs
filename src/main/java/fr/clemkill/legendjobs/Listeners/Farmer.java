package fr.clemkill.legendjobs.Listeners;

import fr.clemkill.legendjobs.LegendJobs;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.ArrayList;

public class Farmer implements Listener {

    ArrayList<Material> crops = new ArrayList<>();
    private double amount;

    Material melon = Material.MELON;
    Material cactus = Material.CACTUS;
    Material kelp = Material.KELP;
    Material bamboo = Material.BAMBOO;
    Material sugarc = Material.SUGAR_CANE;
    Material baies = Material.SWEET_BERRY_BUSH;
    Material beetroots = Material.BEETROOTS;
    Material pumpkin = Material.PUMPKIN;
    Material carottes = Material.CARROTS;
    Material gbaies = Material.GLOW_BERRIES;
    Material honey = Material.HONEY_BOTTLE;
    Material honeyc = Material.HONEYCOMB;
    Material wheat = Material.WHEAT;
    Material potato = Material.POTATOES;
    Material cacao = Material.COCOA_BEANS;
    Material bmush = Material.BROWN_MUSHROOM;
    Material warped = Material.WARPED_FUNGUS;
    Material rmush = Material.RED_MUSHROOM;
    Material crimson = Material.CRIMSON_FUNGUS;
    Material wart = Material.NETHER_WART;

    @EventHandler
    public void BlockBreak(BlockBreakEvent e) {

        crops.add(melon);
        //crops.add(cactus);
        //crops.add(kelp);
        //crops.add(bamboo);
        //crops.add(sugarc);
        //crops.add(baies);
        crops.add(beetroots);
        crops.add(pumpkin);
        crops.add(carottes);
        //crops.add(gbaies);
        //crops.add(honey);
        //crops.add(honeyc);
        crops.add(wheat);
        crops.add(potato);
        crops.add(cacao);
        crops.add(bmush);
        crops.add(rmush);
        crops.add(wart);

        Player player = e.getPlayer();
        Block block = e.getBlock();
        Material blocM = e.getBlock().getType();

        if (block.getType() == melon){amount = 1.0;}
        if (block.getType() == cactus){amount = 2.0;}
        if (block.getType() == kelp){amount = 1.75;}
        if (block.getType() == bamboo){amount = 0.5;}
        if (block.getType() == sugarc){amount = 0.75;}
        if (block.getType() == baies){amount = 1.5;}
        if (block.getType() == beetroots){amount = 2.0;}
        if (block.getType() == pumpkin){amount = 2.0;}
        if (block.getType() == carottes){amount = 1.25;}
        if (block.getType() == gbaies){amount = 3.0;}
        if (block.getType() == honey){amount = 3.5;}
        if (block.getType() == honeyc){amount = 3.5;}
        if (block.getType() == wheat){amount = 2.0;}
        if (block.getType() == potato){amount = 1.25;}
        if (block.getType() == cacao){amount = 4.5;}
        if (block.getType() == bmush){amount = 3.0;}
        if (block.getType() == rmush){amount = 3.0;}
        if (block.getType() == wart){amount = 2.5;}

        if (crops.contains(blocM)) {

            if (player.getGameMode() == GameMode.SURVIVAL){

                LegendJobs.PlayerData pd = LegendJobs.getInstance().getPlayerData(player.getUniqueId());
                pd.setFarmerExp(pd.getFarmerExp() + amount);

                player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(ChatColor.GRAY + "+" + ChatColor.WHITE+ amount + ChatColor.GRAY+ " exp Agriculteur"));

                if(pd.getFarmerExp() >= 100){

                    pd.setFarmerLevel(pd.getHunterLevel() + 1);
                    pd.setFarmerExp(0);
                    player.sendTitle(ChatColor.YELLOW+"Niveau Supérieur !", ChatColor.YELLOW+"Vous passez niveau "+ChatColor.GOLD+pd.getFarmerLevel()+ChatColor.YELLOW+" Agriculteur");

                }

            }

        }

    }

    @EventHandler
    public void onCollect(PlayerInteractEvent e){

        Player player = e.getPlayer();
        Block bloc = e.getClickedBlock();

        LegendJobs.PlayerData pd = LegendJobs.getInstance().getPlayerData(player.getUniqueId());

        if(bloc != null){

            if (player.getGameMode() == GameMode.SURVIVAL) {

                if (bloc.getType() == Material.SWEET_BERRY_BUSH && bloc.getBlockData().toString().contains("age=3")) {

                    amount = 1.5;
                    pd.setFarmerExp(pd.getFarmerExp() + amount);
                    player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(ChatColor.GRAY + "+" + ChatColor.WHITE + amount + ChatColor.GRAY + " exp Agriculteur"));

                }

                if (bloc.getType() == Material.CAVE_VINES_PLANT && bloc.getBlockData().toString().contains("berries=true")) {

                    amount = 3.0;
                    pd.setFarmerExp(pd.getFarmerExp() + amount);
                    player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(ChatColor.GRAY + "+" + ChatColor.WHITE + amount + ChatColor.GRAY + " exp Agriculteur"));

                }
                if ((player.getInventory().getItemInMainHand().getType() == Material.SHEARS || player.getInventory().getItemInMainHand().getType() == Material.GLASS_BOTTLE) && ((bloc.getType() == Material.BEEHIVE || bloc.getType() == Material.BEE_NEST) && bloc.getBlockData().toString().contains("honey_level=5"))) {

                    amount = 3.5;
                    pd.setFarmerExp(pd.getFarmerExp() + amount);
                    player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(ChatColor.GRAY + "+" + ChatColor.WHITE + amount + ChatColor.GRAY + " exp Agriculteur"));

                }
                if (bloc.getType() == Material.SUGAR_CANE && bloc.getBlockData().toString().contains("age=0")){

                    amount = 0.75;
                    pd.setFarmerExp(pd.getFarmerExp() + amount);
                    player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(ChatColor.GRAY + "+" + ChatColor.WHITE + amount + ChatColor.GRAY + " exp Agriculteur"));

                }
                if (bloc.getType() == Material.KELP && bloc.getBlockData().toString().contains("kelp_plant")){

                    amount = 1.75;
                    pd.setFarmerExp(pd.getFarmerExp() + amount);
                    player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(ChatColor.GRAY + "+" + ChatColor.WHITE + amount + ChatColor.GRAY + " exp Agriculteur"));

                }
                if (bloc.getType() == Material.COCOA && bloc.getBlockData().toString().contains("age=2")){

                    amount = 4.5;
                    pd.setFarmerExp(pd.getFarmerExp() + amount);
                    player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(ChatColor.GRAY + "+" + ChatColor.WHITE + amount + ChatColor.GRAY + " exp Agriculteur"));

                }
                if (bloc.getType() == Material.CACTUS && bloc.getBlockData().toString().contains("age=0")){

                    amount = 2.0;
                    pd.setFarmerExp(pd.getFarmerExp() + amount);
                    player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(ChatColor.GRAY + "+" + ChatColor.WHITE + amount + ChatColor.GRAY + " exp Agriculteur"));

                }

            }
        }

        if (pd.getFarmerExp() >= 100) {

            pd.setFarmerLevel(pd.getHunterLevel() + 1);
            pd.setFarmerExp(0);
            player.sendTitle(ChatColor.YELLOW + "Niveau Supérieur !", ChatColor.YELLOW + "Vous passez niveau " + ChatColor.GOLD + pd.getFarmerLevel() + ChatColor.YELLOW + " Agriculteur");

        }

    }

}
