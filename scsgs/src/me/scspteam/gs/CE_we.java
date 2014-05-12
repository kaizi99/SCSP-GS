package me.scspteam.gs;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.sk89q.worldedit.EditSession;
import com.sk89q.worldedit.LocalWorld;
import com.sk89q.worldedit.MaxChangedBlocksException;
import com.sk89q.worldedit.blocks.BaseBlock;
import com.sk89q.worldedit.blocks.BlockID;
import com.sk89q.worldedit.bukkit.selections.CuboidSelection;
import com.sk89q.worldedit.regions.Region;

public class CE_we 
{
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
		if(cmd.getName().equalsIgnoreCase("we"))
		{
			Player p = (Player) sender;
			CuboidSelection cs = new CuboidSelection(p.getWorld(), new com.sk89q.worldedit.Vector(p.getLocation().getBlockX() - 4, p.getLocation().getBlockY() + 3, p.getLocation().getBlockZ()), new com.sk89q.worldedit.Vector(p.getLocation().getBlockX() + 4, p.getLocation().getBlockY() - 3, p.getLocation().getBlockZ()));
			EditSession es = new EditSession((LocalWorld) p.getWorld(), 15000000);
			try {
				es.setBlocks((Region) cs, new BaseBlock(BlockID.DIAMOND_BLOCK));
			} catch (MaxChangedBlocksException e) {
				p.sendMessage("Hmmmmm");
			}
			p.sendMessage("Command erfolgreich ausgefuehrt!");
			return true;
		}
		return false;
	}
}
