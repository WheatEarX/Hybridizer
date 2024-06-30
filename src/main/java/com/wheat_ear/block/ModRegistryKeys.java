package com.wheat_ear.block;

import com.wheat_ear.Hybridizer;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModRegistryKeys {
    public static final RegistryKey<Block> WINTER_MELON = of("winter_melon");
    public static final RegistryKey<Block> WINTER_MELON_STEM = of("winter_melon_stem");
    public static final RegistryKey<Block> ATTACHED_WINTER_MELON_STEM = of("attached_winter_melon_stem");
    public static final RegistryKey<Item> WINTER_MELON_SEEDS = RegistryKey.of(RegistryKeys.ITEM, new Identifier(Hybridizer.MOD_ID, "winter_melon_seeds"));
    private static RegistryKey<Block> of(String id) {
        return RegistryKey.of(RegistryKeys.BLOCK, new Identifier(Hybridizer.MOD_ID, id));
    }
}
