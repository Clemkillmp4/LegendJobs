package fr.clemkill.legendjobs.Listeners;

import fr.clemkill.legendjobs.LegendJobs;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockCookEvent;
import org.bukkit.event.inventory.FurnaceExtractEvent;
import org.bukkit.event.inventory.FurnaceSmeltEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import java.util.ArrayList;
import java.util.List;

public class Miner implements Listener {

    private List<Material> blocs = new ArrayList<>();
    private List<Material> crops = new ArrayList<>();
    private List<Material> smeltable = new ArrayList<>();
    private double amount;

    Material roche = Material.STONE;
    Material iron = Material.IRON_ORE;
    Material diron = Material.DEEPSLATE_IRON_ORE;
    Material copper = Material.COPPER_ORE;
    Material dcopper = Material.DEEPSLATE_COPPER_ORE;
    Material coal = Material.COAL_ORE;
    Material dcoal = Material.DEEPSLATE_COAL_ORE;
    Material debris = Material.ANCIENT_DEBRIS;
    Material redstone = Material.REDSTONE_ORE;
    Material dredstone = Material.DEEPSLATE_REDSTONE_ORE;
    Material gold = Material.GOLD_ORE;
    Material dgold = Material.DEEPSLATE_GOLD_ORE;
    Material lapis = Material.LAPIS_ORE;
    Material dlapis = Material.DEEPSLATE_LAPIS_ORE;
    Material nrack = Material.NETHERRACK;
    Material quartz = Material.QUARTZ;
    Material nor = Material.NETHER_GOLD_ORE;
    Material diams = Material.DIAMOND_ORE;
    Material ddiams = Material.DEEPSLATE_DIAMOND_ORE;
    Material emeraude = Material.EMERALD_ORE;
    Material demeraude = Material.DEEPSLATE_EMERALD_ORE;


    Material riron = Material.RAW_IRON;
    Material rcopper = Material.RAW_COPPER;
    Material rgold = Material.RAW_GOLD;

    @EventHandler
    public void BlockBreak(BlockBreakEvent e) {

        blocs.add(roche);
        blocs.add(iron);
        blocs.add(diron);
        blocs.add(copper);
        blocs.add(dcopper);
        blocs.add(coal);
        blocs.add(dcoal);
        blocs.add(debris);
        blocs.add(redstone);
        blocs.add(dredstone);
        blocs.add(gold);
        blocs.add(dgold);
        blocs.add(lapis);
        blocs.add(dlapis);
        blocs.add(nrack);
        blocs.add(quartz);
        blocs.add(nor);
        blocs.add(diams);
        blocs.add(ddiams);
        blocs.add(emeraude);
        blocs.add(demeraude);

        Player player = e.getPlayer();

        Material block_mine = e.getBlock().getType();
        Block block = e.getBlock();

        if (block_mine == roche){amount = 0.5;}
        if (block_mine == iron){amount = 2.0;}
        if (block_mine == diron){amount = 2.5;}
        if (block_mine == copper){amount = 1.0;}
        if (block_mine == dcopper){amount = 1.5;}
        if (block_mine == coal){amount = 1.0;}
        if (block_mine == dcoal){amount = 1.5;}
        if (block_mine == debris){amount = 5.0;}
        if (block_mine == redstone){amount = 2.0;}
        if (block_mine == dredstone){amount = 2.5;}
        if (block_mine == gold){amount = 3.0;}
        if (block_mine == dgold){amount = 3.5;}
        if (block_mine == lapis){amount = 2.0;}
        if (block_mine == dlapis){amount = 2.5;}
        if (block_mine == nrack){amount = 0.5;}
        if (block_mine == quartz){amount = 3.0;}
        if (block_mine == nor){amount = 3.0;}
        if (block_mine == diams){amount = 4.0;}
        if (block_mine == ddiams){amount = 4.5;}
        if (block_mine == emeraude){amount = 5.0;}
        if (block_mine == demeraude){amount = 5.5;}


        if (blocs.contains(block_mine)) {

            if (player.getGameMode() == GameMode.SURVIVAL){
                LegendJobs.PlayerData pd = LegendJobs.getInstance().getPlayerData(player.getUniqueId());
                pd.setMinerExp(pd.getminerExp() + amount);

                player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(ChatColor.GRAY + "+" + ChatColor.WHITE+ amount + ChatColor.GRAY+ " exp Mineur"));

                if(pd.getminerExp() >= 100){

                    pd.setMinerLevel(pd.getHunterLevel() + 1);
                    pd.setMinerExp(0);
                    player.sendTitle(ChatColor.YELLOW+"Niveau Supérieur !", ChatColor.YELLOW+"Vous passez niveau "+ChatColor.GOLD+pd.getMinerLevel()+ChatColor.YELLOW+" Mineur  ");

                }

            }

        }

    }

    @EventHandler
    public void onSmeltOre(FurnaceExtractEvent e){

        smeltable.add(riron);
        smeltable.add(rcopper);
        smeltable.add(rgold);

        Material blockcooked = e.getBlock().getType();
        Player player = (Player) e.getPlayer();

        if (blockcooked == riron){amount = 1.0;}
        if (blockcooked == rcopper){amount = 1.0;}
        if (blockcooked == rgold){amount = 1.0;}

        if(smeltable.contains(blockcooked)){

            if (player.getGameMode() == GameMode.SURVIVAL){
                LegendJobs.PlayerData pd = LegendJobs.getInstance().getPlayerData(player.getUniqueId());
                pd.setMinerExp(pd.getminerExp() + amount);

                player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(ChatColor.GRAY + "+" + ChatColor.WHITE+ amount + ChatColor.GRAY+ " exp Mineur"));

                if(pd.getminerExp() >= 100){

                    pd.setMinerExp(0);
                    pd.setMinerLevel(pd.getFishLevel() + 1);
                    player.sendTitle(ChatColor.YELLOW+"Niveau Supérieur !", ChatColor.YELLOW+"Vous passez niveau "+ChatColor.GOLD+pd.getMinerLevel()+ChatColor.YELLOW+" Mineur");

                }

            }

        }

    }

}
