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

public class ItemConiferousForest extends BOPTerrainCrystalAbstract{
	
	public ItemConiferousForest(){
		setUnlocalizedName("itemConiferousForest");
		setRegistryName("itemConiferousForest");
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setHarvestLevel("stone", 0);
		setMaxStackSize(1);
		setMaxDamage(7000);
		GameRegistry.register(this);
	}
	@Override
	public ActionResult<ItemStack> func_77659_a(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn,
			EnumHand hand) {
		super.gatherBlockGenList(itemStackIn, worldIn, playerIn, 11, BOPBiomes.coniferous_forest.get(), true);
		return new ActionResult(EnumActionResult.PASS, itemStackIn);
	}

	@Override
	protected void decoratePlatform(World worldIn, BlockPos pos) {
		if(Math.random() < 0.5){
			genGrass(worldIn, pos);
		}
		if(Math.random() < 0.09 && spacedFarEnough(worldIn, pos.up(), 7)){
			//Fir
			worldIn.setBlockState(pos.up(), BOPBlocks.sapling_0.getStateFromMeta(6));
			bonemealTree(worldIn, pos);
		}
	}

}
