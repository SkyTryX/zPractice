package fr.skytryx.zpractice.gui;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class QueueGUI implements Listener {
	
	@EventHandler
	public void UnRankedQClick(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		Action action = event.getAction();
		ItemStack item = event.getItem();
		
		if(!(action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_BLOCK))) return;
		if(item == null) return;
		if(item.getItemMeta().getDisplayName().equalsIgnoreCase("§6Unranked Queue")) {
			Inventory UnrInv = Bukkit.createInventory(null, 9, "§7Unranked Queue");
			//Get a way to import kits from a yml
			player.openInventory(UnrInv);
		}
	}

}
