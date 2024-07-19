package com.wheat_ear.datagen;

import com.wheat_ear.block.ModBlocks;
import com.wheat_ear.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.item.Item;
import net.minecraft.state.property.Properties;

public class ModModelGenerator extends FabricModelProvider {
    public ModModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerTintableCross(ModBlocks.OAK_BIRCH_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.MEGA_CHERRY_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.WITHER_SPRUCE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerSingleton(ModBlocks.WITHER_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerSingleton(ModBlocks.WINTER_MELON, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerGourd(ModBlocks.WITHER_MELON_STEM, ModBlocks.ATTACHED_WITHER_MELON_STEM);
        blockStateModelGenerator.registerCrop(ModBlocks.POTATO_WHEAT, Properties.AGE_7, 0, 1, 2, 3, 4, 5, 6, 7);

        blockStateModelGenerator.registerTintableCross(ModBlocks.GOLDEN_APPLE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.ENCHANTED_GOLDEN_APPLE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerSingleton(ModBlocks.GOLDEN_APPLE_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerSingleton(ModBlocks.ENCHANTED_GOLDEN_APPLE_LEAVES, TexturedModel.LEAVES);

        registerIronBerryBush(blockStateModelGenerator);
        registerMagmaLilyPad(blockStateModelGenerator);

        blockStateModelGenerator.registerTintableCross(ModBlocks.CARROT_CANE, BlockStateModelGenerator.TintType.TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.RANDOM_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerBuiltin(ModBlocks.RANDOM_MEDIUM_LOG, ModBlocks.RANDOM_MEDIUM_LOG);
        blockStateModelGenerator.registerBuiltin(ModBlocks.RANDOM_MEDIUM_LEAVES, ModBlocks.RANDOM_MEDIUM_LEAVES);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        doGenerateItemModels(itemModelGenerator, ModItems.WINTER_MELON_SLICE, ModItems.WINTER_MELON_SNOWBALL,
                ModItems.POTATO_WHEAT, ModItems.POTATO_BREAD, ModItems.BAKED_POTATO_BREAD, ModItems.CARROT_CANE);
    }

    public static void doGenerateItemModels(ItemModelGenerator itemModelGenerator, Item... items) {
        for (Item item: items) {
            itemModelGenerator.register(item, Models.GENERATED);
        }
    }

    private static void registerIronBerryBush(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerItemModel(ModItems.IRON_BERRIES);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.IRON_BERRY_BUSH).coordinate(BlockStateVariantMap.create(Properties.AGE_3).register(
                stage -> BlockStateVariant.create().put(VariantSettings.MODEL, blockStateModelGenerator.createSubModel(ModBlocks.IRON_BERRY_BUSH, "_stage" + stage, Models.CROSS, TextureMap::cross)))));
    }

    private static void registerMagmaLilyPad(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerItemModel(ModItems.MAGMA_LILY_PAD);
        blockStateModelGenerator.blockStateCollector.accept(
                BlockStateModelGenerator.createBlockStateWithRandomHorizontalRotations(ModBlocks.MAGMA_LILY_PAD,
                        ModelIds.getBlockModelId(ModBlocks.MAGMA_LILY_PAD)));
    }
}
