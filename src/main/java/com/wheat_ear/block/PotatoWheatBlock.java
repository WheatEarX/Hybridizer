package com.wheat_ear.block;

import com.mojang.serialization.MapCodec;
import com.wheat_ear.item.ModItems;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class PotatoWheatBlock extends CropBlock {
    public static final MapCodec<PotatoWheatBlock> CODEC = createCodec(PotatoWheatBlock::new);
    public PotatoWheatBlock(Settings settings) {
        super(settings);
    }

    @Override
    public MapCodec<? extends CropBlock> getCodec() {
        return CODEC;
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.POTATO_WHEAT_SEEDS;
    }
}
