package com.wheat_ear.item;

import com.wheat_ear.Hybridizer;
import com.wheat_ear.block.ModBlocks;
import com.wheat_ear.component.ModFoodComponents;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item OAK_BIRCH_SAPLING = new BlockItem(ModBlocks.OAK_BIRCH_SAPLING, new Item.Settings());
    public static final Item MEGA_CHERRY_SAPLING = new BlockItem(ModBlocks.MEGA_CHERRY_SAPLING, new Item.Settings());
    public static final Item WITHER_SPRUCE_SAPLING = new BlockItem(ModBlocks.WITHER_SPRUCE_SAPLING, new Item.Settings());
    public static final Item WITHER_LEAVES = new BlockItem(ModBlocks.WITHER_LEAVES, new Item.Settings());
    public static final Item WINTER_MELON = new BlockItem(ModBlocks.WINTER_MELON, new Item.Settings());
    public static final Item WINTER_MELON_SLICE = new FrozenFoodItem(new Item.Settings().food(ModFoodComponents.WINTER_MELON_SLICE));
    public static final Item WINTER_MELON_SEEDS = new AliasedBlockItem(ModBlocks.WITHER_MELON_STEM, new Item.Settings());
    public static final Item POTATO_WHEAT = new Item(new Item.Settings());
    public static final Item POTATO_BREAD = new Item(new Item.Settings());
    public static final Item BAKED_POTATO_BREAD = new Item(new Item.Settings());
    public static final Item POTATO_WHEAT_SEEDS = new AliasedBlockItem(ModBlocks.POTATO_WHEAT, new Item.Settings());

    public static void registerModItems() {
        registerModItem("oak_birch_sapling", OAK_BIRCH_SAPLING);
        registerModItem("mega_cherry_sapling", MEGA_CHERRY_SAPLING);
        registerModItem("wither_spruce_sapling", WITHER_SPRUCE_SAPLING);
        registerModItem("wither_leaves", WITHER_LEAVES);
        registerModItem("winter_melon", WINTER_MELON);
        registerModItem("winter_melon_slice", WINTER_MELON_SLICE);
        registerModItem("winter_melon_seeds", WINTER_MELON_SEEDS);
        registerModItem("potato_wheat", POTATO_WHEAT);
        registerModItem("potato_wheat_bread", POTATO_BREAD);
        registerModItem("baked_potato_bread", BAKED_POTATO_BREAD);
        registerModItem("potato_wheat_seeds", POTATO_WHEAT_SEEDS);
    }

    public static void registerModItem(String id, Item item) {
        Registry.register(Registries.ITEM, new Identifier(Hybridizer.MOD_ID, id), item);
    }

    public static void registerModItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(Hybridizer.MOD_ID, "hybridizers"), HYBRIDIZERS);
    }

    public static final ItemGroup HYBRIDIZERS = FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.hybridizers"))
            .icon(() -> new ItemStack(OAK_BIRCH_SAPLING))
            .entries((context, entries) -> {
                entries.add(OAK_BIRCH_SAPLING);
                entries.add(MEGA_CHERRY_SAPLING);
                entries.add(WITHER_SPRUCE_SAPLING);
                entries.add(WITHER_LEAVES);
                entries.add(WINTER_MELON);
                entries.add(WINTER_MELON_SLICE);
                entries.add(WINTER_MELON_SEEDS);
                entries.add(POTATO_WHEAT);
                entries.add(POTATO_BREAD);
                entries.add(BAKED_POTATO_BREAD);
                entries.add(POTATO_WHEAT_SEEDS);
            }).build();
}
