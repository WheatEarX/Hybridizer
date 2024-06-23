package com.wheat_ear.block;

import com.wheat_ear.Hybridizer;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingBlock;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block OAK_BIRCH_SAPLING = new SaplingBlock(ModSaplingGenerator.OAK_BIRCH,
            AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));
    public static final Block MEGA_CHERRY_SAPLING = new SaplingBlock(ModSaplingGenerator.MEGA_CHERRY,
            AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));
    public static final Block WITHER_SPRUCE_SAPLING = new SaplingBlock(ModSaplingGenerator.WITHER_SPRUCE,
            AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));
    public static final Block WITHER_LEAVES = new WitherSpruceLeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES));

    public static void registerModBlocks() {
        registerModBlock("oak_birch_sapling", OAK_BIRCH_SAPLING);
        registerModBlock("mega_cherry_sapling", MEGA_CHERRY_SAPLING);
        registerModBlock("wither_leaves", WITHER_LEAVES);
    }

    public static void registerModBlock(String id, Block block) {
        Registry.register(Registries.BLOCK, new Identifier(Hybridizer.MOD_ID, id), block);
    }
}
