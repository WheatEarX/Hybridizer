package com.wheat_ear.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Random;

public class FrozenFoodItem extends Item {
    public FrozenFoodItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        Random random = new Random();
        user.setFrozenTicks(random.nextInt(100, 500));

        return super.finishUsing(stack, world, user);
    }
}
