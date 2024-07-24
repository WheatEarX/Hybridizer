package com.wheat_ear.item;

import com.wheat_ear.Hybridizer;
import com.wheat_ear.block.ModBlocks;
import com.wheat_ear.component.ModFoodComponents;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item OAK_BIRCH_SAPLING = new BlockItem(ModBlocks.OAK_BIRCH_SAPLING, new Item.Settings());
    public static final Item MEGA_CHERRY_SAPLING = new BlockItem(ModBlocks.MEGA_CHERRY_SAPLING, new Item.Settings());
    public static final Item WITHER_SPRUCE_SAPLING = new BlockItem(ModBlocks.WITHER_SPRUCE_SAPLING, new Item.Settings());
    public static final Item WITHER_LEAVES = new BlockItem(ModBlocks.WITHER_LEAVES, new Item.Settings());
    public static final Item WINTER_MELON = new BlockItem(ModBlocks.WINTER_MELON, new Item.Settings());
    public static final Item WINTER_MELON_SLICE = new FrozenFoodItem(new Item.Settings().food(ModFoodComponents.WINTER_MELON_SLICE));
    public static final Item WINTER_MELON_SEEDS = new AliasedBlockItem(ModBlocks.WITHER_MELON_STEM, new Item.Settings());
    public static final Item WINTER_MELON_SNOWBALL = new WinterMelonSnowballItem(new Item.Settings());
    public static final Item POTATO_WHEAT = new Item(new Item.Settings());
    public static final Item POTATO_BREAD = new Item(new Item.Settings().food(ModFoodComponents.POTATO_BREAD));
    public static final Item BAKED_POTATO_BREAD = new Item(new Item.Settings().food(ModFoodComponents.BAKED_POTATO_BREAD));
    public static final Item POTATO_WHEAT_SEEDS = new AliasedBlockItem(ModBlocks.POTATO_WHEAT, new Item.Settings());
    public static final Item GOLDEN_APPLE_SAPLING = new BlockItem(ModBlocks.GOLDEN_APPLE_SAPLING, new Item.Settings().rarity(Rarity.RARE));
    public static final Item GOLDEN_APPLE_LEAVES = new BlockItem(ModBlocks.GOLDEN_APPLE_LEAVES, new Item.Settings().rarity(Rarity.RARE));
    public static final Item ENCHANTED_GOLDEN_APPLE_SAPLING = new BlockItem(ModBlocks.ENCHANTED_GOLDEN_APPLE_SAPLING, new Item.Settings().rarity(Rarity.EPIC).component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true));
    public static final Item ENCHANTED_GOLDEN_APPLE_LEAVES = new BlockItem(ModBlocks.ENCHANTED_GOLDEN_APPLE_LEAVES, new Item.Settings().rarity(Rarity.EPIC).component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true));
    public static final Item IRON_BERRIES = new IronBerriesItem(ModBlocks.IRON_BERRY_BUSH, new Item.Settings().food(ModFoodComponents.IRON_BERRIES));
    public static final Item MAGMA_LILY_PAD = new PlaceableOnWaterItem(ModBlocks.MAGMA_LILY_PAD, new Item.Settings());
    public static final Item BOTTLE_OF_MAGMA = new BottleOfMagmaItem(new Item.Settings().maxCount(1).food(ModFoodComponents.BOTTLE_OF_MAGMA));
    public static final Item CARROT_CANE = new AliasedBlockItem(ModBlocks.CARROT_CANE, new Item.Settings());
    public static final Item CARROT_SUGAR = new Item(new Item.Settings());
    public static final Item GOLDEN_CARROT_SUGAR = new Item(new Item.Settings());
    public static final Item GOLDEN_CARROT_CAKE = new GoldenCarrotCakeItem(new Item.Settings().maxCount(1).maxDamage(8).food(ModFoodComponents.GOLDEN_CARROT_CAKE));
    public static final Item RANDOM_SAPLING = new BlockItem(ModBlocks.RANDOM_SAPLING, new Item.Settings());

    public static void registerModItems() {
        registerModItem("oak_birch_sapling", OAK_BIRCH_SAPLING);
        registerModItem("mega_cherry_sapling", MEGA_CHERRY_SAPLING);
        registerModItem("wither_spruce_sapling", WITHER_SPRUCE_SAPLING);
        registerModItem("wither_leaves", WITHER_LEAVES);
        registerModItem("winter_melon", WINTER_MELON);
        registerModItem("winter_melon_slice", WINTER_MELON_SLICE);
        registerModItem("winter_melon_seeds", WINTER_MELON_SEEDS);
        registerModItem("winter_melon_snowball", WINTER_MELON_SNOWBALL);
        registerModItem("potato_wheat", POTATO_WHEAT);
        registerModItem("potato_bread", POTATO_BREAD);
        registerModItem("baked_potato_bread", BAKED_POTATO_BREAD);
        registerModItem("potato_wheat_seeds", POTATO_WHEAT_SEEDS);
        registerModItem("golden_apple_sapling", GOLDEN_APPLE_SAPLING);
        registerModItem("golden_apple_leaves", GOLDEN_APPLE_LEAVES);
        registerModItem("enchanted_golden_apple_sapling", ENCHANTED_GOLDEN_APPLE_SAPLING);
        registerModItem("enchanted_golden_apple_leaves", ENCHANTED_GOLDEN_APPLE_LEAVES);
        registerModItem("iron_berries", IRON_BERRIES);
        registerModItem("magma_lily_pad", MAGMA_LILY_PAD);
        registerModItem("bottle_of_magma", BOTTLE_OF_MAGMA);
        registerModItem("carrot_cane", CARROT_CANE);
        registerModItem("carrot_sugar", CARROT_SUGAR);
        registerModItem("golden_carrot_sugar", GOLDEN_CARROT_SUGAR);
        registerModItem("random_sapling", RANDOM_SAPLING);
        registerModItem("golden_carrot_cake", GOLDEN_CARROT_CAKE);
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
            .entries((context, entries) ->
                addEntries(entries, OAK_BIRCH_SAPLING, MEGA_CHERRY_SAPLING, WITHER_SPRUCE_SAPLING, WITHER_LEAVES,
                        WINTER_MELON, WINTER_MELON_SLICE, WINTER_MELON_SEEDS, WINTER_MELON_SNOWBALL, POTATO_WHEAT,
                        POTATO_BREAD, BAKED_POTATO_BREAD, POTATO_WHEAT_SEEDS, GOLDEN_APPLE_SAPLING, GOLDEN_APPLE_LEAVES,
                        ENCHANTED_GOLDEN_APPLE_SAPLING, ENCHANTED_GOLDEN_APPLE_LEAVES, IRON_BERRIES, MAGMA_LILY_PAD,
                        BOTTLE_OF_MAGMA, CARROT_CANE, CARROT_SUGAR, GOLDEN_CARROT_SUGAR, GOLDEN_CARROT_CAKE, RANDOM_SAPLING)
            ).build();

    private static void addEntries(ItemGroup.Entries entries, Item... items) {
        for (Item item: items) {
            entries.add(item);
        }
    }
}
