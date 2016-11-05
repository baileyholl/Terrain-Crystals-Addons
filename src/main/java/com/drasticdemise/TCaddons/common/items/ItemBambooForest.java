package com.drasticdemise.TCaddons.common.items;

import biomesoplenty.api.biome.BOPBiomes;
import biomesoplenty.api.block.BOPBlocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class ItemBambooForest extends BOPTerrainCrystalAbstract {

    public ItemBambooForest() {
        super("BambooForest");
    }

    protected int generateBlocksInWorld(BlockPos pos, World worldIn, EntityPlayer playerIn, int blocksGenerated, Biome desiredBiome, boolean changeBiome) {
        if (eligibleStateLocation(worldIn, pos)) {
            int posY = MathHelper.floor_double(playerIn.posY);
            if (posY - pos.getY() == 1) {
                setBiome(worldIn, pos, desiredBiome, changeBiome);
                worldIn.setBlockState(pos, Blocks.DIRT.getStateFromMeta(2));
                decoratePlatform(worldIn, pos);
            } else {
                worldIn.setBlockState(pos, Blocks.DIRT.getDefaultState());
            }
            blocksGenerated += 1;
        }
        return blocksGenerated;
    }

    @Override
    protected void decoratePlatform(World worldIn, BlockPos pos) {
        double num = Math.random();
        if (num < 0.3 && spacedFarEnough(worldIn, pos.up())) {
            worldIn.setBlockState(pos.up(), BOPBlocks.sapling_0.getStateFromMeta(2));
            bonemealTree(worldIn, pos);
        } else if (num < 0.5) {
            if (Math.random() < 0.50) {
                worldIn.setBlockState(pos.up(), Blocks.TALLGRASS.getStateFromMeta(2));
            } else {
                worldIn.setBlockState(pos.up(), Blocks.TALLGRASS.getStateFromMeta(1));
            }
        } else if (num < .8 && spacedFarEnough(worldIn, pos.up())) {
            genBush(worldIn, pos);
        }
    }

    private void genBush(World worldIn, BlockPos pos) {
        worldIn.setBlockState(pos.up(), Blocks.LEAVES.getDefaultState());
        worldIn.setBlockState(pos.up(2), Blocks.LEAVES.getDefaultState());
        worldIn.setBlockState(pos.up().east(), Blocks.LEAVES.getDefaultState());
        worldIn.setBlockState(pos.up().north(), Blocks.LEAVES.getDefaultState());
        worldIn.setBlockState(pos.up().south(), Blocks.LEAVES.getDefaultState());
        worldIn.setBlockState(pos.up().west(), Blocks.LEAVES.getDefaultState());
        if (Math.random() < .3) {
            worldIn.setBlockState(pos.up().north().east(), Blocks.LEAVES.getDefaultState());
            worldIn.setBlockState(pos.up().north().west(), Blocks.LEAVES.getDefaultState());
            worldIn.setBlockState(pos.up().south().east(), Blocks.LEAVES.getDefaultState());
            worldIn.setBlockState(pos.up().south().west(), Blocks.LEAVES.getDefaultState());
        }
        worldIn.setBlockState(pos, Blocks.LOG.getStateFromMeta(3));
    }
    @Override
    protected Biome getBiomeType() {
        return BOPBiomes.bamboo_forest.get();
    }

}
