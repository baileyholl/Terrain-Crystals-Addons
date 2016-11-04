package com.drasticdemise.TCaddons.common.items;

import biomesoplenty.api.biome.BOPBiomes;
import biomesoplenty.api.block.BOPBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemLavenderFields extends BOPTerrainCrystalAbstract {
    public ItemLavenderFields() {
        setUnlocalizedName("itemLavenderFields");
        setRegistryName("itemLavenderFields");
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
        super.gatherBlockGenList(itemStackIn, worldIn, playerIn, 11, BOPBiomes.lavender_fields.get(), true);
        return new ActionResult(EnumActionResult.PASS, itemStackIn);
    }

    @Override
    protected void decoratePlatform(World worldIn, BlockPos pos) {
        if (Math.random() < .95) {
            //Lavender
            worldIn.setBlockState(pos.up(), BOPBlocks.flower_1.getStateFromMeta(0));
        } else {
            if (Math.random() < .3 && spacedFarEnough(worldIn, pos.up())) {
                growTree(worldIn, pos);
            } else {
                genGrass(worldIn, pos);
            }
        }
    }

    public void growTree(World worldIn, BlockPos pos) {
        if (Math.random() < 0.5) {
            //Flowering Oak
            worldIn.setBlockState(pos.up(), BOPBlocks.sapling_1.getStateFromMeta(5));
        } else {
            //Jacandara
            worldIn.setBlockState(pos.up(), BOPBlocks.sapling_1.getStateFromMeta(6));
        }
        bonemealTree(worldIn, pos);
    }
}
