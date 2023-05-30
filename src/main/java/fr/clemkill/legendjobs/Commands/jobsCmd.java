package fr.clemkill.legendjobs.Commands;
import fr.clemkill.legendjobs.LegendJobs;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class jobsCmd implements Listener, CommandExecutor {
    public String invname = ChatColor.GOLD+"LegendJobs";

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){

        Player player = (Player) sender;

        if (sender instanceof Player){

            Inventory gui = Bukkit.createInventory(player, 27, invname);

            ItemStack Hunter = new ItemStack(Material.IRON_SWORD);
            ItemStack Miner = new ItemStack(Material.IRON_PICKAXE);
            ItemStack LumberJack = new ItemStack(Material.IRON_AXE);
            ItemStack Farmer = new ItemStack(Material.IRON_HOE);
            ItemStack Fisherman = new ItemStack(Material.FISHING_ROD);

            gui.setItem(11, Hunter);
            gui.setItem(12, Miner);
            gui.setItem(13, LumberJack);
            gui.setItem(14, Farmer);
            gui.setItem(15, Fisherman);

            player.openInventory(gui);

        }

        return true;

    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e){

        if(e.getView().getTitle().equals(invname)){

            e.setCancelled(true);

        }

    }
}
