package com.drasticdemise.TCaddons.common.items;

import biomesoplenty.api.biome.BOPBiomes;
import biomesoplenty.api.block.BOPBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class ItemOrchard extends BOPTerrainCrystalAbstract {

    public ItemOrchard() {
        super("Orchard");
    }


    @Override
    protected void decoratePlatform(World worldIn, BlockPos pos) {
        if (Math.random() < 0.5) {
            if (Math.random() < 0.8) {
                genGrass(worldIn, pos);
            } else {
                genFlowers(worldIn, pos);
            }
            if (Math.random() < 0.02 && spacedFarEnough(worldIn, pos.up())) {
                growTree(worldIn, pos);
            }
        }

    }

    @Override
    protected Biome getBiomeType() {
        return BOPBiomes.orchard.get();
    }

    public void growTree(World worldIn, BlockPos pos) {
        if (Math.random() < 0.5) {
            //Flowering Oak
            worldIn.setBlockState(pos.up(), BOPBlocks.sapling_1.getStateFromMeta(5));
        } else {
            //Jacandara
            worldIn.setBlockState(pos.up(), Blocks.SAPLING.getDefaultState());
        }
        bonemealTree(worldIn, pos);

    }

    @Override
    public void genFlowers(World worldIn, BlockPos pos) {
        double num = Math.random();
        if (num < 0.2) {
            //White Anemone
            worldIn.setBlockState(pos.up(), BOPBlocks.flower_0.getStateFromMeta(9));
        } else if (num < 0.4) {
            //Oxeye daisy
            worldIn.setBlockState(pos.up(), Blocks.RED_FLOWER.getStateFromMeta(8));
        } else if (num < 0.6) {
            //Houstonia/Azure Blast
            worldIn.setBlockState(pos.up(), Blocks.RED_FLOWER.getStateFromMeta(3));
        } else if (num < .8) {
            //Poppy
            worldIn.setBlockState(pos.up(), Blocks.RED_FLOWER.getDefaultState());
        } else {
            //Dandelion
            worldIn.setBlockState(pos.up(), Blocks.YELLOW_FLOWER.getDefaultState());
        }
    }
}
