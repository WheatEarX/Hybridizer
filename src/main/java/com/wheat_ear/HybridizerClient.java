package com.wheat_ear;

import com.wheat_ear.block.ModBlocks;
import com.wheat_ear.entity.ModEntityType;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;

public class HybridizerClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        registerCutouts();
        registerRenderers();
    }

    public static void registerCutouts() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
                ModBlocks.OAK_BIRCH_SAPLING, ModBlocks.MEGA_CHERRY_SAPLING, ModBlocks.WITHER_SPRUCE_SAPLING,
                ModBlocks.WITHER_LEAVES, ModBlocks.WITHER_MELON_STEM, ModBlocks.ATTACHED_WITHER_MELON_STEM,
                ModBlocks.POTATO_WHEAT, ModBlocks.GOLDEN_APPLE_SAPLING, ModBlocks.GOLDEN_APPLE_LEAVES,
                ModBlocks.ENCHANTED_GOLDEN_APPLE_SAPLING, ModBlocks.ENCHANTED_GOLDEN_APPLE_LEAVES,
                ModBlocks.IRON_BERRY_BUSH, ModBlocks.MAGMA_LILY_PAD, ModBlocks.RANDOM_SAPLING);
    }

    public static void registerRenderers() {
        EntityRendererRegistry.register(ModEntityType.WINTER_MELON_SNOWBALL, FlyingItemEntityRenderer::new);
    }
}
