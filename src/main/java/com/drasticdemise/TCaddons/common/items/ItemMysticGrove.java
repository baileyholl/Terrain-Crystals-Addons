package com.drasticdemise.TCaddons.common.items;

import biomesoplenty.api.biome.BOPBiomes;
import biomesoplenty.api.block.BOPBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class ItemMysticGrove extends BOPTerrainCrystalAbstract {

    public ItemMysticGrove() {
        super("MysticGrove");
    }

    @Override
    protected void decoratePlatform(World worldIn, BlockPos pos) {
        //Grass
        double num = Math.random();
        if (num < .5) {
            genGrass(worldIn, pos);
            if (Math.random() <= 0.05) {
                genFlowers(worldIn, pos);
            }
        }
        if (Math.random() < 0.03 && spacedFarEnough(worldIn, pos.up())) {
            growTree(worldIn, pos);
        }

    }

    @Override
    protected Biome getBiomeType() {
        return BOPBiomes.mystic_grove.get();
    }

    public void growTree(World worldIn, BlockPos pos) {
        //sapling_01 5,6
        //sapling_0  3
        //default oak
        double num = Math.random();
        if (num < 0.25) {
            //Flowering oak
            worldIn.setBlockState(pos.up(), BOPBlocks.sapling_1.getStateFromMeta(5));
        } else if (num < .50) {
            //Jacandara
            worldIn.setBlockState(pos.up(), BOPBlocks.sapling_1.getStateFromMeta(6));
        } else if (num < 0.75) {
            //Magic
            worldIn.setBlockState(pos.up(), BOPBlocks.sapling_0.getStateFromMeta(3));
        } else {
            //Oak
            worldIn.setBlockState(pos.up(), Blocks.SAPLING.getDefaultState());
        }
        bonemealTree(worldIn, pos);
    }
}

