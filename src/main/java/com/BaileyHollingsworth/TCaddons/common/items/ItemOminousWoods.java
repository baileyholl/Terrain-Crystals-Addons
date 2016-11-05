package com.BaileyHollingsworth.TCaddons.common.items;

import biomesoplenty.api.biome.BOPBiomes;
import biomesoplenty.api.block.BOPBlocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class ItemOminousWoods extends BOPTerrainCrystalAbstract {
    public ItemOminousWoods() {
        super("OminousWoods");
    }

    @Override
    protected void decoratePlatform(World worldIn, BlockPos pos) {
        if (Math.random() < 0.5) {
            double num = Math.random();
            if (num < 0.5) {
                genGrass(worldIn, pos);
            } else if (num < 0.55) {
                genFlowers(worldIn, pos);
            }
        }
        if (Math.random() < 0.09 && spacedFarEnough(worldIn, pos.up(), 7)) {
            //Umbran
            worldIn.setBlockState(pos.up(), BOPBlocks.sapling_0.getStateFromMeta(4));
            bonemealTree(worldIn, pos);
        }
    }

    @Override
    protected Biome getBiomeType() {
        return BOPBiomes.ominous_woods.get();
    }

    public void genFlowers(World worldIn, BlockPos pos) {
        double num = Math.random();
        if (num < 0.16) {
            //Death Bloom
            worldIn.setBlockState(pos.up(), BOPBlocks.flower_0.getStateFromMeta(2));
        } else if (num < 0.32) {
            //Poison Ivy
            worldIn.setBlockState(pos.up(), BOPBlocks.plant_0.getStateFromMeta(4));
        } else if (num < 0.48) {
            //Thorn
            worldIn.setBlockState(pos.up(), BOPBlocks.plant_1.getStateFromMeta(2));
        } else if (num < 0.64) {
            //Dead leaf pile
            worldIn.setBlockState(pos.up(), BOPBlocks.plant_0.getStateFromMeta(12));
        }
    }
}
