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

public class ItemMapleWoods extends BOPTerrainCrystalAbstract{
	public ItemMapleWoods(){
		setUnlocalizedName("itemMapleWoods");
		setRegistryName("itemMapleWoods");
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setHarvestLevel("stone", 0);
		setMaxStackSize(1);
		setMaxDamage(7000);
		GameRegistry.register(this);
	}
	@Override
	protected void decoratePlatform(World worldIn, BlockPos pos) {
		if(Math.random() < 0.5){
			genGrass(worldIn, pos);
		}
		if(Math.random() < 0.08 && spacedFarEnough(worldIn, pos.up())){
			if(Math.random() < 0.98){
				//Maple
				worldIn.setBlockState(pos.up(), BOPBlocks.sapling_1.getStateFromMeta(3));
			}else{
				//Spruce
				worldIn.setBlockState(pos.up(), Blocks.SAPLING.getStateFromMeta(1));
			}
			bonemealTree(worldIn, pos);
		}
	}

	@Override
	public ActionResult<ItemStack> func_77659_a(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn,
			EnumHand hand) {
		super.gatherBlockGenList(itemStackIn, worldIn, playerIn, 11, BOPBiomes.maple_woods.get(), true);
		return new ActionResult(EnumActionResult.PASS, itemStackIn);
	}

}
