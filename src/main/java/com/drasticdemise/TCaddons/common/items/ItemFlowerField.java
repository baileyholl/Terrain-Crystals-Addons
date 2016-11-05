package com.drasticdemise.TCaddons.common.items;

import biomesoplenty.api.biome.BOPBiomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class ItemFlowerField extends BOPTerrainCrystalAbstract {
    public ItemFlowerField() {
        super("FlowerField");
    }

    @Override
    protected void decoratePlatform(World worldIn, BlockPos pos) {
        double num = Math.random();
        if (num < 0.25) {
            worldIn.setBlockState(pos.up(), Blocks.RED_FLOWER.getStateFromMeta(4));
        } else if (num < 0.5) {
            worldIn.setBlockState(pos.up(), Blocks.RED_FLOWER.getStateFromMeta(5));
        } else if (num < .75) {
            worldIn.setBlockState(pos.up(), Blocks.RED_FLOWER.getStateFromMeta(6));
        } else {
            worldIn.setBlockState(pos.up(), Blocks.RED_FLOWER.getStateFromMeta(7));
        }

    }

    @Override
    protected Biome getBiomeType() {
        return BOPBiomes.flower_field.get();
    }
}
