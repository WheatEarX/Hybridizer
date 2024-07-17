package com.wheat_ear.item;

import net.minecraft.block.Block;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Random;

public class IronBerriesItem extends AliasedBlockItem {

    public IronBerriesItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        Random random = new Random();
        user.damage(world.getDamageSources().trident(user, user), random.nextInt(6, 16) * 0.5F);

        return super.finishUsing(stack, world, user);
    }
}
