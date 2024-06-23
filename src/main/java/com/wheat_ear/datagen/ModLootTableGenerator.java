package com.wheat_ear.datagen;

import com.wheat_ear.block.ModBlocks;
import com.wheat_ear.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    protected ModLootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.OAK_BIRCH_SAPLING, drops(ModItems.OAK_BIRCH_SAPLING));
        addDrop(ModBlocks.MEGA_CHERRY_SAPLING, drops(ModItems.MEGA_CHERRY_SAPLING));
        addDrop(ModBlocks.WITHER_SPRUCE_SAPLING, drops(ModItems.WITHER_SPRUCE_SAPLING));
        addDrop(ModBlocks.WITHER_LEAVES, leavesDrops(ModBlocks.WITHER_LEAVES, ModBlocks.WITHER_SPRUCE_SAPLING, 0.05F, 0.0625F, 0.083333336F, 0.1F));
    }
}
