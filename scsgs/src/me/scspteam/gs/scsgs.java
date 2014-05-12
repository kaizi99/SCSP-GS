package me.scspteam.gs;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class scsgs extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		this.getCommand("gs").setPermissionMessage(ChatColor.GOLD + "[Skate's Community Server]" + ChatColor.RED + "Dir fehlt die Berechtigung für diesen Befehl!");
		this.getCommand("gs").setExecutor(new CE_gs(this));
		System.out.println("[Skate's Community Server]GS-Plugin aktiviert");
	}
	
	@Override
	public void onDisable()
	{
		System.out.println("[Skate's Community Server]GS-Plugin deaktiviert");
	}
}
