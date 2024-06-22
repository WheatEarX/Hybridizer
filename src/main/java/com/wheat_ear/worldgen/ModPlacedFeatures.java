package com.wheat_ear.worldgen;

import com.wheat_ear.Hybridizer;
import com.wheat_ear.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> OAK_BIRCH = of("oak_birch");
    public static final RegistryKey<PlacedFeature> MEGA_CHERRY = of("mega_cherry");

    public static void bootstrap(Registerable<PlacedFeature> featureRegisterable) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryEntryLookup = featureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        PlacedFeatures.register(featureRegisterable, OAK_BIRCH, registryEntryLookup.getOrThrow(ModConfiguredFeatures.OAK_BIRCH),
                PlacedFeatures.wouldSurvive(ModBlocks.OAK_BIRCH_SAPLING));
        PlacedFeatures.register(featureRegisterable, MEGA_CHERRY, registryEntryLookup.getOrThrow(ModConfiguredFeatures.OAK_BIRCH),
                PlacedFeatures.wouldSurvive(ModBlocks.OAK_BIRCH_SAPLING));
    }

    public static RegistryKey<PlacedFeature> of(String id) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Hybridizer.MOD_ID, id));
    }
}
