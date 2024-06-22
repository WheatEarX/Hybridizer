package com.wheat_ear.datagen;

import com.wheat_ear.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OAK_BIRCH_SAPLING, 2)
                .input(Items.OAK_SAPLING)
                .input(Items.BIRCH_SAPLING)
                .criterion(FabricRecipeProvider.hasItem(Items.OAK_SAPLING),
                        FabricRecipeProvider.conditionsFromItem(Items.OAK_SAPLING))
                .criterion(FabricRecipeProvider.hasItem(Items.BIRCH_SAPLING),
                        FabricRecipeProvider.conditionsFromItem(Items.BIRCH_SAPLING))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MEGA_CHERRY_SAPLING, 2)
                .pattern("cb").pattern("bc")
                .input('c', Items.CHERRY_SAPLING)
                .input('b', Items.JUNGLE_SAPLING)
                .criterion(FabricRecipeProvider.hasItem(Items.CHERRY_SAPLING),
                        FabricRecipeProvider.conditionsFromItem(Items.CHERRY_SAPLING))
                .criterion(FabricRecipeProvider.hasItem(Items.JUNGLE_SAPLING),
                        FabricRecipeProvider.conditionsFromItem(Items.JUNGLE_SAPLING))
                .offerTo(exporter);
    }
}
