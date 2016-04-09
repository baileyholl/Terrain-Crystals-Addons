package com.drasticdemise.TCaddons.common;

import com.drasticdemise.TCaddons.common.items.ItemCherryBlossom;
import com.drasticdemise.TCaddons.common.items.ItemFlowerField;
import com.drasticdemise.TCaddons.common.items.ItemFlowerIsland;
import com.drasticdemise.TCaddons.common.items.ItemLavenderFields;
import com.drasticdemise.TCaddons.common.items.ItemMysticGrove;
import com.drasticdemise.TCaddons.common.items.ItemOriginIsland;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class InitItems {
	public static ItemCherryBlossom itemCherryBlossom;
	public static ItemOriginIsland itemOriginIsland;
	public static ItemMysticGrove itemMysticGrove;
	public static ItemFlowerField itemFlowerField;
	public static ItemFlowerIsland itemFlowerIsland;
	public static ItemLavenderFields itemLavenderFields;
	
	public static void init(){
		itemCherryBlossom = new ItemCherryBlossom();
		itemOriginIsland = new ItemOriginIsland();
		itemMysticGrove = new ItemMysticGrove();
		itemFlowerField = new ItemFlowerField();
		itemFlowerIsland = new ItemFlowerIsland();
		itemLavenderFields = new ItemLavenderFields();
	}
	public static void recipes(){

	}
	@SideOnly(Side.CLIENT)
    public static void initModels() {
		itemCherryBlossom.initModel();
		itemOriginIsland.initModel();
		itemMysticGrove.initModel();
		itemFlowerField.initModel();
		itemFlowerIsland.initModel();
		itemLavenderFields.initModel();
	}
}
	
