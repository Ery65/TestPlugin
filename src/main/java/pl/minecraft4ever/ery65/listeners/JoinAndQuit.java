package pl.minecraft4ever.ery65.listeners;

import net.minecraft.util.com.google.common.collect.Lists;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import pl.minecraft4ever.ery65.test.TestPlugin;

public class JoinAndQuit implements Listener {
	
	@EventHandler
	void onJoin(PlayerJoinEvent e){
		TestPlugin.plugin.players.add(e.getPlayer().getName());
	}
	
	@EventHandler
	void onQuit(PlayerQuitEvent e){
		TestPlugin.plugin.players.remove(e.getPlayer().getName());
		if (TestPlugin.plugin.players == null)
			TestPlugin.plugin.players = Lists.newArrayList();
	}

}
