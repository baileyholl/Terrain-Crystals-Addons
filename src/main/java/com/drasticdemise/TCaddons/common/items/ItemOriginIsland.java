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
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemOriginIsland extends TerrainCrystalAbstract{
	
	public ItemOriginIsland(){
		setUnlocalizedName("itemOriginIsland");
		setRegistryName("itemOriginIsland");
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
		super.gatherBlockGenList(itemStackIn, worldIn, playerIn, 11, BOPBiomes.origin_island.get(), true);
		return new ActionResult(EnumActionResult.PASS, itemStackIn);
	}
	@Override
	protected int generateBlocksInWorld(BlockPos pos, World worldIn, EntityPlayer playerIn, int blocksGenerated,
			Biome desiredBiome, boolean changeBiome) {
		if(eligibleStateLocation(worldIn, pos)){
			int posY = MathHelper.floor_double(playerIn.posY);
			if(posY - pos.getY() == 1){
				super.setBiome(worldIn, pos, desiredBiome, changeBiome);
				
				worldIn.setBlockState(pos, BOPBlocks.grass.getStateFromMeta(5));
				decoratePlatform(worldIn, pos);
			}else{
				worldIn.setBlockState(pos, Blocks.DIRT.getDefaultState());
			}
			blocksGenerated++;
		}
		return blocksGenerated;
	}
	@Override
	protected void decoratePlatform(World worldIn, BlockPos pos) {
		//BOP flowers from JSON - variants are zero indexed.
	//https://github.com/Glitchfiend/BiomesOPlenty/blob/8c2169b8c4448df153cab3ec4e7451d5fa84ce25/src/main/resources/assets/biomesoplenty/blockstates/flower_0.json
		if (BOPBlocks.sapling_1.canPlaceBlockAt(worldIn, pos.up()) && spacedFarEnough(worldIn, pos.up())){
			if(Math.random() <= .01){
				//Rose
				if(Math.random() < .5){
					worldIn.setBlockState(pos.up(), BOPBlocks.flower_1.getStateFromMeta(5));
				}else{
					//Yellow flower
					worldIn.setBlockState(pos.up(), Blocks.YELLOW_FLOWER.getDefaultState());
				}
			}
			if(Math.random() <= 0.01){
				worldIn.setBlockState(pos.up(), BOPBlocks.sapling_1.getDefaultState());
				bonemealTree(worldIn, pos);
			}
		}
	}
}
