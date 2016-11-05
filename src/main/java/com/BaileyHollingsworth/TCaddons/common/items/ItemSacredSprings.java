package com.BaileyHollingsworth.TCaddons.common.items;

import biomesoplenty.api.biome.BOPBiomes;
import biomesoplenty.api.block.BOPBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class ItemSacredSprings extends BOPTerrainCrystalAbstract {

    public ItemSacredSprings() {
        super("SacredSprings");
    }

    @Override
    protected void decoratePlatform(World worldIn, BlockPos pos) {
        if (Math.random() < .4) {
            genGrass(worldIn, pos);
        }
        if (Math.random() < 0.03 && spacedFarEnough(worldIn, pos.up())) {
            growTree(worldIn, pos);
        }
    }

    @Override
    protected Biome getBiomeType() {
        return BOPBiomes.sacred_springs.get();
    }

    private void growTree(World worldIn, BlockPos pos) {
        if (Math.random() < .95) {
            worldIn.setBlockState(pos.up(), Blocks.SAPLING.getDefaultState());
        } else {
            worldIn.setBlockState(pos.up(), BOPBlocks.sapling_1.getStateFromMeta(7));
        }
        bonemealTree(worldIn, pos);
    }

}
