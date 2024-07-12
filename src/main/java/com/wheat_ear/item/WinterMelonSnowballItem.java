package com.wheat_ear.item;

import com.wheat_ear.entity.WinterMelonSnowballEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ProjectileItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Position;
import net.minecraft.world.World;

public class WinterMelonSnowballItem extends Item implements ProjectileItem {
    public WinterMelonSnowballItem(Item.Settings settings) {
        super(settings);
    }

    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_SNOWBALL_THROW, SoundCategory.NEUTRAL, 0.5F, 0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F));
        if (!world.isClient) {
            WinterMelonSnowballEntity winterMelonSnowballEntity = new WinterMelonSnowballEntity(world, user);
            winterMelonSnowballEntity.setItem(itemStack);
            winterMelonSnowballEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0.0F, 1.5F, 1.0F);
            world.spawnEntity(winterMelonSnowballEntity);
        }

        user.incrementStat(Stats.USED.getOrCreateStat(this));
        itemStack.decrementUnlessCreative(1, user);
        return TypedActionResult.success(itemStack, world.isClient());
    }

    public ProjectileEntity createEntity(World world, Position pos, ItemStack stack, Direction direction) {
        WinterMelonSnowballEntity winterMelonSnowballEntity = new WinterMelonSnowballEntity(world, pos.getX(), pos.getY(), pos.getZ());
        winterMelonSnowballEntity.setItem(stack);
        return winterMelonSnowballEntity;
    }
}
