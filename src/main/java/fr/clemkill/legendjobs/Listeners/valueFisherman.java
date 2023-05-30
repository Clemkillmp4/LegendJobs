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

public class valueFisherman implements Listener {

    public String invPêche = ChatColor.BLUE + "Pêcheur";
    public String invinfo = ChatColor.BLACK+"Infos métiers";

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e){

        int slot = e.getSlot();
        Player player = (Player) e.getWhoClicked();

        if (e.getView().getTitle().equals(invPêche)) {

            e.setCancelled(true);

            if(slot == 31) {

                player.closeInventory();
                e.setCancelled(true);

            }

        }

        if(e.getView().getTitle().equals(invinfo) && slot == 15){

            ItemStack cod = new ItemStack(Material.COD);
            ItemMeta codmeta = cod.getItemMeta();
            codmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Pêcher une" + ChatColor.GOLD + " Morue" + ChatColor.YELLOW + " donne 2.5 exp", ChatColor.GRAY + "------------------------------"));
            cod.setItemMeta(codmeta);

            ItemStack salmon = new ItemStack(Material.SALMON);
            ItemMeta salmonmeta = salmon.getItemMeta();
            salmonmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Pêcher un" + ChatColor.GOLD + " Saumon" + ChatColor.YELLOW + " donne 3.0 exp", ChatColor.GRAY + "------------------------------"));
            salmon.setItemMeta(salmonmeta);

            ItemStack tropical = new ItemStack(Material.TROPICAL_FISH);
            ItemMeta tropicalmeta = tropical.getItemMeta();
            tropicalmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Pêcher un" + ChatColor.GOLD + " Poisson tropical" + ChatColor.YELLOW + " donne 4.0 exp", ChatColor.GRAY + "------------------------------"));
            tropical.setItemMeta(tropicalmeta);

            ItemStack puff = new ItemStack(Material.PUFFERFISH);
            ItemMeta puffmeta = puff.getItemMeta();
            puffmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Pêcher un" + ChatColor.GOLD + " Poisson-globe" + ChatColor.YELLOW + " donne 5.0 exp", ChatColor.GRAY + "------------------------------"));
            puff.setItemMeta(puffmeta);

            ItemStack furnace = new ItemStack(Material.SMOKER);
            ItemMeta furnaceMeta = furnace.getItemMeta();
            furnaceMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.GREEN + "Cuire tout ces poissons vous rapporte", ChatColor.GREEN + "1.0 exp supplémentaires", ChatColor.GRAY + "------------------------------"));
            furnace.setItemMeta(furnaceMeta);

            ItemStack info = new ItemStack(Material.PAPER);
            ItemMeta infoMeta = info.getItemMeta();
            infoMeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.GREEN + "Pêcher des items divers vous rapportent", ChatColor.GREEN + " 1.0 exp", ChatColor.GRAY + "------------------------------"));
            info.setItemMeta(infoMeta);

            Inventory index_pêcheur = Bukkit.createInventory(player, 36, invPêche);

            ItemStack retour = new ItemStack(Material.BARRIER);
            ItemMeta retourmeta = retour.getItemMeta();
            retourmeta.setDisplayName(ChatColor.RED + "Retour");
            retour.setItemMeta(retourmeta);

            index_pêcheur.setItem(11, cod);
            index_pêcheur.setItem(12, salmon);
            index_pêcheur.setItem(13, info);
            index_pêcheur.setItem(14, tropical);
            index_pêcheur.setItem(15, puff);
            index_pêcheur.setItem(31, retour);
            index_pêcheur.setItem(35, furnace);

            player.openInventory(index_pêcheur);

            if (e.getView().getTitle().equals(invPêche)){

                e.setCancelled(true);

            }

            e.setCancelled(true);

        }

    }

}