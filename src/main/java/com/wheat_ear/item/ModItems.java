package com.wheat_ear.item;

import com.wheat_ear.Hybridizer;
import com.wheat_ear.block.ModBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item OAK_BIRCH_SAPLING = new BlockItem(ModBlocks.OAK_BIRCH_SAPLING, new Item.Settings());

    public static void registerModItems() {
        Registry.register(Registries.ITEM, new Identifier(Hybridizer.MOD_ID, "oak_birch_sapling"), OAK_BIRCH_SAPLING);
    }
}
