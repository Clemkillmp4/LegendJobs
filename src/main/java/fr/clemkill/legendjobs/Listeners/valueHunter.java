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

public class valueHunter implements Listener {

    public String invinfo = ChatColor.BLACK+"Infos métiers";
    public String invHunter = ChatColor.RED+"Chasseur";
    public String invHunter2 = ChatColor.RED+"Chasseur ";

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {

        int slot = e.getSlot();

        Player player = (Player) e.getWhoClicked();

        if (e.getView().getTitle().equals(invHunter)) {

            e.setCancelled(true);

        }

        if (e.getView().getTitle().equals(invHunter2)) {

            e.setCancelled(true);

        }

        // Mobs agressifs
        Inventory index_hunter = Bukkit.createInventory(player, 54, invHunter);

        ItemStack eman = new ItemStack(Material.ENDERMAN_SPAWN_EGG);
        ItemMeta emanmeta = eman.getItemMeta();
        emanmeta.setDisplayName(ChatColor.WHITE+"Enderman");
        emanmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Enderman" + ChatColor.YELLOW + " donne 6.0 exp", ChatColor.GRAY + "------------------------------"));
        eman.setItemMeta(emanmeta);

        ItemStack wskeleton = new ItemStack(Material.WITHER_SKELETON_SPAWN_EGG);
        ItemMeta wskeletonmeta = wskeleton.getItemMeta();
        wskeletonmeta.setDisplayName(ChatColor.WHITE+"Wither Squelette");
        wskeletonmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Wither Squelette" + ChatColor.YELLOW + " donne 7.0 exp", ChatColor.GRAY + "------------------------------"));
        wskeleton.setItemMeta(wskeletonmeta);

        ItemStack emite = new ItemStack(Material.ENDERMITE_SPAWN_EGG);
        ItemMeta emitemeta = emite.getItemMeta();
        emitemeta.setDisplayName(ChatColor.WHITE+"Endermite");
        emitemeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer une" + ChatColor.GOLD + " Endermite" + ChatColor.YELLOW + " donne 4.0 exp", ChatColor.GRAY + "------------------------------"));
        emite.setItemMeta(emitemeta);

        ItemStack sfish = new ItemStack(Material.SILVERFISH_SPAWN_EGG);
        ItemMeta sfishmeta = sfish.getItemMeta();
        sfishmeta.setDisplayName(ChatColor.WHITE+"Poisson d'argent");
        sfishmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Poisson d'argent" + ChatColor.YELLOW + " donne 4.0 exp", ChatColor.GRAY + "------------------------------"));
        sfish.setItemMeta(sfishmeta);

        ItemStack evoker = new ItemStack(Material.EVOKER_SPAWN_EGG);
        ItemMeta evokermeta = evoker.getItemMeta();
        evokermeta.setDisplayName(ChatColor.WHITE+"Evocateur");
        evokermeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Evocateur" + ChatColor.YELLOW + " donne 4.0 exp", ChatColor.GRAY + "------------------------------"));
        evoker.setItemMeta(evokermeta);

        ItemStack skeleton = new ItemStack(Material.SKELETON_SPAWN_EGG);
        ItemMeta skeletonmeta = skeleton.getItemMeta();
        skeletonmeta.setDisplayName(ChatColor.WHITE+"Squelette");
        skeletonmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Squelette" + ChatColor.YELLOW + " donne 1.0 exp", ChatColor.GRAY + "------------------------------"));
        skeleton.setItemMeta(skeletonmeta);

        ItemStack ghast = new ItemStack(Material.GHAST_SPAWN_EGG);
        ItemMeta ghastmeta = ghast.getItemMeta();
        ghastmeta.setDisplayName(ChatColor.WHITE+"Ghast");
        ghastmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Ghast" + ChatColor.YELLOW + " donne 5.0 exp", ChatColor.GRAY + "------------------------------"));
        ghast.setItemMeta(ghastmeta);

        ItemStack zoglin = new ItemStack(Material.ZOGLIN_SPAWN_EGG);
        ItemMeta zoglinmeta = zoglin.getItemMeta();
        zoglinmeta.setDisplayName(ChatColor.WHITE+"Zoglin");
        zoglinmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Zoglin" + ChatColor.YELLOW + " donne 4.5 exp", ChatColor.GRAY + "------------------------------"));
        zoglin.setItemMeta(zoglinmeta);

        ItemStack piglin = new ItemStack(Material.PIGLIN_SPAWN_EGG);
        ItemMeta piglinmeta = piglin.getItemMeta();
        piglinmeta.setDisplayName(ChatColor.WHITE+"Piglin");
        piglinmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Piglin" + ChatColor.YELLOW + " donne 4.5 exp", ChatColor.GRAY + "------------------------------"));
        piglin.setItemMeta(piglinmeta);

        ItemStack piglinb = new ItemStack(Material.PIGLIN_BRUTE_SPAWN_EGG);
        ItemMeta piglinbmeta = piglinb.getItemMeta();
        piglinbmeta.setDisplayName(ChatColor.WHITE+"Piglin barbare");
        piglinbmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Piglin barbare" + ChatColor.YELLOW + " donne 5.0 exp", ChatColor.GRAY + "------------------------------"));
        piglinb.setItemMeta(piglinbmeta);

        ItemStack mcube = new ItemStack(Material.MAGMA_CUBE_SPAWN_EGG);
        ItemMeta mcubemeta = mcube.getItemMeta();
        mcubemeta.setDisplayName(ChatColor.WHITE+"Cube de magma");
        mcubemeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Cube de magma" + ChatColor.YELLOW + " donne 4.0 exp", ChatColor.GRAY + "------------------------------"));
        mcube.setItemMeta(mcubemeta);

        ItemStack witch = new ItemStack(Material.WITCH_SPAWN_EGG);
        ItemMeta witchmeta = witch.getItemMeta();
        witchmeta.setDisplayName(ChatColor.WHITE+"Sorcière");
        witchmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer une" + ChatColor.GOLD + " Sorcière" + ChatColor.YELLOW + " donne 4.5 exp", ChatColor.GRAY + "------------------------------"));
        witch.setItemMeta(witchmeta);

        ItemStack pillager = new ItemStack(Material.PILLAGER_SPAWN_EGG);
        ItemMeta pillagermeta = pillager.getItemMeta();
        pillagermeta.setDisplayName(ChatColor.WHITE+"Pillard");
        pillagermeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Pillard" + ChatColor.YELLOW + " donne 4.0 exp", ChatColor.GRAY + "------------------------------"));
        pillager.setItemMeta(pillagermeta);

        ItemStack vindic = new ItemStack(Material.VINDICATOR_SPAWN_EGG);
        ItemMeta vindicmeta = vindic.getItemMeta();
        vindicmeta.setDisplayName(ChatColor.WHITE+"Vindicateur");
        vindicmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Vindicateur" + ChatColor.YELLOW + " donne 5.0 exp", ChatColor.GRAY + "------------------------------"));
        vindic.setItemMeta(vindicmeta);

        ItemStack cspider = new ItemStack(Material.CAVE_SPIDER_SPAWN_EGG);
        ItemMeta cspidermeta = cspider.getItemMeta();
        cspidermeta.setDisplayName(ChatColor.WHITE+"Araignée venimeuse");
        cspidermeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer une" + ChatColor.GOLD + " Araignée venimeuse" + ChatColor.YELLOW + " donne 3.0 exp", ChatColor.GRAY + "------------------------------"));
        cspider.setItemMeta(cspidermeta);

        ItemStack spider = new ItemStack(Material.SPIDER_SPAWN_EGG);
        ItemMeta spidermeta = spider.getItemMeta();
        spidermeta.setDisplayName(ChatColor.WHITE+"Araignée");
        spidermeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer une" + ChatColor.GOLD + " Araignée" + ChatColor.YELLOW + " donne 2.0 exp", ChatColor.GRAY + "------------------------------"));
        spider.setItemMeta(spidermeta);

        ItemStack phantom = new ItemStack(Material.PHANTOM_SPAWN_EGG);
        ItemMeta phantommeta = phantom.getItemMeta();
        phantommeta.setDisplayName(ChatColor.WHITE+"Phantom");
        phantommeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Phantom" + ChatColor.YELLOW + " donne 5.0 exp", ChatColor.GRAY + "------------------------------"));
        phantom.setItemMeta(phantommeta);

        ItemStack guardian = new ItemStack(Material.GUARDIAN_SPAWN_EGG);
        ItemMeta guardianmeta = guardian.getItemMeta();
        guardianmeta.setDisplayName(ChatColor.WHITE+"Gardien");
        guardianmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Gardien" + ChatColor.YELLOW + " donne 4.5 exp", ChatColor.GRAY + "------------------------------"));
        guardian.setItemMeta(guardianmeta);

        ItemStack zombie = new ItemStack(Material.ZOMBIE_SPAWN_EGG);
        ItemMeta zombiemeta = zombie.getItemMeta();
        zombiemeta.setDisplayName(ChatColor.WHITE+"Zombie");
        zombiemeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Zombie" + ChatColor.YELLOW + " donne 1.0 exp", ChatColor.GRAY + "------------------------------"));
        zombie.setItemMeta(zombiemeta);

        ItemStack drowned = new ItemStack(Material.DROWNED_SPAWN_EGG);
        ItemMeta drownedmeta = drowned.getItemMeta();
        drownedmeta.setDisplayName(ChatColor.WHITE+"Noyé");
        drownedmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Noyé" + ChatColor.YELLOW + " donne 2.5 exp", ChatColor.GRAY + "------------------------------"));
        drowned.setItemMeta(drownedmeta);

        ItemStack creeper = new ItemStack(Material.CREEPER_SPAWN_EGG);
        ItemMeta creepermeta = creeper.getItemMeta();
        creepermeta.setDisplayName(ChatColor.WHITE+"Creeper");
        creepermeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Creeper" + ChatColor.YELLOW + " donne 2.5 exp", ChatColor.GRAY + "------------------------------"));
        creeper.setItemMeta(creepermeta);

        ItemStack slime = new ItemStack(Material.SLIME_SPAWN_EGG);
        ItemMeta slimemeta = slime.getItemMeta();
        slimemeta.setDisplayName(ChatColor.WHITE+"Slime");
        slimemeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Slime" + ChatColor.YELLOW + " donne 1.5 exp", ChatColor.GRAY + "------------------------------"));
        slime.setItemMeta(slimemeta);

        ItemStack hoglin = new ItemStack(Material.HOGLIN_SPAWN_EGG);
        ItemMeta hoglinmeta = hoglin.getItemMeta();
        hoglinmeta.setDisplayName(ChatColor.WHITE+"Hoglin");
        hoglinmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Hoglin" + ChatColor.YELLOW + " donne 3.5 exp", ChatColor.GRAY + "------------------------------"));
        hoglin.setItemMeta(hoglinmeta);

        ItemStack zpiglin = new ItemStack(Material.ZOMBIFIED_PIGLIN_SPAWN_EGG);
        ItemMeta zpiglinmeta = zpiglin.getItemMeta();
        zpiglinmeta.setDisplayName(ChatColor.WHITE+"Piglin zombifié");
        zpiglinmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Piglin zombifié" + ChatColor.YELLOW + " donne 3.0 exp", ChatColor.GRAY + "------------------------------"));
        zpiglin.setItemMeta(zpiglinmeta);

        ItemStack blaze = new ItemStack(Material.BLAZE_SPAWN_EGG);
        ItemMeta blazemeta = blaze.getItemMeta();
        blazemeta.setDisplayName(ChatColor.WHITE+"Blaze");
        blazemeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Blaze" + ChatColor.YELLOW + " donne 4.0 exp", ChatColor.GRAY + "------------------------------"));
        blaze.setItemMeta(blazemeta);

        ItemStack sfleche = new ItemStack(Material.SPECTRAL_ARROW);
        ItemMeta sflechemeta = sfleche.getItemMeta();
        sflechemeta.setDisplayName(ChatColor.GREEN+"Page Suivante");
        sfleche.setItemMeta(sflechemeta);

        ItemStack retour = new ItemStack(Material.BARRIER);
        ItemMeta retourmeta = retour.getItemMeta();
        retourmeta.setDisplayName(ChatColor.RED+"Retour");
        retour.setItemMeta(retourmeta);

        index_hunter.setItem(10, eman);
        index_hunter.setItem(11, wskeleton);
        index_hunter.setItem(12, emite);
        index_hunter.setItem(13, sfish);
        index_hunter.setItem(14, evoker);
        index_hunter.setItem(15, skeleton);
        index_hunter.setItem(16, ghast);
        index_hunter.setItem(19, zoglin);
        index_hunter.setItem(20, piglin);
        index_hunter.setItem(21, piglinb);
        index_hunter.setItem(22, mcube);
        index_hunter.setItem(23, witch);
        index_hunter.setItem(24, pillager);
        index_hunter.setItem(25, vindic);
        index_hunter.setItem(28, cspider);
        index_hunter.setItem(29, spider);
        index_hunter.setItem(30, phantom);
        index_hunter.setItem(31, guardian);
        index_hunter.setItem(32, zombie);
        index_hunter.setItem(33, drowned);
        index_hunter.setItem(34, creeper);
        index_hunter.setItem(37, slime);
        index_hunter.setItem(38, hoglin);
        index_hunter.setItem(39, zpiglin);
        index_hunter.setItem(40, blaze);

        index_hunter.setItem(49, retour);
        index_hunter.setItem(50, sfleche);

        // Mobs passifs
        Inventory index_hunter2 = Bukkit.createInventory(player, 54, invHunter2);

        ItemStack mouton = new ItemStack(Material.SHEEP_SPAWN_EGG);
        ItemMeta moutonmeta = mouton.getItemMeta();
        moutonmeta.setDisplayName(ChatColor.WHITE+"Mouton");
        moutonmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Mouton" + ChatColor.YELLOW + " donne 2.0 exp", ChatColor.GRAY + "------------------------------"));
        mouton.setItemMeta(moutonmeta);

        ItemStack loup = new ItemStack(Material.WOLF_SPAWN_EGG);
        ItemMeta loupmeta = loup.getItemMeta();
        loupmeta.setDisplayName(ChatColor.WHITE+"Loup");
        loupmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Loup" + ChatColor.YELLOW + " donne 3.0 exp", ChatColor.GRAY + "------------------------------"));
        loup.setItemMeta(loupmeta);

        ItemStack pbear = new ItemStack(Material.POLAR_BEAR_SPAWN_EGG);
        ItemMeta pbearmeta = pbear.getItemMeta();
        pbearmeta.setDisplayName(ChatColor.WHITE+"Ours Polaire");
        pbearmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Ours Polaire" + ChatColor.YELLOW + " donne 4.0 exp", ChatColor.GRAY + "------------------------------"));
        pbear.setItemMeta(pbearmeta);

        ItemStack cow = new ItemStack(Material.COW_SPAWN_EGG);
        ItemMeta cowmeta = cow.getItemMeta();
        cowmeta.setDisplayName(ChatColor.WHITE+"Vache");
        cowmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer une" + ChatColor.GOLD + " Vache" + ChatColor.YELLOW + " donne 2.0 exp", ChatColor.GRAY + "------------------------------"));
        cow.setItemMeta(cowmeta);

        ItemStack ane = new ItemStack(Material.DONKEY_SPAWN_EGG);
        ItemMeta anemeta = ane.getItemMeta();
        anemeta.setDisplayName(ChatColor.WHITE+"Âne");
        anemeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Âne" + ChatColor.YELLOW + " donne 3.0 exp", ChatColor.GRAY + "------------------------------"));
        ane.setItemMeta(anemeta);

        ItemStack goat = new ItemStack(Material.GOAT_SPAWN_EGG);
        ItemMeta goatmeta = goat.getItemMeta();
        goatmeta.setDisplayName(ChatColor.WHITE+"Chèvre");
        goatmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer une" + ChatColor.GOLD + " Chèvre" + ChatColor.YELLOW + " donne 3.0 exp", ChatColor.GRAY + "------------------------------"));
        goat.setItemMeta(goatmeta);

        ItemStack parrot = new ItemStack(Material.PARROT_SPAWN_EGG);
        ItemMeta parrotmeta = parrot.getItemMeta();
        parrotmeta.setDisplayName(ChatColor.WHITE+"Perroquet");
        parrotmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Perroquet" + ChatColor.YELLOW + " donne 3.0 exp", ChatColor.GRAY + "------------------------------"));
        parrot.setItemMeta(parrotmeta);

        ItemStack mvache = new ItemStack(Material.MOOSHROOM_SPAWN_EGG);
        ItemMeta mvachemeta = mvache.getItemMeta();
        mvachemeta.setDisplayName(ChatColor.WHITE+"Champivache");
        mvachemeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer une" + ChatColor.GOLD + " Champivache" + ChatColor.YELLOW + " donne 4.0 exp", ChatColor.GRAY + "------------------------------"));
        mvache.setItemMeta(mvachemeta);

        ItemStack poule = new ItemStack(Material.CHICKEN_SPAWN_EGG);
        ItemMeta poulemeta = poule.getItemMeta();
        poulemeta.setDisplayName(ChatColor.WHITE+"Poulet");
        poulemeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Poulet" + ChatColor.YELLOW + " donne 1.0 exp", ChatColor.GRAY + "------------------------------"));
        poule.setItemMeta(poulemeta);

        ItemStack pig = new ItemStack(Material.PIG_SPAWN_EGG);
        ItemMeta pigmeta = pig.getItemMeta();
        pigmeta.setDisplayName(ChatColor.WHITE+"Cochon");
        pigmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Cochon" + ChatColor.YELLOW + " donne 1.5 exp", ChatColor.GRAY + "------------------------------"));
        pig.setItemMeta(pigmeta);

        ItemStack fox = new ItemStack(Material.FOX_SPAWN_EGG);
        ItemMeta foxmeta = fox.getItemMeta();
        foxmeta.setDisplayName(ChatColor.WHITE+"Renard");
        foxmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Renard" + ChatColor.YELLOW + " donne 3.0 exp", ChatColor.GRAY + "------------------------------"));
        fox.setItemMeta(foxmeta);

        ItemStack lama = new ItemStack(Material.LLAMA_SPAWN_EGG);
        ItemMeta lamameta = lama.getItemMeta();
        lamameta.setDisplayName(ChatColor.WHITE+"Lama");
        lamameta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Lama" + ChatColor.YELLOW + " donne 2.5 exp", ChatColor.GRAY + "------------------------------"));
        lama.setItemMeta(lamameta);

        ItemStack lapin = new ItemStack(Material.RABBIT_SPAWN_EGG);
        ItemMeta lapinmeta = lapin.getItemMeta();
        lapinmeta.setDisplayName(ChatColor.WHITE+"Lapin");
        lapinmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Lapin" + ChatColor.YELLOW + " donne 3.0 exp", ChatColor.GRAY + "------------------------------"));
        lapin.setItemMeta(lapinmeta);

        ItemStack squid = new ItemStack(Material.SQUID_SPAWN_EGG);
        ItemMeta squidmeta = squid.getItemMeta();
        squidmeta.setDisplayName(ChatColor.WHITE+"Poulpe");
        squidmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Poulpe" + ChatColor.YELLOW + " donne 4.5 exp", ChatColor.GRAY + "------------------------------"));
        squid.setItemMeta(squidmeta);

        ItemStack gsquid = new ItemStack(Material.GLOW_SQUID_SPAWN_EGG);
        ItemMeta gsquidmeta = gsquid.getItemMeta();
        gsquidmeta.setDisplayName(ChatColor.WHITE+"Poulpe luisant");
        gsquidmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Poulpe luisant" + ChatColor.YELLOW + " donne 5.5 exp", ChatColor.GRAY + "------------------------------"));
        gsquid.setItemMeta(gsquidmeta);

        ItemStack frog = new ItemStack(Material.FROG_SPAWN_EGG);
        ItemMeta frogmeta = frog.getItemMeta();
        frogmeta.setDisplayName(ChatColor.WHITE+"Grenouille");
        frogmeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer une" + ChatColor.GOLD + " Grenouille" + ChatColor.YELLOW + " donne 4.0 exp", ChatColor.GRAY + "------------------------------"));
        frog.setItemMeta(frogmeta);

        ItemStack horse = new ItemStack(Material.HORSE_SPAWN_EGG);
        ItemMeta horsemeta = horse.getItemMeta();
        horsemeta.setDisplayName(ChatColor.WHITE+"Cheval");
        horsemeta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Cheval" + ChatColor.YELLOW + " donne 3.5 exp", ChatColor.GRAY + "------------------------------"));
        horse.setItemMeta(horsemeta);

        ItemStack panda = new ItemStack(Material.PANDA_SPAWN_EGG);
        ItemMeta pandameta = panda.getItemMeta();
        pandameta.setDisplayName(ChatColor.WHITE+"Panda");
        pandameta.setLore(List.of(ChatColor.GRAY + "------------------------------", ChatColor.YELLOW + "Tuer un" + ChatColor.GOLD + " Panda" + ChatColor.YELLOW + " donne 3.0 exp", ChatColor.GRAY + "------------------------------"));
        panda.setItemMeta(pandameta);


        ItemStack pfleche = new ItemStack(Material.SPECTRAL_ARROW);
        ItemMeta pflechemeta = pfleche.getItemMeta();
        pflechemeta.setDisplayName(ChatColor.GREEN+"Page Précédente");
        pfleche.setItemMeta(pflechemeta);

        index_hunter2.setItem(10, mouton);
        index_hunter2.setItem(11, loup);
        index_hunter2.setItem(12, pbear);
        index_hunter2.setItem(13, panda);
        index_hunter2.setItem(14, cow);
        index_hunter2.setItem(15, ane);
        index_hunter2.setItem(16, goat);
        index_hunter2.setItem(19, parrot);
        index_hunter2.setItem(20, mvache);
        index_hunter2.setItem(21, poule);
        index_hunter2.setItem(22, pig);
        index_hunter2.setItem(23, fox);
        index_hunter2.setItem(24, lama);
        index_hunter2.setItem(25, lapin);
        index_hunter2.setItem(28, squid);
        index_hunter2.setItem(29, gsquid);
        index_hunter2.setItem(30, frog);
        index_hunter2.setItem(31, horse);

        index_hunter2.setItem(48, pfleche);
        index_hunter2.setItem(49, retour);

        if(e.getView().getTitle().equals(invHunter) || e.getView().getTitle().equals(invHunter2) && slot == 49) { // Slot RETOUR

            e.setCancelled(true);
            player.closeInventory();

        }

        if(e.getView().getTitle().equals(invHunter) && slot == 50){ // Slot PAGE SUIVANTE

            e.setCancelled(true);
            player.openInventory(index_hunter2);

        }

        if (e.getView().getTitle().equals(invinfo) && slot == 11) { // Slot HUNTER

            player.openInventory(index_hunter);

        }
        if(e.getView().getTitle().equals(invHunter2) && slot == 48){ // Slot PAGE PRECEDENTE

            e.setCancelled(true);
            player.openInventory(index_hunter);

        }

    }

}
