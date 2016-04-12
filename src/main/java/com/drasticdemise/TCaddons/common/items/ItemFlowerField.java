package com.drasticdemise.TCaddons.common.items;

import biomesoplenty.api.biome.BOPBiomes;
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

public class ItemFlowerField extends BOPTerrainCrystalAbstract{
	public ItemFlowerField(){
		setUnlocalizedName("itemFlowerField");
		setRegistryName("itemFlowerField");
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
		super.gatherBlockGenList(itemStackIn, worldIn, playerIn, 11, BOPBiomes.flower_field.get(), true);
		return new ActionResult(EnumActionResult.PASS, itemStackIn);
	}

	@Override
	protected void decoratePlatform(World worldIn, BlockPos pos) {
		double num = Math.random();
		if(num < 0.25){
			worldIn.setBlockState(pos.up(), Blocks.red_flower.getStateFromMeta(4));
		}else if(num < 0.5){
			worldIn.setBlockState(pos.up(), Blocks.red_flower.getStateFromMeta(5));
		}else if(num < .75){
			worldIn.setBlockState(pos.up(), Blocks.red_flower.getStateFromMeta(6));
		}else{
			worldIn.setBlockState(pos.up(), Blocks.red_flower.getStateFromMeta(7));
		}
		
	}
	
	@Override
	public void growTree(World worldIn, BlockPos pos) {
		// TODO Auto-generated method stub
		
	}
}
