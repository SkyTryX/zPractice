package fr.skytryx.zpractice.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class JoinEvent implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		player.sendMessage("§bWelcome to §6zPractice");
		
		ItemStack UnrQ = new ItemStack(Material.IRON_SWORD);
		ItemMeta UnrQM = UnrQ.getItemMeta();
		UnrQM.setDisplayName("§6Unranked Queue");
		UnrQ.setItemMeta(UnrQM);
		
		ItemStack Settings = new ItemStack(Material.REDSTONE_COMPARATOR);
		ItemMeta SettingsM = Settings.getItemMeta();
		SettingsM.setDisplayName("§6Settings");
		Settings.setItemMeta(SettingsM);
		
		player.getInventory().setItem(0, UnrQ);
		player.getInventory().setItem(8, Settings);
	}
}
