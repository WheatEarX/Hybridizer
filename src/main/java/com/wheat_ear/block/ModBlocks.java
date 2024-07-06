package com.wheat_ear.block;

import com.wheat_ear.Hybridizer;
import net.minecraft.block.*;
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
    public static final Block WITHER_LEAVES = new WitherSpruceLeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).mapColor(MapColor.BLACK));
    public static final Block WINTER_MELON = new Block(AbstractBlock.Settings.copy(Blocks.MELON).mapColor(MapColor.CYAN));
    public static final Block WITHER_MELON_STEM = new StemBlock(ModRegistryKeys.WINTER_MELON,
            ModRegistryKeys.ATTACHED_WINTER_MELON_STEM, ModRegistryKeys.WINTER_MELON_SEEDS,
            AbstractBlock.Settings.copy(Blocks.MELON_STEM));
    public static final Block ATTACHED_WITHER_MELON_STEM = new AttachedStemBlock(ModRegistryKeys.WINTER_MELON_STEM,
            ModRegistryKeys.WINTER_MELON_STEM, ModRegistryKeys.WINTER_MELON_SEEDS,
            AbstractBlock.Settings.copy(Blocks.ATTACHED_MELON_STEM));
    public static final Block POTATO_WHEAT = new PotatoWheatBlock(AbstractBlock.Settings.copy(Blocks.WHEAT));

    public static void registerModBlocks() {
        registerModBlock("oak_birch_sapling", OAK_BIRCH_SAPLING);
        registerModBlock("mega_cherry_sapling", MEGA_CHERRY_SAPLING);
        registerModBlock("wither_spruce_sapling", WITHER_SPRUCE_SAPLING);
        registerModBlock("wither_leaves", WITHER_LEAVES);
        registerModBlock("winter_melon", WINTER_MELON);
        registerModBlock("winter_melon_stem", WITHER_MELON_STEM);
        registerModBlock("attached_winter_melon_stem", ATTACHED_WITHER_MELON_STEM);
        registerModBlock("potato_wheat", POTATO_WHEAT);
    }

    public static void registerModBlock(String id, Block block) {
        Registry.register(Registries.BLOCK, new Identifier(Hybridizer.MOD_ID, id), block);
    }
}
