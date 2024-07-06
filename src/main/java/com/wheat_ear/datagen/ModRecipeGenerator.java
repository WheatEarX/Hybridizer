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

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MEGA_CHERRY_SAPLING, 2)
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
                BAKED_POTATO_BREAD, 0.1F, 200).offerTo(exporter);

        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(POTATO_BREAD), RecipeCategory.FOOD,
                BAKED_POTATO_BREAD, 0.1F, 200).offerTo(exporter);

        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(POTATO_BREAD), RecipeCategory.FOOD,
                BAKED_POTATO_BREAD, 0.1F, 600).offerTo(exporter);
    }
}
