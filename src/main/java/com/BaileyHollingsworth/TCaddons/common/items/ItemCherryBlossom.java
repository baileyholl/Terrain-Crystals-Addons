package com.BaileyHollingsworth.TCaddons.common.items;

import biomesoplenty.api.biome.BOPBiomes;
import biomesoplenty.api.block.BOPBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class ItemCherryBlossom extends BOPTerrainCrystalAbstract {


    public ItemCherryBlossom() {
        super("CherryBlossom");
    }

    @Override
    protected void decoratePlatform(World worldIn, BlockPos pos) {

        if (Math.random() < .6) {
            genGrass(worldIn, pos);
            if (Math.random() < 0.15) {
                genFlowers(worldIn, pos);
            }
        }
        if (Math.random() < 0.03 && spacedFarEnough(worldIn, pos.up())) {
            growTree(worldIn, pos);
        }
    }

    @Override
    protected Biome getBiomeType() {
        return BOPBiomes.cherry_blossom_grove.get();
    }

    public void genFlowers(World worldIn, BlockPos pos) {
        double num = Math.random();
        if (num < 0.16) {
            //Pink Daffodil
            worldIn.setBlockState(pos.up(), BOPBlocks.flower_0.getStateFromMeta(6));
        } else if (num < 0.32) {
            //White Anemone
            worldIn.setBlockState(pos.up(), BOPBlocks.flower_0.getStateFromMeta(9));
        } else if (num < 0.48) {
            //Clover?
            worldIn.setBlockState(pos.up(), BOPBlocks.flower_0.getStateFromMeta(0));
        } else if (num < 0.64) {
            //Oxeye daisy
            worldIn.setBlockState(pos.up(), Blocks.RED_FLOWER.getStateFromMeta(8));
        } else if (num < 0.80) {
            //Houstonia/Azure Blast
            worldIn.setBlockState(pos.up(), Blocks.RED_FLOWER.getStateFromMeta(3));
        }
    }

    public void growTree(World worldIn, BlockPos pos) {
        if (Math.random() < 0.5) {
            worldIn.setBlockState(pos.up(), BOPBlocks.sapling_1.getStateFromMeta(1));
        } else {
            worldIn.setBlockState(pos.up(), BOPBlocks.sapling_1.getStateFromMeta(2));
        }
        bonemealTree(worldIn, pos);
    }
}
