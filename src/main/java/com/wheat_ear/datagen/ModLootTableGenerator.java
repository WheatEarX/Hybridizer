package com.wheat_ear.datagen;

import com.wheat_ear.block.ModBlocks;
import com.wheat_ear.block.PotatoWheatBlock;
import com.wheat_ear.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.LimitCountLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.operator.BoundedIntUnaryOperator;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    protected ModLootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.OAK_BIRCH_SAPLING);
        addDrop(ModBlocks.MEGA_CHERRY_SAPLING);
        addDrop(ModBlocks.WITHER_SPRUCE_SAPLING);
        addDrop(ModBlocks.WITHER_LEAVES, block -> leavesDrops(block, ModBlocks.WITHER_SPRUCE_SAPLING, SAPLING_DROP_CHANCE));

        addDrop(ModBlocks.WINTER_MELON, block -> dropsWithSilkTouch(block, applyExplosionDecay(block, ItemEntry.builder(ModItems.WINTER_MELON_SLICE).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(3.0F, 7.0F))).apply(ApplyBonusLootFunction.uniformBonusCount(Enchantments.FORTUNE)).apply(LimitCountLootFunction.builder(BoundedIntUnaryOperator.createMax(9))))));
        addDrop(ModBlocks.WITHER_MELON_STEM, block -> cropStemDrops(block, ModItems.WINTER_MELON_SEEDS));
        addDrop(ModBlocks.ATTACHED_WITHER_MELON_STEM, block -> attachedCropStemDrops(block, ModItems.WINTER_MELON_SEEDS));

        LootCondition.Builder potatoWheatBuilder = BlockStatePropertyLootCondition.builder(ModBlocks.POTATO_WHEAT).properties(StatePredicate.Builder.create().exactMatch(PotatoWheatBlock.AGE, 7));
        addDrop(ModBlocks.POTATO_WHEAT, cropDrops(ModBlocks.POTATO_WHEAT, ModItems.POTATO_WHEAT, ModItems.POTATO_WHEAT_SEEDS, potatoWheatBuilder));
    }
}
