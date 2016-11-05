package com.BaileyHollingsworth.TCaddons.common.items;

import biomesoplenty.api.biome.BOPBiomes;
import biomesoplenty.api.block.BOPBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class ItemSeasonalForest extends BOPTerrainCrystalAbstract {
    public ItemSeasonalForest() {
        super("SeasonalForest");
    }

    @Override
    protected void decoratePlatform(World worldIn, BlockPos pos) {
        if (Math.random() < 0.5) {
            if (Math.random() < 0.8) {
                genGrass(worldIn, pos);
            } else {
                genFlowers(worldIn, pos);
            }
            if (Math.random() < 0.06 && spacedFarEnough(worldIn, pos.up(), 7)) {
                growTree(worldIn, pos);
            }
        }
    }

    @Override
    protected Biome getBiomeType() {
        return BOPBiomes.seasonal_forest.get();
    }

    public void growTree(World worldIn, BlockPos pos) {
        double num = Math.random();
        if (num < 0.25) {
            //Oak
            worldIn.setBlockState(pos.up(), Blocks.SAPLING.getDefaultState());
        } else if (num < 0.45) {
            //Yellow Autumn
            worldIn.setBlockState(pos.up(), BOPBlocks.sapling_0.getStateFromMeta(0));
        } else if (num < 0.65) {
            //Orange Autumn
            worldIn.setBlockState(pos.up(), BOPBlocks.sapling_0.getStateFromMeta(1));
        } else if (num < 0.85) {
            //Maple
            worldIn.setBlockState(pos.up(), BOPBlocks.sapling_1.getStateFromMeta(3));
        } else {
            //Dying
            worldIn.setBlockState(pos.up(), BOPBlocks.sapling_0.getStateFromMeta(5));
        }
        bonemealTree(worldIn, pos);
    }

    @Override
    public void genFlowers(World worldIn, BlockPos pos) {
        double num = Math.random();
        if (num < 0.5) {
            //Poppy
            worldIn.setBlockState(pos.up(), Blocks.RED_FLOWER.getDefaultState());
        } else {
            //Dandelion
            worldIn.setBlockState(pos.up(), Blocks.YELLOW_FLOWER.getDefaultState());
        }
    }
}
