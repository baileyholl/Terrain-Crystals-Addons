package com.drasticdemise.TCaddons.common.items;

import java.util.Random;

import com.DrasticDemise.TerrainCrystals.ConfigurationFile;
import com.DrasticDemise.TerrainCrystals.Items.TerrainCrystalAbstract;

import biomesoplenty.core.BiomesOPlenty;
import net.minecraft.block.IGrowable;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import biomesoplenty.api.biome.BOPBiomes;
import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.common.biome.overworld.BiomeGenCherryBlossomGrove;
import biomesoplenty.common.enums.BOPFlowers;

public class ItemCherryBlossom extends BOPTerrainCrystalAbstract{
	
	
	public ItemCherryBlossom(){
		setUnlocalizedName("itemCherryBlossom");
		setRegistryName("itemCherryBlossom");
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
		super.gatherBlockGenList(itemStackIn, worldIn, playerIn, 11, BOPBiomes.cherry_blossom_grove.get(), true);
		return new ActionResult(EnumActionResult.PASS, itemStackIn);
	}
	@Override
	protected void decoratePlatform(World worldIn, BlockPos pos) {
		
		if(Math.random() < .6){
			genGrass(worldIn, pos);
			if(Math.random() < 0.15){
				genFlowers(worldIn, pos);
			}
		}
		if(Math.random() < 0.03 && spacedFarEnough(worldIn, pos.up())){
			growTree(worldIn, pos);
		}
	}
	public void genFlowers(World worldIn, BlockPos pos){
		double num = Math.random();
		if(num < 0.16){
			//Pink Daffodil
			worldIn.setBlockState(pos.up(), BOPBlocks.flower_0.getStateFromMeta(6));
		}else if(num < 0.32){
			//White Anemone
			worldIn.setBlockState(pos.up(), BOPBlocks.flower_0.getStateFromMeta(9));
		}else if(num < 0.48){
			//Clover?
			worldIn.setBlockState(pos.up(), BOPBlocks.flower_0.getStateFromMeta(0));
		}else if(num < 0.64){
			//Oxeye daisy
			worldIn.setBlockState(pos.up(), Blocks.RED_FLOWER.getStateFromMeta(8));
		}else if(num < 0.80){
			//Houstonia/Azure Blast
			worldIn.setBlockState(pos.up(), Blocks.RED_FLOWER.getStateFromMeta(3));
		}
	}

	public void growTree(World worldIn, BlockPos pos){
		if(Math.random() < 0.5){
			worldIn.setBlockState(pos.up(), BOPBlocks.sapling_1.getStateFromMeta(1));
		}else{
			worldIn.setBlockState(pos.up(), BOPBlocks.sapling_1.getStateFromMeta(2));
		}
		bonemealTree(worldIn, pos);
	}
}
