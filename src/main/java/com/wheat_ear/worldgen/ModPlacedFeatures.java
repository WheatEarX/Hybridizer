package com.wheat_ear.worldgen;

import com.wheat_ear.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> OAK_BIRCH = PlacedFeatures.of("oak_birch");

    public static void bootstrap(Registerable<PlacedFeature> featureRegisterable) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryEntryLookup = featureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        PlacedFeatures.register(featureRegisterable, OAK_BIRCH, registryEntryLookup.getOrThrow(ModConfiguredFeatures.OAK_BIRCH),
                PlacedFeatures.wouldSurvive(ModBlocks.OAK_BIRCH_SAPLING));
    }
}
