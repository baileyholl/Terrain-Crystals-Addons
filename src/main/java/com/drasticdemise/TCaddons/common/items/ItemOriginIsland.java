package com.drasticdemise.TCaddons.common.items;

import biomesoplenty.api.biome.BOPBiomes;
import biomesoplenty.api.block.BOPBlocks;
import com.BaileyHollingsworth.TerrainCrystals.core.ConfigurationFile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class ItemOriginIsland extends BOPTerrainCrystalAbstract {


    public ItemOriginIsland() {
        super("OriginIsland");
    }

    protected int generateBlocksInWorld(BlockPos pos, World worldIn, EntityPlayer playerIn, int blocksGenerated, Biome desiredBiome, boolean changeBiome) {
        if (eligibleStateLocation(worldIn, pos)) {
            int posY = MathHelper.floor_double(playerIn.posY);
            if (posY - pos.getY() == 1) {
                setBiome(worldIn, pos, desiredBiome, changeBiome);
                worldIn.setBlockState(pos, BOPBlocks.grass.getStateFromMeta(5));
                decoratePlatform(worldIn, pos);
            } else if (ConfigurationFile.generateStone && posY - pos.getY() >= ConfigurationFile.stoneSpawnDepth) {
                if (ConfigurationFile.generateOres && Math.random() < 0.05) {
                    worldIn.setBlockState(pos, oreListHelper());
                } else {
                    worldIn.setBlockState(pos, Blocks.STONE.getDefaultState());
                }
            } else {
                worldIn.setBlockState(pos, Blocks.DIRT.getDefaultState());
            }
            blocksGenerated += 1;
        }
        return blocksGenerated;
    }

    @Override
    protected void decoratePlatform(World worldIn, BlockPos pos) {
        //BOP flowers from JSON - variants are zero indexed.
        //https://github.com/Glitchfiend/BiomesOPlenty/blob/8c2169b8c4448df153cab3ec4e7451d5fa84ce25/src/main/resources/assets/biomesoplenty/blockstates/flower_0.json
        if (BOPBlocks.sapling_1.canPlaceBlockAt(worldIn, pos.up()) && spacedFarEnough(worldIn, pos.up())) {
            if (Math.random() <= .01) {
                //Rose
                if (Math.random() < .5) {
                    worldIn.setBlockState(pos.up(), BOPBlocks.flower_1.getStateFromMeta(5));
                } else {
                    //Yellow flower
                    worldIn.setBlockState(pos.up(), Blocks.YELLOW_FLOWER.getDefaultState());
                }
            }
            if (Math.random() <= 0.01) {
                worldIn.setBlockState(pos.up(), BOPBlocks.sapling_1.getDefaultState());
                bonemealTree(worldIn, pos);
            }
        }
    }


    @Override
    protected Biome getBiomeType() {
        return BOPBiomes.origin_island.get();
    }
}
