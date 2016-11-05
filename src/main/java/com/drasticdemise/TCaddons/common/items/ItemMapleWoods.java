package com.drasticdemise.TCaddons.common.items;

import biomesoplenty.api.biome.BOPBiomes;
import biomesoplenty.api.block.BOPBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class ItemMapleWoods extends BOPTerrainCrystalAbstract {
    public ItemMapleWoods() {
        super("MapleWoods");
    }

    @Override
    protected void decoratePlatform(World worldIn, BlockPos pos) {
        if (Math.random() < 0.5) {
            genGrass(worldIn, pos);
        }
        if (Math.random() < 0.08 && spacedFarEnough(worldIn, pos.up())) {
            if (Math.random() < 0.98) {
                //Maple
                worldIn.setBlockState(pos.up(), BOPBlocks.sapling_1.getStateFromMeta(3));
            } else {
                //Spruce
                worldIn.setBlockState(pos.up(), Blocks.SAPLING.getStateFromMeta(1));
            }
            bonemealTree(worldIn, pos);
        }
    }

    @Override
    protected Biome getBiomeType() {
        return BOPBiomes.maple_woods.get();
    }

}
