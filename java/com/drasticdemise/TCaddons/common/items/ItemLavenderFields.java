package com.drasticdemise.TCaddons.common.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemLavenderFields extends BOPTerrainCrystalAbstract{
	public ItemLavenderFields(){
		setUnlocalizedName("itemLavenderFields");
		setRegistryName("itemLavenderFields");
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected int generateBlocksInWorld(BlockPos pos, World worldIn, EntityPlayer playerIn, int blocksGenerated,
			BiomeGenBase desiredBiome, boolean changeBiome) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected void decoratePlatform(World worldIn, BlockPos pos) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void growTree(World worldIn, BlockPos pos) {
		// TODO Auto-generated method stub
		
	}

}
