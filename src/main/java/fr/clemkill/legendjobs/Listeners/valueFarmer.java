package fr.clemkill.legendjobs.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
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

import java.util.List;

public class valueFarmer implements Listener {

    public String invinfo = ChatColor.BLACK+"Infos métiers";
    public String invFarmer = ChatColor.DARK_GREEN+"Agriculteur";

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {

        int slot = e.getSlot();
        Player player = (Player) e.getWhoClicked();

        if(e.getView().getTitle().equals(invFarmer)){

            e.setCancelled(true);

        }

        Inventory index_farmer = Bukkit.createInventory(player, 54, invFarmer);

        ItemStack melon = new ItemStack(Material.MELON);
        ItemMeta melonMeta = melon.getItemMeta();
        melonMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Récolter une" + ChatColor.GOLD + " Pastèque" + ChatColor.YELLOW + " donne 1.0 exp", ChatColor.GRAY + "------------------------------"));
        melon.setItemMeta(melonMeta);

        ItemStack cactus = new ItemStack(Material.CACTUS);
        ItemMeta cactusMeta = cactus.getItemMeta();
        cactusMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Récolter un" + ChatColor.GOLD + " Cactus" + ChatColor.YELLOW + " donne 2.0 exp", ChatColor.GRAY + "------------------------------"));
        cactus.setItemMeta(cactusMeta);

        ItemStack kelp = new ItemStack(Material.KELP);
        ItemMeta kelpMeta = kelp.getItemMeta();
        kelpMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Récolter une" + ChatColor.GOLD + " Algue" + ChatColor.YELLOW + " donne 1.75 exp", ChatColor.GRAY + "------------------------------"));
        kelp.setItemMeta(kelpMeta);

        ItemStack bamboo = new ItemStack(Material.BAMBOO);
        ItemMeta bambooMeta = bamboo.getItemMeta();
        bambooMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Récolter un" + ChatColor.GOLD + " Bambou" + ChatColor.YELLOW + " donne 0.5 exp", ChatColor.GRAY + "------------------------------"));
        bamboo.setItemMeta(bambooMeta);

        ItemStack sugarc = new ItemStack(Material.SUGAR_CANE);
        ItemMeta sugarcMeta = sugarc.getItemMeta();
        sugarcMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Récolter une" + ChatColor.GOLD + " Canne à sucre" + ChatColor.YELLOW + " donne 0.75 exp", ChatColor.GRAY + "------------------------------"));
        sugarc.setItemMeta(sugarcMeta);

        ItemStack baies = new ItemStack(Material.SWEET_BERRIES);
        ItemMeta baiesMeta = baies.getItemMeta();
        baiesMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Récolter une" + ChatColor.GOLD + " Baie" + ChatColor.YELLOW + " donne 1.5 exp", ChatColor.GRAY + "------------------------------"));
        baies.setItemMeta(baiesMeta);

        ItemStack beetroots = new ItemStack(Material.BEETROOT);
        ItemMeta beetrootsMeta = beetroots.getItemMeta();
        beetrootsMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Récolter une" + ChatColor.GOLD + " Betterave" + ChatColor.YELLOW + " donne 2.0 exp", ChatColor.GRAY + "------------------------------"));
        beetroots.setItemMeta(beetrootsMeta);

        ItemStack pumpkin = new ItemStack(Material.PUMPKIN);
        ItemMeta pumpkinMeta = pumpkin.getItemMeta();
        pumpkinMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Récolter une" + ChatColor.GOLD + " Citrouille" + ChatColor.YELLOW + " donne 2.0 exp", ChatColor.GRAY + "------------------------------"));
        pumpkin.setItemMeta(pumpkinMeta);

        ItemStack carottes = new ItemStack(Material.CARROT);
        ItemMeta carottesMeta = carottes.getItemMeta();
        carottesMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Récolter une" + ChatColor.GOLD + " Carotte" + ChatColor.YELLOW + " donne 1.25 exp", ChatColor.GRAY + "------------------------------"));
        carottes.setItemMeta(carottesMeta);

        ItemStack gbaies = new ItemStack(Material.GLOW_BERRIES);
        ItemMeta gbaiesMeta = gbaies.getItemMeta();
        gbaiesMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Récolter une" + ChatColor.GOLD + " Baie lumineuse" + ChatColor.YELLOW + " donne 3.0 exp", ChatColor.GRAY + "------------------------------"));
        gbaies.setItemMeta(gbaiesMeta);

        ItemStack honey = new ItemStack(Material.HONEY_BOTTLE);
        ItemMeta honeyMeta = honey.getItemMeta();
        honeyMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Récolter une" + ChatColor.GOLD + " Fiole de miel" + ChatColor.YELLOW + " donne 3.5 exp", ChatColor.GRAY + "------------------------------"));
        honey.setItemMeta(honeyMeta);

        ItemStack honeyc = new ItemStack(Material.HONEYCOMB);
        ItemMeta honeycMeta = honeyc.getItemMeta();
        honeycMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Récolter un" + ChatColor.GOLD + " Rayon de miel" + ChatColor.YELLOW + " donne 3.5 exp", ChatColor.GRAY + "------------------------------"));
        honeyc.setItemMeta(honeycMeta);

        ItemStack wheat = new ItemStack(Material.WHEAT);
        ItemMeta wheatMeta = wheat.getItemMeta();
        wheatMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Récolter un" + ChatColor.GOLD + " Blé" + ChatColor.YELLOW + " donne 2.0 exp", ChatColor.GRAY + "------------------------------"));
        wheat.setItemMeta(wheatMeta);

        ItemStack potato = new ItemStack(Material.POTATO);
        ItemMeta potatoMeta = potato.getItemMeta();
        potatoMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Récolter une" + ChatColor.GOLD + " Patate" + ChatColor.YELLOW + " donne 1.25 exp", ChatColor.GRAY + "------------------------------"));
        potato.setItemMeta(potatoMeta);

        ItemStack cacao = new ItemStack(Material.COCOA_BEANS);
        ItemMeta cacaoMeta = cacao.getItemMeta();
        cacaoMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Récolter du" + ChatColor.GOLD + " Cacao" + ChatColor.YELLOW + " donne 4.5 exp", ChatColor.GRAY + "------------------------------"));
        cacao.setItemMeta(cacaoMeta);

        ItemStack bmush = new ItemStack(Material.BROWN_MUSHROOM);
        ItemMeta bmushMeta = bmush.getItemMeta();
        bmushMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Récolter un" + ChatColor.GOLD + " Champignon brun" + ChatColor.YELLOW + " donne 3.0 exp", ChatColor.GRAY + "------------------------------"));
        bmush.setItemMeta(bmushMeta);

        ItemStack warped = new ItemStack(Material.WARPED_FUNGUS);
        ItemMeta warpedMeta = warped.getItemMeta();
        warpedMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Récolter un" + ChatColor.GOLD + " Warped fungus" + ChatColor.YELLOW + " donne 4.0 exp", ChatColor.GRAY + "------------------------------"));
        warped.setItemMeta(warpedMeta);

        ItemStack rmush = new ItemStack(Material.RED_MUSHROOM);
        ItemMeta rmushMeta = rmush.getItemMeta();
        rmushMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Récolter un" + ChatColor.GOLD + " Champignon rouge" + ChatColor.YELLOW + " donne 3.0 exp", ChatColor.GRAY + "------------------------------"));
        rmush.setItemMeta(rmushMeta);

        ItemStack crimson = new ItemStack(Material.CRIMSON_FUNGUS);
        ItemMeta crimsonMeta = crimson.getItemMeta();
        crimsonMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Récolter un" + ChatColor.GOLD + " Crimson stem" + ChatColor.YELLOW + " donne 4.0 exp", ChatColor.GRAY + "------------------------------"));
        crimson.setItemMeta(crimsonMeta);

        ItemStack wart = new ItemStack(Material.NETHER_WART);
        ItemMeta wartMeta = wart.getItemMeta();
        wartMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Récolter une" + ChatColor.GOLD + " Verrue du nether" + ChatColor.YELLOW + " donne 2.5 exp", ChatColor.GRAY + "------------------------------"));
        wart.setItemMeta(wartMeta);

        ItemStack retour = new ItemStack(Material.BARRIER);
        ItemMeta retourmeta = retour.getItemMeta();
        retourmeta.setDisplayName(ChatColor.RED+"Retour");
        retour.setItemMeta(retourmeta);

        index_farmer.setItem(10, melon);
        index_farmer.setItem(11, cactus);
        index_farmer.setItem(12, kelp);
        index_farmer.setItem(13, bamboo);
        index_farmer.setItem(14, sugarc);
        index_farmer.setItem(15, baies);
        index_farmer.setItem(16, beetroots);
        index_farmer.setItem(19, pumpkin);
        index_farmer.setItem(20, carottes);
        index_farmer.setItem(21, gbaies);
        index_farmer.setItem(22, honey);
        index_farmer.setItem(23, honeyc);
        index_farmer.setItem(24, wheat);
        index_farmer.setItem(25, potato);
        index_farmer.setItem(28, cacao);
        index_farmer.setItem(29, bmush);
        index_farmer.setItem(30, rmush);
        index_farmer.setItem(31, wart);
        index_farmer.setItem(49, retour);

        if(e.getView().getTitle().equals(invFarmer) && e.getSlot() == 49){

            e.setCancelled(true);
            player.closeInventory();

        }

        if (e.getView().getTitle().equals(invinfo) && slot == 14) { // Slot HUNTER

            player.openInventory(index_farmer);

        }

    }

}