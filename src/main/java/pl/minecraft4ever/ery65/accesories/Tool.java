package pl.minecraft4ever.ery65.accesories;

import net.minecraft.server.v1_7_R1.ItemStack;
import pl.minecraft4ever.ery65.test.Gamer;

public interface Tool {
	
	public boolean isAccesible(Gamer player);
	
	public ItemStack getItem();
	
	public int getChanse();
	
	public void checkTimeout();

}
