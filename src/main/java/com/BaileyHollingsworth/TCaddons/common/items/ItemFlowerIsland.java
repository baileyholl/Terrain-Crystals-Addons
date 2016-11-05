package com.BaileyHollingsworth.TCaddons.common.items;

import biomesoplenty.api.biome.BOPBiomes;
import biomesoplenty.api.enums.BOPTrees;
import biomesoplenty.api.enums.BOPWoods;
import biomesoplenty.common.block.BlockBOPLeaves;
import biomesoplenty.common.block.BlockBOPLog;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class ItemFlowerIsland extends BOPTerrainCrystalAbstract {

    public ItemFlowerIsland() {
        super("FlowerIsland");
    }

    @Override
    protected void decoratePlatform(World worldIn, BlockPos pos) {
        if (Math.random() < 0.02 && spacedFarEnough(worldIn, pos.up(), 11)) {
            if (Math.random() < 0.5) {
                generateRedFlower(worldIn, pos);
            } else {
                generateYellowFlower(worldIn, pos);
            }
        } else {
            genGrass(worldIn, pos);
        }
    }

    @Override
    protected Biome getBiomeType() {
        return BOPBiomes.flower_island.get();
    }

    private void generateYellowFlower(World worldIn, BlockPos pos) {
        //worldIn.setBlockState(pos.up(6), BlockBOPLog.paging.getVariantState(BOPWoods.GIANT_FLOWER));
        //worldIn.setBlockState(pos.up(7), BlockBOPLog.paging.getVariantState(BOPWoods.GIANT_FLOWER));

        worldIn.setBlockState(pos.add(-1, 4, 0), BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(1, 4, 0), BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 4, -1), BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 4, 1), BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));

        worldIn.setBlockState(pos.add(2, 4, 2), BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(2, 4, -2), BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-2, 4, 2), BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-2, 4, -2), BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));

        worldIn.setBlockState(pos.add(0, 5, 0), BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-1, 5, 0), BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(1, 5, 0), BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 5, -1), BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 5, 1), BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(1, 5, 1), BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));

        worldIn.setBlockState(pos.add(1, 5, -1), BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-1, 5, 1), BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-1, 5, -1), BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(2, 5, 0), BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-2, 5, 0), BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 5, 2), BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 5, -2), BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));

        worldIn.setBlockState(pos.add(0, 6, 0), BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(3, 6, 0), BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-3, 6, 0), BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 6, 3), BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 6, -3), BlockBOPLeaves.paging.getVariantState(BOPTrees.YELLOW_BIG_FLOWER));
        worldIn.setBlockState(pos.up(1), BlockBOPLog.paging.getVariantState(BOPWoods.GIANT_FLOWER));
        worldIn.setBlockState(pos.up(2), BlockBOPLog.paging.getVariantState(BOPWoods.GIANT_FLOWER));
        worldIn.setBlockState(pos.up(3), BlockBOPLog.paging.getVariantState(BOPWoods.GIANT_FLOWER));
        worldIn.setBlockState(pos.up(4), BlockBOPLog.paging.getVariantState(BOPWoods.GIANT_FLOWER));
        worldIn.setBlockState(pos.up(5), BlockBOPLog.paging.getVariantState(BOPWoods.GIANT_FLOWER));

    }

    private void generateRedFlower(World worldIn, BlockPos pos) {
        //BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER) - Red stem

        worldIn.setBlockState(pos.add(-1, 4, 0), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(1, 4, 0), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 4, -1), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 4, 1), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));

        worldIn.setBlockState(pos.add(0, 5, 0), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-1, 5, 0), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(1, 5, 0), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 5, -1), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 5, 1), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(1, 5, 1), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(1, 5, -1), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-1, 5, 1), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-1, 5, -1), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(2, 5, 0), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-2, 5, 0), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 5, 2), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 5, -2), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));

        worldIn.setBlockState(pos.up(1), BlockBOPLog.paging.getVariantState(BOPWoods.GIANT_FLOWER));
        worldIn.setBlockState(pos.up(2), BlockBOPLog.paging.getVariantState(BOPWoods.GIANT_FLOWER));
        worldIn.setBlockState(pos.up(3), BlockBOPLog.paging.getVariantState(BOPWoods.GIANT_FLOWER));
        worldIn.setBlockState(pos.up(4), BlockBOPLog.paging.getVariantState(BOPWoods.GIANT_FLOWER));
        worldIn.setBlockState(pos.up(5), BlockBOPLog.paging.getVariantState(BOPWoods.GIANT_FLOWER));
        worldIn.setBlockState(pos.up(6), BlockBOPLog.paging.getVariantState(BOPWoods.GIANT_FLOWER));

        worldIn.setBlockState(pos.add(1, 6, 1), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(1, 6, -1), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-1, 6, 1), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-1, 6, -1), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(2, 6, 0), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-2, 6, 0), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 6, 2), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 6, -2), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(2, 6, 2), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(2, 6, -2), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-2, 6, 2), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-2, 6, -2), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));

        worldIn.setBlockState(pos.add(2, 7, 0), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-2, 7, 0), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 7, 2), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 7, -2), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));

        worldIn.setBlockState(pos.add(3, 8, 0), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(-3, 8, 0), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 8, 3), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
        worldIn.setBlockState(pos.add(0, 8, -3), BlockBOPLeaves.paging.getVariantState(BOPTrees.RED_BIG_FLOWER));
    }
}
