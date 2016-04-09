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

public class ItemFlowerIsland extends BOPTerrainCrystalAbstract{
	
	public ItemFlowerIsland(){
		setUnlocalizedName("itemFlowerIsland");
		setRegistryName("itemFlowerIsland");
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
		super.gatherBlockGenList(itemStackIn, worldIn, playerIn, 11, BOPBiomes.flower_island.get(), true);
		return new ActionResult(EnumActionResult.PASS, itemStackIn);
	}

	@Override
	protected int generateBlocksInWorld(BlockPos pos, World worldIn, EntityPlayer playerIn, int blocksGenerated,
			BiomeGenBase desiredBiome, boolean changeBiome) {
		
		if(eligibleStateLocation(worldIn, pos)){
			int posY = MathHelper.floor_double(playerIn.posY);
			if(posY - pos.getY() == 1){
				super.setBiome(worldIn, pos, desiredBiome, changeBiome);
				worldIn.setBlockState(pos, Blocks.grass.getDefaultState());
				decoratePlatform(worldIn, pos);
			}else{
				worldIn.setBlockState(pos, Blocks.dirt.getDefaultState());
			}
		}
		return blocksGenerated++;
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
