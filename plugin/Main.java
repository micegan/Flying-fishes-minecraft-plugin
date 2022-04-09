package plugin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.World.Environment;
import org.bukkit.attribute.Attribute;
import org.bukkit.WorldCreator;
import org.bukkit.WorldType;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.block.Dispenser;
import org.bukkit.block.PistonMoveReaction;
import org.bukkit.block.data.BlockData;
import org.bukkit.block.data.type.Door;
import org.bukkit.craftbukkit.v1_16_R3.entity.CraftLivingEntity;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fish;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Pig;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPistonEvent;
import org.bukkit.event.block.BlockPistonExtendEvent;
import org.bukkit.event.block.BlockPistonRetractEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.BlockRedstoneEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.generator.ChunkGenerator.BiomeGrid;
import org.bukkit.generator.ChunkGenerator.ChunkData;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.Lever;
import org.bukkit.material.MaterialData;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;
import org.bukkit.util.noise.SimplexOctaveGenerator;

import net.md_5.bungee.api.ChatColor;
import net.minecraft.server.v1_16_R3.EntityInsentient;

import java.util.Random;

import javax.annotation.Nonnull;

import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;



public class Main extends JavaPlugin implements Listener {

	@Override
	   public void onEnable() {
        PluginManager manager = getServer().getPluginManager();
        manager.registerEvents(this, this);
	}
	
	
	@Override
	public void onDisable() {
		
	}
	

     
	/*
	@EventHandler
    public void OnInventoryOpen(org.bukkit.event.inventory. e) {
		
			
		 
		
		
e.getPlayer().sendMessage("fuckdddddddd");

AnvilInventory inv = (AnvilInventory) Bukkit.createInventory(e.getPlayer(), InventoryType.ANVIL, "Anvil");

e.getPlayer().openInventory(inv);

inv.setItem(0, new ItemStack(Material.PAPER, -999));
				 
			
		
		
	}*/
	
	public ArrayList<Entity> fishh = new ArrayList<Entity>();

	public Integer chance =0;
	@EventHandler
	public void huhhahheh(org.bukkit.event.player.PlayerMoveEvent event) {
		
		chance = chance+1;
		if (chance == 10) {
			chance=0;
			Random rand = new Random();
			
			Random randd = new Random();
			
			Location loc = new Location(event.getPlayer().getWorld(), event.getPlayer().getLocation().getX() - rand.nextInt(16) +randd.nextInt(16),  event.getPlayer().getLocation().getY()+ rand.nextInt(30),  event.getPlayer().getLocation().getZ()- rand.nextInt(16)+randd.nextInt(16));
			Entity fish = event.getPlayer().getWorld().spawnEntity(loc, EntityType.TROPICAL_FISH);
			Fish fishx = (Fish)fish;
			fishx.setAware(false);
			fish.setGravity(false);
			fishx.setSwimming(true);
			 int tasdk = Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
				 @Override
				 public void run() {
			 
		
			Vector unitVector = new Vector(rand.nextInt(30) -randd.nextInt(60), rand.nextInt(30)-randd.nextInt(60), rand.nextInt(30)-randd.nextInt(60));
			unitVector = unitVector.normalize();             
			fishx.setVelocity(unitVector.multiply(1));
				 }},0*5, 5*20);
			
			fishx.setRemoveWhenFarAway(true);
			fishh.add(fish);
			
		}
		}
	
	@EventHandler
	public void onEntityDamage(EntityDamageEvent event) {
		if (fishh.contains(event.getEntity())) {
	event.setCancelled(true);
		}
	}
	 
	
		
	}


		
		
		

	
	
		
	
		
		
	/*	for (int i = 0; i < nnn.size(); i++) {
			if (nnn.get(i).getClass() == ShulkerBox.class) {
				
				ArrayList<ItemStack> is = new ArrayList<ItemStack>();
				
				
				ShulkerBox sb = (ShulkerBox) nnn.get(i);
				
				
				
					if (sb.getInventory().getContents().length == 27) {
						
					}
				
			}
		}*/
	
	
	

