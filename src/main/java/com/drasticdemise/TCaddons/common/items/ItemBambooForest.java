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
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemBambooForest extends BOPTerrainCrystalAbstract{
	public ItemBambooForest(){
		setUnlocalizedName("itemBambooForest");
		setRegistryName("itemBambooForest");
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
		super.gatherBlockGenList(itemStackIn, worldIn, playerIn, 11, BOPBiomes.bamboo_forest.get(), true);
		return new ActionResult(EnumActionResult.PASS, itemStackIn);
	}
	protected int generateBlocksInWorld(BlockPos pos, World worldIn, EntityPlayer playerIn, int blocksGenerated, BiomeGenBase desiredBiome, boolean changeBiome){
		if(eligibleStateLocation(worldIn, pos)){
			int posY = MathHelper.floor_double(playerIn.posY);
			if(posY - pos.getY() == 1){
				setBiome(worldIn, pos, desiredBiome, changeBiome);
				worldIn.setBlockState(pos, Blocks.dirt.getStateFromMeta(2));
				decoratePlatform(worldIn, pos);
			}else{
				worldIn.setBlockState(pos, Blocks.dirt.getDefaultState());
			}
		}
		return blocksGenerated++;
	}
	@Override
	protected void decoratePlatform(World worldIn, BlockPos pos) {
		double num = Math.random();
		if(num < 0.3 && spacedFarEnough(worldIn, pos.up())){
			worldIn.setBlockState(pos.up(), BOPBlocks.sapling_0.getStateFromMeta(2));
			bonemealTree(worldIn, pos);
		}else if(num < 0.5){
			if(Math.random() < 0.50){
				worldIn.setBlockState(pos.up(), Blocks.tallgrass.getStateFromMeta(2));
			}else{
				worldIn.setBlockState(pos.up(), Blocks.tallgrass.getStateFromMeta(1));
			}
		}else if(num < .8 && spacedFarEnough(worldIn, pos.up())){
			genBush(worldIn, pos);
		}
	}
	protected void genBush(World worldIn, BlockPos pos){
		worldIn.setBlockState(pos.up(), Blocks.leaves.getDefaultState());
		worldIn.setBlockState(pos.up(2), Blocks.leaves.getDefaultState());
		worldIn.setBlockState(pos.up().east(), Blocks.leaves.getDefaultState());
		worldIn.setBlockState(pos.up().north(), Blocks.leaves.getDefaultState());
		worldIn.setBlockState(pos.up().south(), Blocks.leaves.getDefaultState());
		worldIn.setBlockState(pos.up().west(), Blocks.leaves.getDefaultState());
		if(Math.random() < .3){
			worldIn.setBlockState(pos.up().north().east(), Blocks.leaves.getDefaultState());
			worldIn.setBlockState(pos.up().north().west(), Blocks.leaves.getDefaultState());
			worldIn.setBlockState(pos.up().south().east(), Blocks.leaves.getDefaultState());
			worldIn.setBlockState(pos.up().south().west(), Blocks.leaves.getDefaultState());
		}
		worldIn.setBlockState(pos, Blocks.log.getStateFromMeta(3));
	}

}
