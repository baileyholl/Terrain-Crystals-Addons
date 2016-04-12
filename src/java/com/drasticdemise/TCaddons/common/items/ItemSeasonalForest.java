package com.drasticdemise.TCaddons.common.items;

import java.util.Random;

import biomesoplenty.api.biome.BOPBiomes;
import biomesoplenty.api.block.BOPBlocks;
import net.minecraft.block.IGrowable;
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
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemSeasonalForest extends BOPTerrainCrystalAbstract{
	public ItemSeasonalForest(){
		setUnlocalizedName("itemSeasonalForest");
		setRegistryName("itemSeasonalForest");
		setCreativeTab(CreativeTabs.tabBlock);
		setHarvestLevel("stone", 0);
		setMaxStackSize(1);
		//setMaxDamage
		setMaxDamage(7000);
		GameRegistry.register(this);
	}

	@Override
	public ActionResult<ItemStack> func_77659_a(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn,
			EnumHand hand) {
		super.gatherBlockGenList(itemStackIn, worldIn, playerIn, 11, BOPBiomes.seasonal_forest.get(), true);
		return new ActionResult(EnumActionResult.PASS, itemStackIn);
	}
	@Override
	protected void decoratePlatform(World worldIn, BlockPos pos) {
		if(Math.random() < 0.5){
			if(Math.random() < 0.8){
				genGrass(worldIn, pos);
			}else{
				genFlowers(worldIn, pos);
			}
			if(Math.random() < 0.06 && spacedFarEnough(worldIn, pos.up(), 7)){
				growTree(worldIn, pos);
			}
		}
	}
	@Override
	public void growTree(World worldIn, BlockPos pos) {
		double num = Math.random();
		if(num < 0.25){
			//Oak
			worldIn.setBlockState(pos.up(), Blocks.sapling.getDefaultState());
		}else if (num < 0.45){
			//Yellow Autumn
			worldIn.setBlockState(pos.up(), BOPBlocks.sapling_0.getStateFromMeta(0));
		}else if (num < 0.65){
			//Orange Autumn
			worldIn.setBlockState(pos.up(), BOPBlocks.sapling_0.getStateFromMeta(1));
		}else if (num < 0.85){
			//Maple
			worldIn.setBlockState(pos.up(), BOPBlocks.sapling_1.getStateFromMeta(3));
		}else{
			//Dying
			worldIn.setBlockState(pos.up(), BOPBlocks.sapling_0.getStateFromMeta(5));
		}
		bonemealTree(worldIn, pos);
	}
	
	@Override
	public void genFlowers(World worldIn, BlockPos pos){
		double num = Math.random();
		if(num < 0.5){
			//Poppy
			worldIn.setBlockState(pos.up(), Blocks.red_flower.getDefaultState());
		}else{
			//Dandelion
			worldIn.setBlockState(pos.up(), Blocks.yellow_flower.getDefaultState());
		}
	}
}
