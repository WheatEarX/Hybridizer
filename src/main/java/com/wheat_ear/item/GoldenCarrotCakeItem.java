package com.wheat_ear.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GoldenCarrotCakeItem extends Item {
    public GoldenCarrotCakeItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        stack = user.eatFood(world, stack);

        if (user instanceof PlayerEntity playerEntity && !playerEntity.isInCreativeMode()) stack.increment(1);
        stack.damage(1, user, EquipmentSlot.MAINHAND);
        if (stack.getDamage() >= 8) stack.decrement(1);

        return stack;
    }
}
