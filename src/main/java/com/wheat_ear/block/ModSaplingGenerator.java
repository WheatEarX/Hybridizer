package com.wheat_ear.block;

import com.wheat_ear.worldgen.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerator {
    public static final SaplingGenerator OAK_BIRCH = new SaplingGenerator("oak_birch",
            Optional.empty(), Optional.of(ModConfiguredFeatures.OAK_BIRCH), Optional.empty());
    public static final SaplingGenerator MEGA_CHERRY = new SaplingGenerator("mega_cherry",
            Optional.empty(), Optional.of(ModConfiguredFeatures.MEGA_CHERRY), Optional.empty());
}
