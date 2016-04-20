package com.drasticdemise.TCaddons.common;

import com.drasticdemise.TCaddons.common.items.ItemBambooForest;
import com.drasticdemise.TCaddons.common.items.ItemCherryBlossom;
import com.drasticdemise.TCaddons.common.items.ItemConiferousForest;
import com.drasticdemise.TCaddons.common.items.ItemFlowerField;
import com.drasticdemise.TCaddons.common.items.ItemFlowerIsland;
import com.drasticdemise.TCaddons.common.items.ItemLavenderFields;
import com.drasticdemise.TCaddons.common.items.ItemMapleWoods;
import com.drasticdemise.TCaddons.common.items.ItemMysticGrove;
import com.drasticdemise.TCaddons.common.items.ItemOminousWoods;
import com.drasticdemise.TCaddons.common.items.ItemOrchard;
import com.drasticdemise.TCaddons.common.items.ItemOriginIsland;
import com.drasticdemise.TCaddons.common.items.ItemSacredSprings;
import com.drasticdemise.TCaddons.common.items.ItemSeasonalForest;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class InitItems {
	public static ItemCherryBlossom itemCherryBlossom;
	public static ItemOriginIsland itemOriginIsland;
	public static ItemMysticGrove itemMysticGrove;
	public static ItemFlowerField itemFlowerField;
	public static ItemFlowerIsland itemFlowerIsland;
	public static ItemLavenderFields itemLavenderFields;
	public static ItemOrchard itemOrchard;
	public static ItemSeasonalForest itemSeasonalForest;
	public static ItemMapleWoods itemMapleWoods;
	public static ItemBambooForest itemBambooForest;
	public static ItemConiferousForest itemConiferousForest;
	public static ItemOminousWoods itemOminousWoods;
	public static ItemSacredSprings itemSacredSprings;
	public static void init(){
		itemCherryBlossom = new ItemCherryBlossom();
		itemOriginIsland = new ItemOriginIsland();
		itemMysticGrove = new ItemMysticGrove();
		itemFlowerField = new ItemFlowerField();
		itemFlowerIsland = new ItemFlowerIsland();
		itemLavenderFields = new ItemLavenderFields();
		itemOrchard = new ItemOrchard();
		itemSeasonalForest = new ItemSeasonalForest();
		itemMapleWoods = new ItemMapleWoods();
		itemBambooForest = new ItemBambooForest();
		itemConiferousForest = new ItemConiferousForest();
		itemOminousWoods = new ItemOminousWoods();
		itemSacredSprings = new ItemSacredSprings();
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
		itemOrchard.initModel();
		itemSeasonalForest.initModel();
		itemMapleWoods.initModel();
		itemBambooForest.initModel();
		itemConiferousForest.initModel();
		itemOminousWoods.initModel();
		itemSacredSprings.initModel();
	}
}
	
