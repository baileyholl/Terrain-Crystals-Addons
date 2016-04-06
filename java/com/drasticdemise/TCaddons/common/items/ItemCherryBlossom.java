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
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.common.registry.GameRegistry;
import biomesoplenty.api.biome.BOPBiomes;
import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.common.biome.overworld.BiomeGenCherryBlossomGrove;
import biomesoplenty.common.enums.BOPFlowers;

public class ItemCherryBlossom extends TerrainCrystalAbstract{
	
	
	public ItemCherryBlossom(){
		setUnlocalizedName("itemCherryBlossom");
		setRegistryName("itemCherryBlossom");
		setCreativeTab(CreativeTabs.tabBlock);
		setHarvestLevel("stone", 0);
		setMaxStackSize(1);
		//setMaxDamage
		setMaxDamage(7000);
        GameRegistry.registerItem(this);
	}
	@Override
	public ActionResult<ItemStack> func_77659_a(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn,
			EnumHand hand) {
		super.gatherBlockGenList(itemStackIn, worldIn, playerIn, 11, BOPBiomes.cherry_blossom_grove.get(), true);
		return new ActionResult(EnumActionResult.PASS, itemStackIn);
	}

	@Override
	protected int generateBlocksInWorld(BlockPos pos, World worldIn, EntityPlayer playerIn, int blocksGenerated,
			BiomeGenBase desiredBiome, boolean changeBiome) {
		if(eligibleStateLocation(worldIn.getBlockState(pos), pos)){
			int posY = MathHelper.floor_double(playerIn.posY);
			if(posY - pos.getY() == 1){
				super.setBiome(worldIn, pos, desiredBiome, changeBiome);
				worldIn.setBlockState(pos, Blocks.grass.getDefaultState());
				decoratePlatform(worldIn, pos);
			}else{
				worldIn.setBlockState(pos, Blocks.dirt.getDefaultState());
			}
			blocksGenerated++;
		}
		return blocksGenerated;
	}
	@Override
	protected void decoratePlatform(World worldIn, BlockPos pos) {
		//Try-catching our worries away!
		//BOP flowers from JSON - variants are zero indexed.
		//https://github.com/Glitchfiend/BiomesOPlenty/blob/8c2169b8c4448df153cab3ec4e7451d5fa84ce25/src/main/resources/assets/biomesoplenty/blockstates/flower_0.json
		try{
			if (BOPBlocks.sapling_1.canPlaceBlockAt(worldIn, pos.up())){
				if(Math.random() < .6){
					worldIn.setBlockState(pos.up(), Blocks.tallgrass.getStateFromMeta(1));
					if(Math.random() < 0.15){
						if(Math.random() < 0.2){
							//Pink Daffodil
							worldIn.setBlockState(pos.up(), BOPBlocks.flower_0.getStateFromMeta(6));
						}else if(Math.random() < 0.4){
							//White Anemone
							worldIn.setBlockState(pos.up(), BOPBlocks.flower_0.getStateFromMeta(9));
						}else if(Math.random() < 0.6){
							//Clover?
							worldIn.setBlockState(pos.up(), BOPBlocks.flower_0.getStateFromMeta(0));
						}else if(Math.random() < 0.8){
							//Oxeye daisy
							worldIn.setBlockState(pos.up(), Blocks.red_flower.getStateFromMeta(8));
						}else{
							//Houstonia/Azure Blast
							worldIn.setBlockState(pos.up(), Blocks.red_flower.getStateFromMeta(3));
						}
					}
				}
				if(Math.random() < 0.02){
					
					if(Math.random() < 0.5){
						worldIn.setBlockState(pos.up(), BOPBlocks.sapling_1.getStateFromMeta(1));
					}else{
						worldIn.setBlockState(pos.up(), BOPBlocks.sapling_1.getStateFromMeta(2));
					}
					try{
						IGrowable growable = (IGrowable) worldIn.getBlockState(pos.up()).getBlock();
						int attemptCap = 0;
						Random rand = new Random();
						while((worldIn.getBlockState(pos.up()) != Blocks.log.getDefaultState()) && attemptCap < 10){
							growable.grow(worldIn, rand, pos.up(), worldIn.getBlockState(pos.up()));
							attemptCap++;
						}
					}catch(ClassCastException e){}
				}
			}
		}
		catch(IllegalArgumentException e){
		}
	}
}
