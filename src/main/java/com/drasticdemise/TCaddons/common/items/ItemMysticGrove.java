package com.drasticdemise.TCaddons.common.items;

import java.util.Random;

import com.DrasticDemise.TerrainCrystals.Items.TerrainCrystalAbstract;

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
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemMysticGrove extends BOPTerrainCrystalAbstract{
	
	public ItemMysticGrove(){
		setUnlocalizedName("itemMysticGrove");
		setRegistryName("itemMysticGrove");
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
		super.gatherBlockGenList(itemStackIn, worldIn, playerIn, 11, BOPBiomes.mystic_grove.get(), true);
		return new ActionResult(EnumActionResult.PASS, itemStackIn);
	}
	@Override
	protected void decoratePlatform(World worldIn, BlockPos pos) {
		//Grass
		double num = Math.random();
		if(num < .5){
			genGrass(worldIn, pos);
			if(Math.random() <= 0.05){
				genFlowers(worldIn, pos);
			}
		}
		if(Math.random() < 0.03 && spacedFarEnough(worldIn, pos.up())){
			growTree(worldIn, pos);
		}

	}
	public void growTree(World worldIn, BlockPos pos) {
		//sapling_01 5,6
		//sapling_0  3
		//default oak
		double num = Math.random();
		if(num < 0.25){
			//Flowering oak
			worldIn.setBlockState(pos.up(), BOPBlocks.sapling_1.getStateFromMeta(5));
		}else if(num < .50){
			//Jacandara
			worldIn.setBlockState(pos.up(), BOPBlocks.sapling_1.getStateFromMeta(6));
		}else if(num < 0.75){
			//Magic
			worldIn.setBlockState(pos.up(), BOPBlocks.sapling_0.getStateFromMeta(3));
		}else{
			//Oak
			worldIn.setBlockState(pos.up(), Blocks.SAPLING.getDefaultState());
		}
		bonemealTree(worldIn, pos);
	}
}

