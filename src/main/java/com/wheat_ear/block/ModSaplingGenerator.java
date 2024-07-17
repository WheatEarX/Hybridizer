package com.wheat_ear.block;

import com.wheat_ear.worldgen.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerator {
    public static final SaplingGenerator OAK_BIRCH = new SaplingGenerator("oak_birch",
            Optional.empty(), Optional.of(ModConfiguredFeatures.OAK_BIRCH), Optional.empty());
    public static final SaplingGenerator MEGA_CHERRY = new SaplingGenerator("mega_cherry",
            Optional.of(ModConfiguredFeatures.MEGA_CHERRY), Optional.empty(), Optional.empty());
    public static final SaplingGenerator WITHER_SPRUCE = new SaplingGenerator("wither_spruce",
            Optional.empty(), Optional.of(ModConfiguredFeatures.WITHER_SPRUCE), Optional.empty());
    public static final SaplingGenerator GOLDEN_APPLE_TREE = new SaplingGenerator("golden_apple_tree",
            Optional.empty(), Optional.of(ModConfiguredFeatures.GOLDEN_APPLE_TREE), Optional.empty());
    public static final SaplingGenerator ENCHANTED_GOLDEN_APPLE_TREE = new SaplingGenerator("enchanted_golden_apple_tree",
            Optional.empty(), Optional.of(ModConfiguredFeatures.ENCHANTED_GOLDEN_APPLE_TREE), Optional.empty());
}
