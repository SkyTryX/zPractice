package fr.skytryx.zpractice;

import org.bukkit.plugin.java.JavaPlugin;

import fr.skytryx.zpractice.events.JoinEvent;
import fr.skytryx.zpractice.events.LobbyProtection;
import fr.skytryx.zpractice.gui.QueueGUI;

public class main extends JavaPlugin {
		
		// code executed on enable, registering commands, events etc...
		@Override
	    public void onEnable() {
	        System.out.println("Plugin ENABLED");
	        getServer().getPluginManager().registerEvents(new JoinEvent(), this);
	        getServer().getPluginManager().registerEvents(new QueueGUI(), this);
	        getServer().getPluginManager().registerEvents(new LobbyProtection(), this);
	      }

	    public void onDisable() {
	    	System.out.println("Plugin DISABLED");
	    }
}
