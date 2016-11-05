package com.BaileyHollingsworth.TCaddons.common;

import com.BaileyHollingsworth.TCaddons.common.items.*;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
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

    public static void init() {
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

    public static void recipes() {
        ItemStack plainsStack = new ItemStack(com.BaileyHollingsworth.TerrainCrystals.core.InitItems.terrainCrystalPlains);
        ItemStack cherryBlossomStack = new ItemStack(InitItems.itemCherryBlossom);
        ItemStack originIslandStack = new ItemStack(InitItems.itemOriginIsland);
        ItemStack mysticGroveStack = new ItemStack(InitItems.itemMysticGrove);
        ItemStack flowerFieldStack = new ItemStack(InitItems.itemFlowerField);
        ItemStack flowerIslandStack = new ItemStack(InitItems.itemFlowerIsland);
        ItemStack lavenderFieldsStack = new ItemStack(InitItems.itemLavenderFields);
        ItemStack orchardStack = new ItemStack(InitItems.itemOrchard);
        ItemStack seasonalForestStack = new ItemStack(InitItems.itemSeasonalForest);
        ItemStack mapleWoodsStack = new ItemStack(InitItems.itemMapleWoods);
        ItemStack bambooForestStack = new ItemStack(InitItems.itemBambooForest);
        ItemStack coniferousForestStack = new ItemStack(InitItems.itemConiferousForest);
        ItemStack ominousWoodsStack = new ItemStack(InitItems.itemOminousWoods);
        ItemStack sacredSpringsStack = new ItemStack(InitItems.itemSacredSprings);

        GameRegistry.addRecipe(
                new ItemStack(InitItems.itemCherryBlossom),
                "x",
                'x',plainsStack);
        GameRegistry.addRecipe(
                new ItemStack(InitItems.itemOriginIsland),
                "x",
                'x',cherryBlossomStack);
        GameRegistry.addRecipe(
                new ItemStack(InitItems.itemMysticGrove),
                "x",
                'x',originIslandStack);
        GameRegistry.addRecipe(
                new ItemStack(InitItems.itemFlowerField),
                "x",
                'x',mysticGroveStack);
        GameRegistry.addRecipe(
                new ItemStack(InitItems.itemFlowerIsland),
                "x",
                'x',flowerFieldStack);
        GameRegistry.addRecipe(
                new ItemStack(InitItems.itemLavenderFields),
                "x",
                'x',flowerIslandStack);
        GameRegistry.addRecipe(
                new ItemStack(InitItems.itemOrchard),
                "x",
                'x',lavenderFieldsStack);
        GameRegistry.addRecipe(
                new ItemStack(InitItems.itemSeasonalForest),
                "x",
                'x',orchardStack);
        GameRegistry.addRecipe(
                new ItemStack(InitItems.itemMapleWoods),
                "x",
                'x',seasonalForestStack);
        GameRegistry.addRecipe(
                new ItemStack(InitItems.itemBambooForest),
                "x",
                'x',mapleWoodsStack);
        GameRegistry.addRecipe(
                new ItemStack(InitItems.itemConiferousForest),
                "x",
                'x',bambooForestStack);
        GameRegistry.addRecipe(
                new ItemStack(InitItems.itemOminousWoods),
                "x",
                'x',coniferousForestStack);
        GameRegistry.addRecipe(
                new ItemStack(InitItems.itemSacredSprings),
                "x",
                'x',ominousWoodsStack);
        GameRegistry.addRecipe(new ItemStack(com.BaileyHollingsworth.TerrainCrystals.core.InitItems.terrainCrystalPlains),
                "x",
                'x',sacredSpringsStack);

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

