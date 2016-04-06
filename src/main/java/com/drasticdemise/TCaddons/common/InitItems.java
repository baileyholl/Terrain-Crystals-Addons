package com.drasticdemise.TCaddons.common;

import com.drasticdemise.TCaddons.common.items.ItemCherryBlossom;
import com.drasticdemise.TCaddons.common.items.ItemOriginIsland;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class InitItems {
	public static ItemCherryBlossom itemCherryBlossom;
	public static ItemOriginIsland itemOriginIsland;
	public static void init(){
		itemCherryBlossom = new ItemCherryBlossom();
		itemOriginIsland = new ItemOriginIsland();
	}
	public static void recipes(){

	}
	@SideOnly(Side.CLIENT)
    public static void initModels() {
		itemCherryBlossom.initModel();
		itemOriginIsland.initModel();
	}
}
	
