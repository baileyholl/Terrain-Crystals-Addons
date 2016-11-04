package com.drasticdemise.TCaddons.common;

import com.drasticdemise.TCaddons.common.items.*;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
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
        ItemStack dirtStack = new ItemStack(Blocks.DIRT);
        ItemStack sandStack = new ItemStack(Blocks.SAND);
        ItemStack hardenedClayStack = new ItemStack(Blocks.HARDENED_CLAY);
        ItemStack grassBlockStack = new ItemStack(Blocks.GRASS);
        ItemStack snowballStack = new ItemStack(Items.SNOWBALL);
        ItemStack clayBlockStack = new ItemStack(Blocks.CLAY);
        ItemStack slimeBallStack = new ItemStack(Items.SLIME_BALL);
        ItemStack bRodStack = new ItemStack(Items.BLAZE_ROD);
        ItemStack pearlStack = new ItemStack(Items.ENDER_PEARL);
        ItemStack melonSeedStack = new ItemStack(Items.MELON_SEEDS);
        ItemStack sugarcaneStack = new ItemStack(Items.REEDS);

        ItemStack oakLeaves = new ItemStack(Blocks.LEAVES);
        ItemStack appleStack = new ItemStack(Items.APPLE);
        ItemStack oakStack = new ItemStack(Blocks.LOG);
        ItemStack spruceStack = new ItemStack(Blocks.LOG.getStateFromMeta(1).getBlock());
        ItemStack jungleStack = new ItemStack(Blocks.LOG.getStateFromMeta(3).getBlock());
        ItemStack poppyStack = new ItemStack(Blocks.RED_FLOWER);
        ItemStack dandelionStack = new ItemStack(Blocks.YELLOW_FLOWER);
        ItemStack oxeyeDaisyStack = new ItemStack(Blocks.RED_FLOWER.getStateFromMeta(8).getBlock());
        ItemStack pinkTulipStack = new ItemStack(Blocks.RED_FLOWER.getStateFromMeta(7).getBlock());
        ItemStack whiteTulipStack = new ItemStack(Blocks.RED_FLOWER.getStateFromMeta(6).getBlock());
        ItemStack blueOrchidStack = new ItemStack(Blocks.RED_FLOWER.getStateFromMeta(1).getBlock());
        ItemStack redTulipStack = new ItemStack(Blocks.RED_FLOWER.getStateFromMeta(4).getBlock());
        ItemStack orangeTulipStack = new ItemStack(Blocks.RED_FLOWER.getStateFromMeta(5).getBlock());
        ItemStack alliumStack = new ItemStack(Blocks.RED_FLOWER.getStateFromMeta(2).getBlock());
        ItemStack glowstoneStack = new ItemStack(Items.GLOWSTONE_DUST);
        ItemStack redstoneStack = new ItemStack(Items.REDSTONE);
        ItemStack goldBlockStack = new ItemStack(Blocks.GOLD_BLOCK);

        GameRegistry.addRecipe(
                new ItemStack(InitItems.itemCherryBlossom),
                "xyx",
                "ywy",
                "xyx",
                'w', goldBlockStack, 'x', pinkTulipStack, 'y', whiteTulipStack);
        GameRegistry.addRecipe(
                new ItemStack(InitItems.itemBambooForest),
                "xxx",
                "xwx",
                "xxx",
                'w', goldBlockStack, 'x', sugarcaneStack);
        GameRegistry.addRecipe(
                new ItemStack(InitItems.itemConiferousForest),
                "xxx",
                "xwx",
                "xxx",
                'w', goldBlockStack, 'x', spruceStack);
        GameRegistry.addRecipe(
                new ItemStack(InitItems.itemFlowerField),
                "xyx",
                "ywy",
                "xyx",
                'w', goldBlockStack, 'x', poppyStack, 'y', dandelionStack);
        GameRegistry.addRecipe(
                new ItemStack(InitItems.itemFlowerIsland),
                "yxy",
                "xwx",
                "yxy",
                'w', goldBlockStack, 'x', poppyStack, 'y', dandelionStack);
        GameRegistry.addRecipe(
                new ItemStack(InitItems.itemLavenderFields),
                "xxx",
                "ywy",
                "xxx",
                'w', goldBlockStack, 'x', poppyStack, 'y', dandelionStack);
        GameRegistry.addRecipe(
                new ItemStack(InitItems.itemMapleWoods),
                "yxx",
                "xwx",
                "xxy",
                'w', goldBlockStack, 'x', oakStack, 'y', spruceStack);
        GameRegistry.addRecipe(
                new ItemStack(InitItems.itemMysticGrove),
                "xyx",
                "ywy",
                "xyx",
                'w', goldBlockStack, 'x', glowstoneStack, 'y', redstoneStack);
        GameRegistry.addRecipe(
                new ItemStack(InitItems.itemOminousWoods),
                "yxy",
                "xwx",
                "yxy",
                'w', goldBlockStack, 'x', pearlStack, 'y', glowstoneStack);
        GameRegistry.addRecipe(
                new ItemStack(InitItems.itemOrchard),
                "xyx",
                "ywy",
                "xyx",
                'w', goldBlockStack, 'x', appleStack, 'y', oakStack);
        GameRegistry.addRecipe(
                new ItemStack(InitItems.itemOriginIsland),
                "xxy",
                "xwx",
                "yxx",
                'w', goldBlockStack, 'x', oakStack, 'y', grassBlockStack);
        GameRegistry.addRecipe(
                new ItemStack(InitItems.itemSacredSprings),
                "xyx",
                "ywy",
                "xyx",
                'w', goldBlockStack, 'x', jungleStack, 'y', oakLeaves);
        GameRegistry.addRecipe(
                new ItemStack(InitItems.itemSeasonalForest),
                "xyx",
                "ywy",
                "yxy",
                'w', goldBlockStack, 'x', oakLeaves, 'y', oakStack);
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

