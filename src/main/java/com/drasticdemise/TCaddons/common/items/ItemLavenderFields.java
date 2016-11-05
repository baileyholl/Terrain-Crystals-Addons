package com.drasticdemise.TCaddons.common.items;

import biomesoplenty.api.biome.BOPBiomes;
import biomesoplenty.api.block.BOPBlocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class ItemLavenderFields extends BOPTerrainCrystalAbstract {
    public ItemLavenderFields() {
        super("LavenderFields");
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

    @Override
    protected Biome getBiomeType() {
        return BOPBiomes.lavender_fields.get();
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
