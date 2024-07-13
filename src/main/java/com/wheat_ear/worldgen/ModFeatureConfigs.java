package com.wheat_ear.worldgen;

import com.wheat_ear.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.CherryFoliagePlacer;
import net.minecraft.world.gen.foliage.SpruceFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class ModFeatureConfigs {
    public static final TreeFeatureConfig OAK_BIRCH = builder(Blocks.OAK_LOG, Blocks.BIRCH_LEAVES, 5, 2, 0, 2)
            .ignoreVines().build();
    public static final TreeFeatureConfig MEGA_CHERRY = new TreeFeatureConfig.Builder(BlockStateProvider.of(Blocks.CHERRY_LOG),
            new MegaJungleTrunkPlacer(14, 2, 19), BlockStateProvider.of(Blocks.CHERRY_LEAVES),
            new CherryFoliagePlacer(UniformIntProvider.create(2, 5), ConstantIntProvider.create(1), ConstantIntProvider.create(6),
                    0.5F, 0.5F, 0.25F, 0.25F),
            new TwoLayersFeatureSize(1, 1, 3)).ignoreVines().build();
    public static final TreeFeatureConfig WITHER_SPRUCE = new TreeFeatureConfig.Builder(BlockStateProvider.of(Blocks.SPRUCE_LOG),
            new StraightTrunkPlacer(5, 2, 1), BlockStateProvider.of(ModBlocks.WITHER_LEAVES),
            new SpruceFoliagePlacer(UniformIntProvider.create(2, 3), UniformIntProvider.create(0, 2), UniformIntProvider.create(1, 2)),
            new TwoLayersFeatureSize(2, 0, 2)).ignoreVines().build();

    @SuppressWarnings("SameParameterValue")
    private static TreeFeatureConfig.Builder builder(Block log, Block leaves, int baseHeight, int firstRandomHeight, int secondRandomHeight, int radius) {
        return new TreeFeatureConfig.Builder(BlockStateProvider.of(log),
                new StraightTrunkPlacer(baseHeight, firstRandomHeight, secondRandomHeight),
                BlockStateProvider.of(leaves), new BlobFoliagePlacer(ConstantIntProvider.create(radius),
                ConstantIntProvider.create(0), 3), new TwoLayersFeatureSize(1, 0, 1));
    }
}
