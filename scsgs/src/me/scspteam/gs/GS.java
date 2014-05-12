package me.scspteam.gs;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.sk89q.worldedit.EditSession;
import com.sk89q.worldedit.LocalWorld;
import com.sk89q.worldedit.MaxChangedBlocksException;
import com.sk89q.worldedit.Vector;
import com.sk89q.worldedit.blocks.BaseBlock;
import com.sk89q.worldedit.blocks.BlockID;
import com.sk89q.worldedit.bukkit.selections.CuboidSelection;
import com.sk89q.worldedit.regions.Region;

public class GS 
{
	public GS(Player p)
	{
		Location playerLoc = p.getLocation();
		CuboidSelection defaultCs = new CuboidSelection(p.getWorld(), new Vector(playerLoc.getBlockX() - 20, playerLoc.getBlockY() + 20, playerLoc.getBlockZ() + 50), new Vector(playerLoc.getBlockX() + 20, playerLoc.getBlockY() - 20, playerLoc.getBlockZ() - 50));
		int blockCount = defaultCs.getArea();
		auswahlAnzeigen((Region)defaultCs, p);
	}
	
	public void spielerDefaultGsErklaeren(Player p)
	{
		p.sendMessage("Das ist die normale Grundstueckgroesse. Sie geht in jede Richtung 20 Bloecke und geht");
		p.sendMessage("50 Bloecke hoch und tief. Wenn du mit der Auswahl zufrieden bist, gibst du '/gs ask' ein");
		p.sendMessage("und ein Teammitglied kommt und wird deine Auswahl überprufen. Für weitere Infos gibst du bitte");
		p.sendMessage("'/gs' ein.");
	}
	
	public static boolean auswahlAnzeigen(Region region, Player p)
	{
		EditSession es = new EditSession((LocalWorld) p.getWorld(), 1500000);
		try {
			es.makeCuboidWalls(region, new BaseBlock(BlockID.GLASS));
		} catch (MaxChangedBlocksException e) {
			return false;
		}
		return true;
	}
	
	public static int preisBerechnen()
	{
		return 0;
	}
}
