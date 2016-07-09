package com.drasticdemise.TCaddons.common.items;

import biomesoplenty.api.biome.BOPBiomes;
import biomesoplenty.common.block.BlockBOPLeaves;
import biomesoplenty.common.block.BlockBOPLog;
import biomesoplenty.common.enums.BOPTrees;
import biomesoplenty.common.enums.BOPWoods;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemFlowerIsland extends BOPTerrainCrystalAbstract{
	
	public ItemFlowerIsland(){
		setUnlocalizedName("itemFlowerIsland");
		setRegistryName("itemFlowerIsland");
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setHarvestLevel("stone", 0);
		setMaxStackSize(1);
		//setMaxDamage
		setMaxDamage(7000);
		GameRegistry.register(this);
	}

	@Override
	public ActionResult<ItemStack> func_77659_a(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn,
			EnumHand hand) {
		super.gatherBlockGenList(itemStackIn, worldIn, playerIn, 11, BOPBiomes.flower_island.get(), true);
		return new ActionResult(EnumActionResult.PASS, itemStackIn);
	}
	@Override
	protected void decoratePlatform(World worldIn, BlockPos pos) {
		if(Math.random() < 0.02 && spacedFarEnough(worldIn, pos.up(), 11)){
			if(Math.random() < 0.5){
				generateRedFlower(worldIn, pos);
			}else{
				generateYellowFlower(worldIn, pos);
			}
		}else{
			genGrass(worldIn, pos);
		}
	}
	
	private void generateYellowFlower(World worldIn, BlockPos pos) {
		//worldIn.setBlockState(pos.up(6), BlockBOPLog.paging.getVariantState(BOPWoods.GIANT_FLOWER));
		//worldIn.setBlockState(pos.up(7), BlockBOPLog.paging.getVariantState(BOPWoods.GIANT_FLOWER));
		
        worldIn.setBlockState(pos.add(-1, 4, 0) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(1, 4, 0) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 4, -1) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 4, 1) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        
        worldIn.setBlockState(pos.add(2, 4, 2) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(2, 4, -2) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-2, 4, 2) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-2, 4, -2) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        
        worldIn.setBlockState(pos.add(0, 5, 0) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-1, 5, 0) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(1, 5, 0) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 5, -1) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 5, 1) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(1, 5, 1) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));

        worldIn.setBlockState(pos.add(1, 5, -1) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-1, 5, 1) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-1, 5, -1) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(2, 5, 0) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-2, 5, 0) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 5, 2) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 5, -2) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
                       
        worldIn.setBlockState(pos.add(0, 6, 0) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(3, 6, 0) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-3, 6, 0) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 6, 3) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 6, -3) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.up(1), BlockBOPLog.paging.getVariantState(BOPWoods.GIANT_FLOWER));
		worldIn.setBlockState(pos.up(2), BlockBOPLog.paging.getVariantState(BOPWoods.GIANT_FLOWER));
		worldIn.setBlockState(pos.up(3), BlockBOPLog.paging.getVariantState(BOPWoods.GIANT_FLOWER));
		worldIn.setBlockState(pos.up(4), BlockBOPLog.paging.getVariantState(BOPWoods.GIANT_FLOWER));
		worldIn.setBlockState(pos.up(5), BlockBOPLog.paging.getVariantState(BOPWoods.GIANT_FLOWER));
		
	}

	private void generateRedFlower(World worldIn, BlockPos pos) {
		//BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER) - Red stem
		
        
        worldIn.setBlockState(pos.add(-1, 4, 0) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(1, 4, 0) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 4, -1) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 4, 1) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        
        worldIn.setBlockState(pos.add(0, 5, 0) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-1, 5, 0) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(1, 5, 0) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 5, -1) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 5, 1) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(1, 5, 1) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(1, 5, -1) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-1, 5, 1) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-1, 5, -1) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(2, 5, 0) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-2, 5, 0) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 5, 2) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 5, -2) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        
        worldIn.setBlockState(pos.up(1), BlockBOPLog.paging.getVariantState(BOPWoods.GIANT_FLOWER));
		worldIn.setBlockState(pos.up(2), BlockBOPLog.paging.getVariantState(BOPWoods.GIANT_FLOWER));
		worldIn.setBlockState(pos.up(3), BlockBOPLog.paging.getVariantState(BOPWoods.GIANT_FLOWER));
		worldIn.setBlockState(pos.up(4), BlockBOPLog.paging.getVariantState(BOPWoods.GIANT_FLOWER));
		worldIn.setBlockState(pos.up(5), BlockBOPLog.paging.getVariantState(BOPWoods.GIANT_FLOWER));
		worldIn.setBlockState(pos.up(6), BlockBOPLog.paging.getVariantState(BOPWoods.GIANT_FLOWER));
		
		worldIn.setBlockState(pos.add(1, 6, 1) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(1, 6, -1) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-1, 6, 1) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-1, 6, -1) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(2, 6, 0) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-2, 6, 0) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 6, 2) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 6, -2) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(2, 6, 2) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(2, 6, -2) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-2, 6, 2) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-2, 6, -2) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        
		worldIn.setBlockState(pos.add(2, 7, 0) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-2, 7, 0) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 7, 2) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 7, -2) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        
        worldIn.setBlockState(pos.add(3, 8, 0) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-3, 8, 0) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 8, 3) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 8, -3) ,BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
	}
}
