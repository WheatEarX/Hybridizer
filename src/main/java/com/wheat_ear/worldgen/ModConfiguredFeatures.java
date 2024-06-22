package com.wheat_ear.worldgen;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> OAK_BIRCH = ConfiguredFeatures.of("oak_birch");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {
        ConfiguredFeatures.register(featureRegisterable, OAK_BIRCH, Feature.TREE, ModFeatureConfigs.OAK_BIRCH);
    }
}
