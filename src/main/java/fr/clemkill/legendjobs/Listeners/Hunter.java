package fr.clemkill.legendjobs.Listeners;
import fr.clemkill.legendjobs.LegendJobs;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ScoreComponent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Mob;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import javax.annotation.Nullable;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Hunter implements Listener {

    private List<EntityType> mobs = new ArrayList<EntityType>();
    private double amount;

    @EventHandler
    public void onEntityDeath(EntityDeathEvent e) {

        // Récupération des mobs depuis les bibliothèques \\
        EntityType eman = EntityType.ENDERMAN;
        EntityType wsqueleton = EntityType.WITHER_SKELETON;
        EntityType emite = EntityType.ENDERMITE;
        EntityType sfish = EntityType.SILVERFISH;
        EntityType evoker = EntityType.EVOKER;
        EntityType skeleton = EntityType.SKELETON;
        EntityType ghast = EntityType.GHAST;
        EntityType zoglin = EntityType.ZOGLIN;
        EntityType piglin = EntityType.PIGLIN;
        EntityType piglinb = EntityType.PIGLIN_BRUTE;
        EntityType mcube = EntityType.MAGMA_CUBE;
        EntityType witch = EntityType.WITCH;
        EntityType pillager = EntityType.PILLAGER;
        EntityType vindic = EntityType.VINDICATOR;
        EntityType cspider = EntityType.CAVE_SPIDER;
        EntityType spider = EntityType.SPIDER;
        EntityType phantom = EntityType.PHANTOM;
        EntityType guardian = EntityType.GUARDIAN;
        EntityType zombie = EntityType.ZOMBIE;
        EntityType drowned = EntityType.DROWNED;
        EntityType creeper = EntityType.CREEPER;
        EntityType slime = EntityType.SLIME;
        EntityType hoglin = EntityType.HOGLIN;
        EntityType zpiglin = EntityType.ZOMBIFIED_PIGLIN;
        EntityType blaze = EntityType.BLAZE;

        EntityType mouton = EntityType.SHEEP;
        EntityType loup = EntityType.WOLF;
        EntityType pbear = EntityType.POLAR_BEAR;
        EntityType panda = EntityType.PANDA;
        EntityType cow = EntityType.COW;
        EntityType ane = EntityType.DONKEY;
        EntityType goat = EntityType.GOAT;
        EntityType parrot = EntityType.PARROT;
        EntityType mvache = EntityType.MUSHROOM_COW;
        EntityType poule = EntityType.CHICKEN;
        EntityType pig = EntityType.PIG;
        EntityType fox = EntityType.FOX;
        EntityType lama = EntityType.LLAMA;
        EntityType lapin = EntityType.RABBIT;
        EntityType squid = EntityType.SQUID;
        EntityType gsquid = EntityType.GLOW_SQUID;
        EntityType frog = EntityType.FROG;
        EntityType cheval = EntityType.HORSE;

        // Liste avec tout les mobs \\
        mobs.add(eman);
        mobs.add(wsqueleton);
        mobs.add(emite);
        mobs.add(sfish);
        mobs.add(evoker);
        mobs.add(skeleton);
        mobs.add(ghast);
        mobs.add(zoglin);
        mobs.add(piglin);
        mobs.add(piglinb);
        mobs.add(mcube);
        mobs.add(witch);
        mobs.add(pillager);
        mobs.add(vindic);
        mobs.add(cspider);
        mobs.add(spider);
        mobs.add(phantom);
        mobs.add(guardian);
        mobs.add(zombie);
        mobs.add(drowned);
        mobs.add(creeper);
        mobs.add(slime);
        mobs.add(hoglin);
        mobs.add(zpiglin);
        mobs.add(blaze);

        mobs.add(mouton);
        mobs.add(loup);
        mobs.add(pbear);
        mobs.add(panda);
        mobs.add(cow);
        mobs.add(ane);
        mobs.add(goat);
        mobs.add(parrot);
        mobs.add(mvache);
        mobs.add(poule);
        mobs.add(pig);
        mobs.add(fox);
        mobs.add(lama);
        mobs.add(lapin);
        mobs.add(squid);
        mobs.add(gsquid);
        mobs.add(frog);
        mobs.add(cheval);

        // ------------------------------ \\

        // Définition des valeurs d'exp par mob \\
        if(e.getEntityType() == eman){ amount = 6.0; }
        if(e.getEntityType() == wsqueleton){ amount = 7.0; }
        if(e.getEntityType() == emite){ amount = 4.0; }
        if(e.getEntityType() == sfish){ amount = 4.0; }
        if(e.getEntityType() == evoker){ amount = 4.0; }
        if(e.getEntityType() == skeleton){ amount = 1.0; }
        if(e.getEntityType() == ghast){ amount = 5.0; }
        if(e.getEntityType() == zoglin){ amount = 4.5; }
        if(e.getEntityType() == piglin){ amount = 4.5; }
        if(e.getEntityType() == piglinb){ amount = 5.0; }
        if(e.getEntityType() == mcube){ amount = 4.0; }
        if(e.getEntityType() == witch){ amount = 4.5; }
        if(e.getEntityType() == pillager){ amount = 4.0; }
        if(e.getEntityType() == vindic){ amount = 5.0; }
        if(e.getEntityType() == cspider){ amount = 3.0; }
        if(e.getEntityType() == spider){ amount = 2.0; }
        if(e.getEntityType() == phantom){ amount = 5.0; }
        if(e.getEntityType() == guardian){ amount = 4.5; }
        if(e.getEntityType() == zombie){ amount = 1.0; }
        if(e.getEntityType() == drowned){ amount = 2.5; }
        if(e.getEntityType() == creeper){ amount = 2.5; }
        if(e.getEntityType() == slime){ amount = 1.5; }
        if(e.getEntityType() == hoglin){ amount = 3.5; }
        if(e.getEntityType() == zpiglin){ amount = 3.0; }
        if(e.getEntityType() == blaze){ amount = 4.0; }

        if(e.getEntityType() == mouton) { amount = 2.0; }
        if(e.getEntityType() == loup){ amount = 3.0; }
        if(e.getEntityType() == pbear){ amount = 4.0; }
        if(e.getEntityType() == panda){ amount = 3.0; }
        if(e.getEntityType() == cow){ amount = 2.0; }
        if(e.getEntityType() == ane){ amount = 3.0; }
        if(e.getEntityType() == goat){ amount = 3.0; }
        if(e.getEntityType() == parrot){ amount = 3.0; }
        if(e.getEntityType() == mvache){ amount = 4.0; }
        if(e.getEntityType() == poule){ amount = 1.0; }
        if(e.getEntityType() == pig){ amount = 1.5; }
        if(e.getEntityType() == fox){ amount = 3.0; }
        if(e.getEntityType() == lama){ amount = 2.5; }
        if(e.getEntityType() == lapin){ amount = 3.0; }
        if(e.getEntityType() == squid){ amount = 4.5; }
        if(e.getEntityType() == gsquid){ amount = 5.5; }
        if(e.getEntityType() == frog){ amount = 4.0; }
        if(e.getEntityType() == cheval){ amount = 3.5; }

        EntityType entityKilled = e.getEntityType();

        if(e.getEntity().getKiller() instanceof Player && mobs.contains(entityKilled)){

            Player player = (Player) e.getEntity().getKiller();

            if(player.getGameMode() == GameMode.SURVIVAL){

                LegendJobs.PlayerData pd = LegendJobs.getInstance().getPlayerData(player.getUniqueId());
                pd.setHunterExp(pd.getHunterExp() + amount);
                player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(ChatColor.GRAY + "+" + ChatColor.WHITE+ amount + ChatColor.GRAY+ " exp Chasseur"));

                if(pd.getHunterExp() >= 100){

                    pd.setHunterLevel(pd.getHunterLevel() + 1);
                    pd.setHunterExp(0);
                    player.sendTitle(ChatColor.YELLOW+"Niveau Supérieur !", ChatColor.YELLOW+"Vous passez niveau "+ChatColor.GOLD+pd.getHunterLevel()+ChatColor.YELLOW+" Chasseur");

                }

            }

        }

    }

}
