package pl.minecaft4ever.ery65.PlayersTools;

import java.util.Map;

import com.google.common.collect.Maps;

import pl.minecraft4ever.ery65.accesories.ExpRing;
import pl.minecraft4ever.ery65.accesories.Tool;

public class PlayerActiveTools {
	
	Map<Long, Tool> tools;
	
	public PlayerActiveTools(){
		tools = Maps.newHashMap();
	}
	
	public PlayerActiveTools(Map<Long, Tool> tools){
		this.tools = tools;
	}
	
	public boolean havePD(){
		for (Map.Entry<Long, Tool> a:tools.entrySet()){
			if (a.getValue() instanceof ExpRing){
				if (a.getKey()>System.currentTimeMillis()){
					return true;
				}
			}
		}
		return false;
	}

}
