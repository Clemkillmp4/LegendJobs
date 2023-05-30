package fr.clemkill.legendjobs;

import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

import net.milkbowl.vault.economy.Economy;

import fr.clemkill.legendjobs.Commands.jobsCmd;
import fr.clemkill.legendjobs.Commands.uuid;
import fr.clemkill.legendjobs.Commands.valuesCmd;
import fr.clemkill.legendjobs.Listeners.*;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public final class LegendJobs extends JavaPlugin implements Listener {

    private static LegendJobs instance;

    public static LegendJobs getInstance() {
        return instance;
    }

    private final Map<UUID, PlayerData> playerCache = new HashMap<>();

    private static Economy econ = null;
    @Override
    public void onEnable() {

        // Plugin startup logic
        Objects.requireNonNull(getCommand("jobs")).setExecutor(new jobsCmd());
        Objects.requireNonNull(getCommand("values")).setExecutor(new valuesCmd());
        Objects.requireNonNull(getCommand("uuid")).setExecutor(new uuid());
        getServer().getPluginManager().registerEvents(new LumberJack(), this);
        getServer().getPluginManager().registerEvents(new Hunter(), this);
        getServer().getPluginManager().registerEvents(new Miner(), this);
        getServer().getPluginManager().registerEvents(new Farmer(), this);
        getServer().getPluginManager().registerEvents(new Fisherman(), this);
        getServer().getPluginManager().registerEvents(new valuesCmd(),this);
        getServer().getPluginManager().registerEvents(new valueBuch(),this);
        getServer().getPluginManager().registerEvents(new valueMiner(),this);
        getServer().getPluginManager().registerEvents(new valueHunter(),this);
        getServer().getPluginManager().registerEvents(new valueFarmer(), this);
        getServer().getPluginManager().registerEvents(new valueFisherman(),this);
        getServer().getPluginManager().registerEvents(this, this);

        instance = this;
        if (!getDataFolder().exists()) getDataFolder().mkdir();
        saveDefaultConfig();

        if (!setupEconomy() ) {
            System.err.println(String.format("[%s] - Disabled due to no Vault dependency found!", getDescription().getName()));
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
    }

    private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        econ = rsp.getProvider();
        return econ != null;
    }

    @Override
    public void onDisable() {

    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        playerCache.put(p.getUniqueId(), new PlayerData(p.getUniqueId()));
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        getPlayerData(p.getUniqueId()).save();
    }

    // Récupère les données du joueur
    public PlayerData getPlayerData(UUID id) {
        return playerCache.get(id);
    }

    public class PlayerData {

        private int prestige = 0;
        public int getPrestige() {
            return prestige;
        }
        private int farmerLevel = 0;
        public int getFarmerLevel() { return farmerLevel; }
        private double farmerExp = 0;
        public double getFarmerExp() {
            return farmerExp;
        }
        private int Fishlevel = 0;
        public int getFishLevel() { return Fishlevel; }
        private double Fishexp = 0;
        public double getFishExp() { return Fishexp; }
        private int hunterLevel = 0;
        public int getHunterLevel() { return hunterLevel; }
        private double hunterExp = 0;
        public double getHunterExp() { return hunterExp; }
        private int lumberjackLevel = 0;
        public int getlumberjackLevel() {
            return lumberjackLevel;
        }
        private double lumberjackExp = 0;
        public double getLumberjackExp() {
            return lumberjackExp;
        }
        private int minerLevel = 0;
        public int getMinerLevel() {
            return minerLevel;
        }
        private double minerExp = 0;
        public double getminerExp() {
            return minerExp;
        }
        private UUID id;
        public PlayerData(UUID id) {
            File f = new File(getDataFolder(), id.toString() + ".yml");
            boolean def = !f.exists();
            FileConfiguration conf = null;
            if (def) {
                try {
                    f.createNewFile();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            FileConfiguration config = YamlConfiguration.loadConfiguration(f);
            if (def) {
                config.set("prestige", prestige);
                config.set("Fishlevel", Fishlevel);
                config.set("Fishexp", Fishexp);
                config.set("farmerLevel", farmerLevel);
                config.set("farmerExp", farmerExp);
                config.set("hunterLevel", hunterLevel);
                config.set("hunterExp", hunterExp);
                config.set("lumberjacklevel", lumberjackLevel);
                config.set("lumberjackexp", lumberjackExp);
                config.set("minerlevel", minerLevel);
                config.set("minerexp", minerExp);
                try {
                    config.save(f);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                Fishexp = config.getDouble("Fishexp");
                Fishlevel = config.getInt("Fishlevel");
                farmerLevel = config.getInt("farmerLevel");
                farmerExp = config.getInt("farmerExp");
                prestige = config.getInt("prestige");
                hunterLevel = config.getInt("hunterLevel");
                hunterExp = config.getDouble("hunterExp");
                lumberjackExp = config.getDouble("lumberjackexp");
                lumberjackLevel = config.getInt("lumberjacklevel");
                minerExp = config.getDouble("minerexp");
                minerLevel = config.getInt("minerlevel");
            }
            this.id = id;
        }
        public void save(){
            File f = new File(getDataFolder(), id + ".yml");
            FileConfiguration conf = YamlConfiguration.loadConfiguration(f);
            conf.set("prestige", prestige);
            conf.set("Fishlevel", Fishlevel);
            conf.set("Fishexp", Fishexp);
            conf.set("farmerLevel", farmerLevel);
            conf.set("farmerExp", farmerExp);
            conf.set("hunterExp", hunterExp);
            conf.set("hunterLevel", hunterLevel);
            conf.set("lumberjacklevel", lumberjackLevel);
            conf.set("lumberjackexp", lumberjackExp);
            conf.set("minerlevel", minerLevel);
            conf.set("minerexp", minerExp);
            try {
                conf.save(f);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public void setFishExp(double value) {
            this.Fishexp = value;
        }
        public void setFishLevel(int value) {
            this.Fishlevel = value;
        }

        public void setFarmerExp(double value) {
            this.farmerExp = value;
        }
        public void setFarmerLevel(int value) {
            this.farmerLevel = value;
        }

        public void setHunterExp(double value) {
            this.hunterExp = value;
        }
        public void setHunterLevel(int value) {
            this.hunterLevel = value;
        }

        public void setLumberjackExp(double value) {
            this.lumberjackExp = value;
        }
        public void setLumberJackLevel(int value) {
            this.lumberjackLevel = value;
        }

        public void setMinerExp(double value) {
            this.minerExp = value;
        }
        public void setMinerLevel(int value) {
            this.minerLevel = value;
        }

        public static Economy getEconomy() {
            return econ;
        }

    }

}