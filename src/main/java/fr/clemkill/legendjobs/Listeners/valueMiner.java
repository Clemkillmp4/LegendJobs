package fr.clemkill.legendjobs.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class valueMiner implements Listener {

    public String invinfo = ChatColor.BLACK + "Infos métiers";
    public String invMin = ChatColor.BLACK + "Mineur";

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {

        int slot = e.getSlot();
        Player player = (Player) e.getWhoClicked();

        if (e.getView().getTitle().equals(invMin)) {

            e.setCancelled(true);

        }

        if(e.getView().getTitle().equals(invMin) && slot == 49) { // Slot RETOUR

            e.setCancelled(true);
            player.closeInventory();

        }

        if (e.getView().getTitle().equals(invinfo) && slot == 12) {

            ItemStack stone = new ItemStack(Material.STONE);
            ItemMeta stoneMeta = stone.getItemMeta();
            stoneMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Miner de la" + ChatColor.GOLD + " Roche" + ChatColor.YELLOW + " donne 0.5 exp", ChatColor.GRAY + "------------------------------"));
            stone.setItemMeta(stoneMeta);

            ItemStack iron = new ItemStack(Material.IRON_ORE);
            ItemMeta ironMeta = iron.getItemMeta();
            ironMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Miner un" + ChatColor.GOLD + " Minerai de fer" + ChatColor.YELLOW + " donne 2.0 exp", ChatColor.GRAY + "------------------------------"));
            iron.setItemMeta(ironMeta);

            ItemStack diron = new ItemStack(Material.DEEPSLATE_IRON_ORE);
            ItemMeta dironMeta = diron.getItemMeta();
            dironMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Miner un" + ChatColor.GOLD + " Minerai de fer des abîmes" + ChatColor.YELLOW + " donne 2.5 exp", ChatColor.GRAY + "------------------------------"));
            diron.setItemMeta(dironMeta);

            ItemStack copper = new ItemStack(Material.COPPER_ORE);
            ItemMeta copperMeta = copper.getItemMeta();
            copperMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Miner un" + ChatColor.GOLD + " Minerai de cuivre" + ChatColor.YELLOW + " donne 1.0 exp", ChatColor.GRAY + "------------------------------"));
            copper.setItemMeta(copperMeta);

            ItemStack dcopper = new ItemStack(Material.DEEPSLATE_COPPER_ORE);
            ItemMeta dcopperMeta = dcopper.getItemMeta();
            dcopperMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Miner un" + ChatColor.GOLD + " Minerai de cuivre des abîmes" + ChatColor.YELLOW + " donne 1.5 exp", ChatColor.GRAY + "------------------------------"));
            dcopper.setItemMeta(dcopperMeta);

            ItemStack coal = new ItemStack(Material.COAL_ORE);
            ItemMeta coalMeta = coal.getItemMeta();
            coalMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Miner un" + ChatColor.GOLD + " Minerai de charbon" + ChatColor.YELLOW + " donne 1.0 exp", ChatColor.GRAY + "------------------------------"));
            coal.setItemMeta(coalMeta);

            ItemStack dcoal = new ItemStack(Material.DEEPSLATE_COAL_ORE);
            ItemMeta dcoalMeta = dcoal.getItemMeta();
            dcoalMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Miner un" + ChatColor.GOLD + " Minerai de charbon des abîmes" + ChatColor.YELLOW + " donne 1.5 exp", ChatColor.GRAY + "------------------------------"));
            dcoal.setItemMeta(dcoalMeta);

            ItemStack netherite = new ItemStack(Material.ANCIENT_DEBRIS);
            ItemMeta netheriteMeta = netherite.getItemMeta();
            netheriteMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Miner des" + ChatColor.GOLD + " Débris antiques" + ChatColor.YELLOW + " donne 5.0 exp", ChatColor.GRAY + "------------------------------"));
            netherite.setItemMeta(netheriteMeta);

            ItemStack redstone = new ItemStack(Material.REDSTONE_ORE);
            ItemMeta redstoneMeta = redstone.getItemMeta();
            redstoneMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Miner un" + ChatColor.GOLD + " Minerai de redstone" + ChatColor.YELLOW + " donne 2.0 exp", ChatColor.GRAY + "------------------------------"));
            redstone.setItemMeta(redstoneMeta);

            ItemStack dredstone = new ItemStack(Material.DEEPSLATE_REDSTONE_ORE);
            ItemMeta dredstoneMeta = dredstone.getItemMeta();
            dredstoneMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Miner un" + ChatColor.GOLD + " Minerai de redstone des abîmes" + ChatColor.YELLOW + " donne 2.5 exp", ChatColor.GRAY + "------------------------------"));
            dredstone.setItemMeta(dredstoneMeta);

            //OR
            ItemStack or = new ItemStack(Material.GOLD_ORE);
            ItemMeta orMeta = or.getItemMeta();
            orMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Miner un" + ChatColor.GOLD + " Minerai d'or'" + ChatColor.YELLOW + " donne 3.0 exp", ChatColor.GRAY + "------------------------------"));
            or.setItemMeta(orMeta);

            ItemStack dor = new ItemStack(Material.DEEPSLATE_GOLD_ORE);
            ItemMeta dorMeta = dor.getItemMeta();
            dorMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Miner un" + ChatColor.GOLD + " Minerai d'or' des abîmes" + ChatColor.YELLOW + " donne 3.5 exp", ChatColor.GRAY + "------------------------------"));
            dor.setItemMeta(dorMeta);

            //LAPIS
            ItemStack lapis = new ItemStack(Material.LAPIS_ORE);
            ItemMeta lapisMeta = lapis.getItemMeta();
            lapisMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Miner un" + ChatColor.GOLD + " Minerai de lapis-lazuli" + ChatColor.YELLOW + " donne 2.0 exp", ChatColor.GRAY + "------------------------------"));
            lapis.setItemMeta(lapisMeta);

            ItemStack dlapis = new ItemStack(Material.DEEPSLATE_LAPIS_ORE);
            ItemMeta dlapisMeta = dlapis.getItemMeta();
            dlapisMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Miner un" + ChatColor.GOLD + " Minerai de lapis-lazuli des abîmes" + ChatColor.YELLOW + " donne 2.5 exp", ChatColor.GRAY + "------------------------------"));
            dlapis.setItemMeta(dlapisMeta);

            //NETHERRACK
            ItemStack netherrack = new ItemStack(Material.NETHERRACK);
            ItemMeta netherrackMeta = netherrack.getItemMeta();
            netherrackMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Miner un" + ChatColor.GOLD + " Roche du nether" + ChatColor.YELLOW + " donne 0.5 exp", ChatColor.GRAY + "------------------------------"));
            netherrack.setItemMeta(netherrackMeta);

            //QUARTZ
            ItemStack quartz = new ItemStack(Material.NETHER_QUARTZ_ORE);
            ItemMeta quartzMeta = quartz.getItemMeta();
            quartzMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Miner un" + ChatColor.GOLD + " Minerai de quartz du nether" + ChatColor.YELLOW + " donne 3.0 exp", ChatColor.GRAY + "------------------------------"));
            quartz.setItemMeta(quartzMeta);

            //NETHERGOLD
            ItemStack ngold = new ItemStack(Material.NETHER_GOLD_ORE);
            ItemMeta ngoldMeta = ngold.getItemMeta();
            ngoldMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Miner un" + ChatColor.GOLD + " Minerai d'or du nether" + ChatColor.YELLOW + " donne 3.0 exp", ChatColor.GRAY + "------------------------------"));
            ngold.setItemMeta(ngoldMeta);

            //DIAMANT
            ItemStack diams = new ItemStack(Material.DIAMOND_ORE);
            ItemMeta diamsMeta = diams.getItemMeta();
            diamsMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Miner un" + ChatColor.GOLD + " Minerai de diamant" + ChatColor.YELLOW + " donne 4.0 exp", ChatColor.GRAY + "------------------------------"));
            diams.setItemMeta(diamsMeta);

            ItemStack ddiams = new ItemStack(Material.DEEPSLATE_DIAMOND_ORE);
            ItemMeta ddiamsMeta = ddiams.getItemMeta();
            ddiamsMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Miner un" + ChatColor.GOLD + " Minerai de diamant des abîmes" + ChatColor.YELLOW + " donne 4.5 exp", ChatColor.GRAY + "------------------------------"));
            ddiams.setItemMeta(ddiamsMeta);

            //EMERAUDE
            ItemStack emeraude = new ItemStack(Material.EMERALD_ORE);
            ItemMeta emeraudeMeta = emeraude.getItemMeta();
            emeraudeMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Miner un" + ChatColor.GOLD + " Minerai d'émeraude" + ChatColor.YELLOW + " donne 5.0 exp", ChatColor.GRAY + "------------------------------"));
            emeraude.setItemMeta(emeraudeMeta);

            ItemStack demeraude = new ItemStack(Material.DEEPSLATE_EMERALD_ORE);
            ItemMeta demeraudeMeta = demeraude.getItemMeta();
            demeraudeMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Miner un" + ChatColor.GOLD + " Minerai d'émeraude des abîmes" + ChatColor.YELLOW + " donne 5.5 exp", ChatColor.GRAY + "------------------------------"));
            demeraude.setItemMeta(demeraudeMeta);


            ItemStack retour = new ItemStack(Material.BARRIER);
            ItemMeta retourmeta = retour.getItemMeta();
            retourmeta.setDisplayName(ChatColor.RED + "Retour");
            retour.setItemMeta(retourmeta);

            ItemStack furnace = new ItemStack(Material.BLAST_FURNACE);
            ItemMeta furnaceMeta = furnace.getItemMeta();
            furnaceMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.GREEN + "Cuire tout ces minerais vous rapporte", ChatColor.GREEN + "1.0 exp supplémentaires", ChatColor.GRAY + "------------------------------", ChatColor.RED + "Attention : Sauf pour la stone", ChatColor.GRAY + "------------------------------"));
            furnace.setItemMeta(furnaceMeta);

            Inventory index_miner = Bukkit.createInventory(player, 54, invMin);

            index_miner.setItem(10, stone);
            index_miner.setItem(11, iron);
            index_miner.setItem(12, diron);
            index_miner.setItem(13, copper);
            index_miner.setItem(14, dcopper);
            index_miner.setItem(15, coal);
            index_miner.setItem(16, dcoal);

            index_miner.setItem(19, netherite);
            index_miner.setItem(20, redstone);
            index_miner.setItem(21, dredstone);
            index_miner.setItem(22, or);
            index_miner.setItem(23, dor);
            index_miner.setItem(24, lapis);
            index_miner.setItem(25, dlapis);

            index_miner.setItem(28, netherrack);
            index_miner.setItem(29, quartz);
            index_miner.setItem(30, ngold);
            index_miner.setItem(31, diams);
            index_miner.setItem(32, ddiams);
            index_miner.setItem(33, emeraude);
            index_miner.setItem(34, demeraude);

            index_miner.setItem(49, retour);
            index_miner.setItem(53, furnace);

            player.openInventory(index_miner);

        }
    }
}