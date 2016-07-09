package com.drasticdemise.TCaddons.common.items;

import biomesoplenty.api.biome.BOPBiomes;
import biomesoplenty.api.block.BOPBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemOminousWoods extends BOPTerrainCrystalAbstract{
	public ItemOminousWoods(){
		setUnlocalizedName("itemOminousWoods");
		setRegistryName("itemOminousWoods");
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setHarvestLevel("stone", 0);
		setMaxStackSize(1);
		setMaxDamage(7000);
		GameRegistry.register(this);
	}
	@Override
	public ActionResult<ItemStack> func_77659_a(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn,
			EnumHand hand) {
		super.gatherBlockGenList(itemStackIn, worldIn, playerIn, 11, BOPBiomes.ominous_woods.get(), true);
		return new ActionResult(EnumActionResult.PASS, itemStackIn);
	}

	@Override
	protected void decoratePlatform(World worldIn, BlockPos pos) {
		if(Math.random() < 0.5){
			double num = Math.random();
			if(num < 0.5){
				genGrass(worldIn, pos);
			}else if(num < 0.55){
				genFlowers(worldIn, pos);
			}
		}
		if(Math.random() < 0.09 && spacedFarEnough(worldIn, pos.up(), 7)){
			//Umbran
			worldIn.setBlockState(pos.up(), BOPBlocks.sapling_0.getStateFromMeta(4));
			bonemealTree(worldIn, pos);
		}
	}
	public void genFlowers(World worldIn, BlockPos pos){
		double num = Math.random();
		if(num < 0.16){
			//Death Bloom
			worldIn.setBlockState(pos.up(), BOPBlocks.flower_0.getStateFromMeta(2));
		}else if(num < 0.32){
			//Poison Ivy
			worldIn.setBlockState(pos.up(), BOPBlocks.plant_0.getStateFromMeta(4));
		}else if(num < 0.48){
			//Thorn
			worldIn.setBlockState(pos.up(), BOPBlocks.plant_1.getStateFromMeta(2));
		}else if(num < 0.64){
			//Dead leaf pile
			worldIn.setBlockState(pos.up(), BOPBlocks.plant_0.getStateFromMeta(12));
		}
	}
}
