package fr.clemkill.legendjobs.Listeners;

import fr.clemkill.legendjobs.LegendJobs;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerBucketFillEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class Fisherman implements Listener {

    private double amount;
    ArrayList<Material> fishs = new ArrayList<>();

    @EventHandler
    public void playerFish(PlayerFishEvent e) {

        fishs.add(Material.COD);
        fishs.add(Material.SALMON);
        fishs.add(Material.PUFFERFISH);
        fishs.add(Material.TROPICAL_FISH);

        if (e.getState() != PlayerFishEvent.State.CAUGHT_FISH) {
            return;
        }

        Player player = e.getPlayer();
        Item fish = (Item) e.getCaught();

        if (player.getGameMode() == GameMode.SURVIVAL) {

            if (fish.getItemStack().getType() == Material.COD) { amount = 2.5; }
            if (fish.getItemStack().getType() == Material.SALMON) { amount = 3.0; }
            if (fish.getItemStack().getType() == Material.TROPICAL_FISH) { amount = 4.0; }
            if (fish.getItemStack().getType() == Material.PUFFERFISH) { amount = 5.0; }
            if (!fishs.contains(fish.getItemStack().getType())) { amount = 1.0; }

            LegendJobs.PlayerData pd = LegendJobs.getInstance().getPlayerData(player.getUniqueId());
            pd.setFishExp(pd.getFishExp() + amount);
            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(ChatColor.GRAY + "+" + ChatColor.WHITE + amount + ChatColor.GRAY + " exp Pêcheur"));

            if(pd.getFishExp() >= 100){

                pd.setFishExp(0);
                pd.setFishLevel(pd.getFishLevel() + 1);
                player.sendTitle(ChatColor.YELLOW+"Niveau Supérieur !", ChatColor.YELLOW+"Vous passez niveau "+ChatColor.GOLD+pd.getFishLevel()+ChatColor.YELLOW+" Pêcheur");

            }

        }

    }

}
