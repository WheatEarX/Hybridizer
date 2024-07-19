package com.wheat_ear.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.registry.Registries;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

import java.util.List;
import java.util.Random;

public class RandomSaplingBlock extends SaplingBlock {
    public RandomSaplingBlock(SaplingGenerator generator, Settings settings) {
        super(generator, settings);
    }

    @Override
    public void generate(ServerWorld world, BlockPos pos, BlockState state, net.minecraft.util.math.random.Random random) {
        if (state.get(STAGE) == 0) {
            world.setBlockState(pos, state.cycle(STAGE), 4);
        } else {
            this.generator.generate(world, world.getChunkManager().getChunkGenerator(), pos, state, random);

            BlockState blockState;
            List<BlockState> logStateManager = getRandomBlockFromRegistry().getStateManager().getStates();

            List<BlockState> leavesStateManager = getRandomBlockFromRegistry().getStateManager().getStates();

            for (BlockPos blockPos: BlockPos.iterateOutwards(pos, 8, 8, 8)) {
                blockState = world.getBlockState(blockPos);
                if (blockState.isOf(ModBlocks.RANDOM_MEDIUM_LOG)) {
                    world.setBlockState(blockPos, logStateManager.get(random.nextInt(logStateManager.size())));
                }
                else if (blockState.isOf(ModBlocks.RANDOM_MEDIUM_LEAVES)) {
                    world.setBlockState(blockPos, leavesStateManager.get(random.nextInt(leavesStateManager.size())));
                }
            }
        }
    }

    private static Block getRandomBlockFromRegistry() {
        Random random = new Random();
        return Registries.BLOCK.get(random.nextInt(Registries.BLOCK.size()));
    }
}
