package fr.clemkill.legendjobs.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

public class valuesCmd implements CommandExecutor, Listener {

    public String invinfo = ChatColor.BLACK+"Infos métiers";


    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {

        if (e.getView().getTitle().equals(invinfo)) {

            e.setCancelled(true);

        }

    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player player = (Player) sender;

        if (sender instanceof Player) {

            Inventory gui = Bukkit.createInventory(player, 27, invinfo);

            ItemStack Hunter = new ItemStack(Material.IRON_SWORD);
            ItemMeta mhunter = Hunter.getItemMeta();
            mhunter.setDisplayName(ChatColor.WHITE+"Atlas du Chasseur");
            Hunter.setItemMeta(mhunter);

            ItemStack Miner = new ItemStack(Material.IRON_PICKAXE);
            ItemMeta mMiner = Miner.getItemMeta();
            mMiner.setDisplayName(ChatColor.WHITE+"Magazine du Mineur");
            Miner.setItemMeta(mMiner);

            ItemStack LumberJack = new ItemStack(Material.IRON_AXE);
            ItemMeta mLJ = LumberJack.getItemMeta();
            mLJ.setDisplayName(ChatColor.WHITE+"Catalogue du Bûcheron");
            LumberJack.setItemMeta(mLJ);

            ItemStack Farmer = new ItemStack(Material.IRON_HOE);
            ItemMeta mFarmer = Farmer.getItemMeta();
            mFarmer.setDisplayName(ChatColor.WHITE+"Journal du Fermier");
            Farmer.setItemMeta(mFarmer);

            ItemStack Fisherman = new ItemStack(Material.FISHING_ROD);
            ItemMeta mFman = Fisherman.getItemMeta();
            mFman.setDisplayName(ChatColor.WHITE+"Carnet du Pêcheur");
            Fisherman.setItemMeta(mFman);

            gui.setItem(11, Hunter);
            gui.setItem(12, Miner);
            gui.setItem(13, LumberJack);
            gui.setItem(14, Farmer);
            gui.setItem(15, Fisherman);

            player.openInventory(gui);

        }

        return true;
    }

}