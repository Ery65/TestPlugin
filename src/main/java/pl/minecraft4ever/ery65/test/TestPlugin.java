package pl.minecraft4ever.ery65.test;

//import java.lang.reflect.Field;
import java.lang.reflect.Method;
//import java.util.Random;


import org.bukkit.Bukkit;
import org.bukkit.Material;
//import org.bukkit.Chunk;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.plugin.java.JavaPlugin;

public class TestPlugin extends JavaPlugin {

	public void onEnable(){
		System.out.println("enabling...");
		try {
			setHardness(10.0F, getRandomBlock());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("enabled!");
	}
	
	public void onDisable(){
		System.out.println("Disabled!");
	}
	
	
	public void setHardness(Float hardness, Block block) throws Exception{
		block.setType(Material.STONE);
		net.minecraft.server.v1_7_R1.Block block2 = org.bukkit.craftbukkit.v1_7_R1.util.CraftMagicNumbers.getBlock(block);
		//Field field;
		/** makes strength (protect for explosion) */
		/*field = net.minecraft.server.v1_7_R1.Block.class.getDeclaredField("strength");
		field.setAccessible(true);
		field.setFloat(block2, hardness);*/
	
		/** set durability (longer mining) */
		Method m = net.minecraft.server.v1_7_R1.Block.class.getDeclaredMethod("c", float.class);
		m.setAccessible(true);
		m.invoke(block2, hardness*10);
	}
	
	public Block getRandomBlock(){
		World w = Bukkit.getWorld("world");
		/*Chunk[] chunks = w.getLoadedChunks();
		Random r = new Random();
		int a = r.nextInt(chunks.length);
		Chunk chunk = chunks[a];
		int x = (chunk.getX()<<4)+r.nextInt(16);
		int z = (chunk.getZ()<<4)+r.nextInt(16);
		int y = w.getHighestBlockYAt(x, z);
		return w.getBlockAt(x,y,z);*/
		return w.getHighestBlockAt(30,-20);
	}

}

