package me.scspteam.gs;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CE_gs implements CommandExecutor
{
	@SuppressWarnings("unused")
	private scsgs Plugin;
	
	public CE_gs(scsgs plugin)
	{
		Plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{	 
		GS gs;
		if (cmd.getName().equalsIgnoreCase("gs")) 
		{
			if(args.length == 0)
			{
				sender.sendMessage(ChatColor.DARK_RED + "Wilkommen, " + sender.getName() + ChatColor.GOLD + " zur Erklärung von des /gs Commands. " );
				sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "Erst brauchst du Geld, welches du dir " );
				sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "erwirtschaften musst. " );
				sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "Dann kannst du dir überall auf der Welt einen " );
				sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "Platz suchen." );
				sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "Um dir diesen Platz zu sichern, gibst du '/gs auswahl' ein" );
				sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "Dieser Command speichert dein Inventar. Du bekommst 2 Tools:" );
				sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "Holzschaufel: Markiere deinen Bereich, in dem du bauen willt(wie bei WorldEdit)" );
				sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "Stick: Expandet den Bereich , den du ausgewaehlt hast" );
				sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "Wenn du dir einen Bereich ausgesucht hast, gibst du 'gs ask' ein." );
				sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "Du siehst dann deine Auswahl. Diese wird durch Glas sichtbar und dir" );
				sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "wird der Preis für das GS angezeigt.");
				sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "Wenn du mit der Auswahl zufrieden bist, kannst du deine Auswahl mit '/gs ja'" );
				sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "bestellen.");
				sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "Irgendwann wird dann eine Person aus dem Team kommen und den Platz begutachten." );
				sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "Ist der Platz okay, wird das Geld von deinem Konto abgezogen und du" );
				sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "du bekommst eine Meldung, dass du jetzt anfangen kannst zu bauen..");
				sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "Hast du nicht genug Geld oder das Grunstück liegt an einem unguenstigen Ort, passiert nichts und");
				sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "du bekommst eine Nachricht, dass du an diesem Platz nicht bauen kannst.");
				sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "Falls die deine Auswahl nicht gefaellt, gibst du '/gs nein' ein und du kannst weiter");
				sender.sendMessage(ChatColor.GOLD + "[Skate´s Community Server] " + ChatColor.GOLD + "dein Grundstück anpassen. Den GS-Modus kannst du mit '/gs leave' verlassen.");
			}
			if(args.length == 1 && args[0] == "start")
			{
				gs = new GS((Player) sender);
			}
		}
		return false;
	}

}
