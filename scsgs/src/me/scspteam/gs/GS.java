package me.scspteam.gs;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class GS 
{
	Player player;
	PlayerInventory pi;
	
	scsgs plugin;
	
	ItemStack[] armor = pi.getArmorContents();
	ItemStack[] contens = pi.getContents();
	
	public GS(Player player, scsgs plugin)
	{
		this.player = player;
		this.plugin = plugin;
	}
	
	public void saveInv()
	{
		for (int i = 0; i < player.getInventory().getSize(); i++)
		{
			if (player.getInventory().getItem(i).getType() != Material.AIR)
				plugin.getConfig().set("itemstack." + i, player.getInventory().getItem(i));
		}
	}
	
	public void setNormalMode()
	{
		player.getInventory().clear();
		pi.setArmorContents(armor);
	}
}
