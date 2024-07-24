package com.wheat_ear.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

import static com.wheat_ear.item.ModItems.*;
import static net.minecraft.item.Items.*;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, OAK_BIRCH_SAPLING, 2)
                .input(OAK_SAPLING)
                .input(BIRCH_SAPLING)
                .criterion(FabricRecipeProvider.hasItem(OAK_SAPLING),
                        FabricRecipeProvider.conditionsFromItem(OAK_SAPLING))
                .criterion(FabricRecipeProvider.hasItem(BIRCH_SAPLING),
                        FabricRecipeProvider.conditionsFromItem(BIRCH_SAPLING))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MEGA_CHERRY_SAPLING, 4)
                .pattern("cb").pattern("bc")
                .input('c', CHERRY_SAPLING)
                .input('b', JUNGLE_SAPLING)
                .criterion(FabricRecipeProvider.hasItem(CHERRY_SAPLING),
                        FabricRecipeProvider.conditionsFromItem(CHERRY_SAPLING))
                .criterion(FabricRecipeProvider.hasItem(JUNGLE_SAPLING),
                        FabricRecipeProvider.conditionsFromItem(JUNGLE_SAPLING))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, WITHER_SPRUCE_SAPLING, 2)
                .pattern(" w ").pattern("wsw").pattern(" w ")
                .input('w', WITHER_ROSE)
                .input('s', SPRUCE_SAPLING)
                .criterion(FabricRecipeProvider.hasItem(WITHER_ROSE),
                        FabricRecipeProvider.conditionsFromItem(WITHER_ROSE))
                .criterion(FabricRecipeProvider.hasItem(SPRUCE_SAPLING),
                        FabricRecipeProvider.conditionsFromItem(SPRUCE_SAPLING))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, WINTER_MELON_SLICE, 1)
                .pattern(" s ").pattern("sws").pattern(" s ")
                .input('w', MELON_SLICE)
                .input('s', ICE)
                .criterion(FabricRecipeProvider.hasItem(MELON_SLICE),
                        FabricRecipeProvider.conditionsFromItem(MELON_SLICE))
                .criterion(FabricRecipeProvider.hasItem(ICE),
                        FabricRecipeProvider.conditionsFromItem(ICE))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, WINTER_MELON_SEEDS, 1)
                .input(WINTER_MELON_SLICE)
                .criterion(FabricRecipeProvider.hasItem(WINTER_MELON_SLICE),
                        FabricRecipeProvider.conditionsFromItem(WINTER_MELON_SLICE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, WINTER_MELON, 1)
                .pattern("www").pattern("www").pattern("www")
                .input('w', WINTER_MELON_SLICE)
                .criterion(FabricRecipeProvider.hasItem(WINTER_MELON_SLICE),
                        FabricRecipeProvider.conditionsFromItem(WINTER_MELON_SLICE))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, WINTER_MELON_SNOWBALL, 2)
                .input(WINTER_MELON_SLICE)
                .input(SNOWBALL)
                .criterion(FabricRecipeProvider.hasItem(WINTER_MELON_SLICE),
                        FabricRecipeProvider.conditionsFromItem(WINTER_MELON_SLICE))
                .criterion(FabricRecipeProvider.hasItem(SNOWBALL),
                        FabricRecipeProvider.conditionsFromItem(SNOWBALL))
                .offerTo(exporter);
        
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, POTATO_WHEAT_SEEDS, 2)
                .input(POTATO)
                .input(WHEAT_SEEDS)
                .criterion(FabricRecipeProvider.hasItem(POTATO),
                        FabricRecipeProvider.conditionsFromItem(POTATO))
                .criterion(FabricRecipeProvider.hasItem(WHEAT),
                        FabricRecipeProvider.conditionsFromItem(WHEAT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, POTATO_BREAD, 3)
                .pattern("ppp")
                .input('p', POTATO_WHEAT)
                .criterion(FabricRecipeProvider.hasItem(POTATO_WHEAT),
                        FabricRecipeProvider.conditionsFromItem(POTATO_WHEAT))
                .offerTo(exporter);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(POTATO_BREAD), RecipeCategory.FOOD,
                BAKED_POTATO_BREAD, 0.1F, 200)
                .criterion(FabricRecipeProvider.hasItem(POTATO_BREAD),
                        FabricRecipeProvider.conditionsFromItem(POTATO_BREAD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, GOLDEN_APPLE_SAPLING, 2)
                .pattern("gt").pattern("tg")
                .input('g', GOLDEN_APPLE)
                .input('t', OAK_SAPLING)
                .criterion(FabricRecipeProvider.hasItem(GOLDEN_APPLE),
                        FabricRecipeProvider.conditionsFromItem(GOLDEN_APPLE))
                .criterion(FabricRecipeProvider.hasItem(OAK_SAPLING),
                        FabricRecipeProvider.conditionsFromItem(OAK_SAPLING))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ENCHANTED_GOLDEN_APPLE_SAPLING, 2)
                .pattern("gt").pattern("tg")
                .input('g', ENCHANTED_GOLDEN_APPLE)
                .input('t', OAK_SAPLING)
                .criterion(FabricRecipeProvider.hasItem(ENCHANTED_GOLDEN_APPLE),
                        FabricRecipeProvider.conditionsFromItem(ENCHANTED_GOLDEN_APPLE))
                .criterion(FabricRecipeProvider.hasItem(OAK_SAPLING),
                        FabricRecipeProvider.conditionsFromItem(OAK_SAPLING))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, IRON_BERRIES, 4)
                .pattern(" i ").pattern("ibi").pattern(" i ")
                .input('i', IRON_INGOT)
                .input('b', SWEET_BERRIES)
                .criterion(FabricRecipeProvider.hasItem(IRON_INGOT),
                        FabricRecipeProvider.conditionsFromItem(IRON_INGOT))
                .criterion(FabricRecipeProvider.hasItem(SWEET_BERRIES),
                        FabricRecipeProvider.conditionsFromItem(SWEET_BERRIES))
                .offerTo(exporter);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(IRON_BERRIES), RecipeCategory.FOOD,
                        IRON_NUGGET, 0.1F, 200)
                .criterion(FabricRecipeProvider.hasItem(IRON_BERRIES),
                        FabricRecipeProvider.conditionsFromItem(IRON_BERRIES))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MAGMA_LILY_PAD, 4)
                .pattern(" m ").pattern("mlm").pattern(" m ")
                .input('m', MAGMA_CREAM)
                .input('l', LILY_PAD)
                .criterion(FabricRecipeProvider.hasItem(MAGMA_CREAM),
                        FabricRecipeProvider.conditionsFromItem(MAGMA_CREAM))
                .criterion(FabricRecipeProvider.hasItem(LILY_PAD),
                        FabricRecipeProvider.conditionsFromItem(LILY_PAD))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, BOTTLE_OF_MAGMA, 1)
                .input(GLASS_BOTTLE)
                .input(MAGMA_LILY_PAD)
                .criterion(FabricRecipeProvider.hasItem(GLASS_BOTTLE),
                        FabricRecipeProvider.conditionsFromItem(GLASS_BOTTLE))
                .criterion(FabricRecipeProvider.hasItem(MAGMA_LILY_PAD),
                        FabricRecipeProvider.conditionsFromItem(MAGMA_LILY_PAD))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, CARROT_CANE, 2)
                .input(SUGAR_CANE)
                .input(CARROT)
                .criterion(FabricRecipeProvider.hasItem(SUGAR_CANE),
                        FabricRecipeProvider.conditionsFromItem(SUGAR_CANE))
                .criterion(FabricRecipeProvider.hasItem(CARROT),
                        FabricRecipeProvider.conditionsFromItem(CARROT))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, CARROT_SUGAR, 1)
                .input(CARROT_CANE)
                .criterion(FabricRecipeProvider.hasItem(CARROT_CANE),
                        FabricRecipeProvider.conditionsFromItem(CARROT_CANE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, GOLDEN_CARROT_SUGAR, 1)
                .pattern("ggg").pattern("gcg").pattern("ggg")
                .input('g', GOLD_NUGGET)
                .input('c', CARROT_SUGAR)
                .criterion(FabricRecipeProvider.hasItem(GOLD_NUGGET),
                        FabricRecipeProvider.conditionsFromItem(GOLD_NUGGET))
                .criterion(FabricRecipeProvider.hasItem(CARROT_SUGAR),
                        FabricRecipeProvider.conditionsFromItem(CARROT_SUGAR))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, GOLDEN_CARROT_CAKE, 1)
                .pattern("mmm").pattern("sgs").pattern("www")
                .input('m', MILK_BUCKET)
                .input('s', GOLDEN_CARROT_SUGAR)
                .input('g', EGG)
                .input('w', WHEAT)
                .criterion(FabricRecipeProvider.hasItem(MILK_BUCKET),
                        FabricRecipeProvider.conditionsFromItem(MILK_BUCKET))
                .criterion(FabricRecipeProvider.hasItem(GOLDEN_CARROT_SUGAR),
                        FabricRecipeProvider.conditionsFromItem(GOLDEN_CARROT_SUGAR))
                .criterion(FabricRecipeProvider.hasItem(EGG),
                        FabricRecipeProvider.conditionsFromItem(EGG))
                .criterion(FabricRecipeProvider.hasItem(WHEAT),
                        FabricRecipeProvider.conditionsFromItem(WHEAT))
                .offerTo(exporter);
    }
}
