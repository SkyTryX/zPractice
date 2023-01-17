package fr.skytryx.zpractice.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class LobbyProtection implements Listener {
	
	@EventHandler
	public void BlockBreak(BlockBreakEvent event) {
		event.setCancelled(true);
	}

}
