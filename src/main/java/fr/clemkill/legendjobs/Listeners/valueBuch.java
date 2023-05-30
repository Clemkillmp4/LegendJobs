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

public class valueBuch implements Listener {

    public String invBuch = ChatColor.DARK_GREEN + "Bûcheron";
    public String invinfo = ChatColor.BLACK+"Infos métiers";

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e){

        int slot = e.getSlot();
        Player player = (Player) e.getWhoClicked();

        if (e.getView().getTitle().equals(invBuch)) {

            e.setCancelled(true);

            if(slot == 40) {

                player.closeInventory();
                e.setCancelled(true);

            }

        }

        if(e.getView().getTitle().equals(invinfo) && slot == 13){

            ItemStack oak = new ItemStack(Material.OAK_LOG);
            ItemMeta oakmeta = oak.getItemMeta();
            oakmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Casser une" + ChatColor.GOLD + " Bûche de chêne" + ChatColor.YELLOW + " donne 1.0 exp", ChatColor.GRAY + "------------------------------"));
            oak.setItemMeta(oakmeta);

            ItemStack birch = new ItemStack(Material.BIRCH_LOG);
            ItemMeta birchmeta = birch.getItemMeta();
            birchmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Casser une" + ChatColor.GOLD + " Bûche de bouleau" + ChatColor.YELLOW + " donne 1.0 exp", ChatColor.GRAY + "------------------------------"));
            birch.setItemMeta(birchmeta);

            ItemStack spruce = new ItemStack(Material.SPRUCE_LOG);
            ItemMeta sprucemeta = spruce.getItemMeta();
            sprucemeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Casser une" + ChatColor.GOLD + " Bûche de sapin" + ChatColor.YELLOW + " donne 1.0 exp", ChatColor.GRAY + "------------------------------"));
            spruce.setItemMeta(sprucemeta);

            ItemStack dark = new ItemStack(Material.DARK_OAK_LOG);
            ItemMeta darkmeta = dark.getItemMeta();
            darkmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Casser une" + ChatColor.GOLD + " Bûche de chêne noir" + ChatColor.YELLOW + " donne 1.0 exp", ChatColor.GRAY + "------------------------------"));
            dark.setItemMeta(darkmeta);

            ItemStack acacia = new ItemStack(Material.ACACIA_LOG);
            ItemMeta acaciameta = acacia.getItemMeta();
            acaciameta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Casser une" + ChatColor.GOLD + " Bûche d'acacia" + ChatColor.YELLOW + " donne 1.0 exp", ChatColor.GRAY + "------------------------------"));
            acacia.setItemMeta(acaciameta);

            ItemStack jungle = new ItemStack(Material.JUNGLE_LOG);
            ItemMeta junglemeta = jungle.getItemMeta();
            junglemeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Casser une" + ChatColor.GOLD + " Bûche d'acajou" + ChatColor.YELLOW + " donne 1.0 exp", ChatColor.GRAY + "------------------------------"));
            jungle.setItemMeta(junglemeta);

            ItemStack pale = new ItemStack(Material.MANGROVE_LOG);
            ItemMeta palemeta = pale.getItemMeta();
            palemeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Casser une" + ChatColor.GOLD + " Bûche de palétuvier" + ChatColor.YELLOW + " donne 2.5 exp", ChatColor.GRAY + "------------------------------"));
            pale.setItemMeta(palemeta);

            ItemStack warped = new ItemStack(Material.WARPED_STEM);
            ItemMeta warpedmeta = warped.getItemMeta();
            warpedmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Casser une" + ChatColor.GOLD + " Tige Biscornue" + ChatColor.YELLOW + " donne 2.0 exp", ChatColor.GRAY + "------------------------------"));
            warped.setItemMeta(warpedmeta);

            ItemStack carmin = new ItemStack(Material.CRIMSON_STEM);
            ItemMeta carminmeta = carmin.getItemMeta();
            carminmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Casser une" + ChatColor.GOLD + " Tige Carmin" + ChatColor.YELLOW + " donne 2.0 exp", ChatColor.GRAY + "------------------------------"));
            carmin.setItemMeta(carminmeta);

            ItemStack roots = new ItemStack(Material.MANGROVE_ROOTS);
            ItemMeta rootsmeta = roots.getItemMeta();
            rootsmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Casser une" + ChatColor.GOLD + " Racine de palétuvier" + ChatColor.YELLOW + " donne 0.5 exp", ChatColor.GRAY + "------------------------------"));
            roots.setItemMeta(rootsmeta);

            Inventory index_bucheron = Bukkit.createInventory(player, 45, invBuch);

            ItemStack retour = new ItemStack(Material.BARRIER);
            ItemMeta retourmeta = retour.getItemMeta();
            retourmeta.setDisplayName(ChatColor.RED + "Retour");
            retour.setItemMeta(retourmeta);

            index_bucheron.setItem(11, oak);
            index_bucheron.setItem(10, birch);
            index_bucheron.setItem(13, spruce);
            index_bucheron.setItem(14, dark);
            index_bucheron.setItem(15, acacia);
            index_bucheron.setItem(12, jungle);
            index_bucheron.setItem(16, pale);
            index_bucheron.setItem(21, warped);
            index_bucheron.setItem(23, carmin);
            index_bucheron.setItem(22, roots);
            index_bucheron.setItem(40, retour);

            player.openInventory(index_bucheron);

            if (e.getView().getTitle().equals(invBuch)){

                e.setCancelled(true);

            }

            e.setCancelled(true);

        }


    }



}