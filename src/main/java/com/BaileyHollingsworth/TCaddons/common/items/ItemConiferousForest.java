package com.BaileyHollingsworth.TCaddons.common.items;

import biomesoplenty.api.biome.BOPBiomes;
import biomesoplenty.api.block.BOPBlocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class ItemConiferousForest extends BOPTerrainCrystalAbstract {

    public ItemConiferousForest() {
        super("ConiferousForest");
    }

    @Override
    protected void decoratePlatform(World worldIn, BlockPos pos) {
        if (Math.random() < 0.5) {
            genGrass(worldIn, pos);
        }
        if (Math.random() < 0.09 && spacedFarEnough(worldIn, pos.up(), 7)) {
            //Fir
            worldIn.setBlockState(pos.up(), BOPBlocks.sapling_0.getStateFromMeta(6));
            bonemealTree(worldIn, pos);
        }
    }

    @Override
    protected Biome getBiomeType() {
        return BOPBiomes.coniferous_forest.get();
    }
}
