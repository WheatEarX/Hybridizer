package com.wheat_ear.worldgen;

import com.wheat_ear.Hybridizer;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> OAK_BIRCH = of("oak_birch");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_CHERRY = of("mega_cherry");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WITHER_SPRUCE = of("wither_spruce");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {
        ConfiguredFeatures.register(featureRegisterable, OAK_BIRCH, Feature.TREE, ModFeatureConfigs.OAK_BIRCH);
        ConfiguredFeatures.register(featureRegisterable, MEGA_CHERRY, Feature.TREE, ModFeatureConfigs.MEGA_CHERRY);
        ConfiguredFeatures.register(featureRegisterable, WITHER_SPRUCE, Feature.TREE, ModFeatureConfigs.WITHER_SPRUCE);
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> of(String id) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Hybridizer.MOD_ID, id));
    }
}
