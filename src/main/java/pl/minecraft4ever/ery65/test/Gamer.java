package pl.minecraft4ever.ery65.test;

import java.util.Map;

import pl.minecaft4ever.ery65.PlayersTools.PlayerActiveTools;
import pl.minecraft4ever.ery65.accesories.Tool;

public class Gamer {
	
	private int lvl;
	private float exp;
	private Map<Long, Tool> tools;
	
	public PlayerActiveTools getPlayerTools(){
		return new PlayerActiveTools(tools);
	}

}
