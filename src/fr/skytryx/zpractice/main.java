package fr.skytryx.zpractice;

import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
		
		// code executed on enable, registering commands, events etc...
		@Override
	    public void onEnable() {
	        System.out.println("Plugin ENABLED");
	      }

	    public void onDisable() {
	    	System.out.println("Plugin DISABLED");
	    }
}
