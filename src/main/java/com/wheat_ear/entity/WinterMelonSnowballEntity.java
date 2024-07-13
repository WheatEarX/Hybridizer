package com.wheat_ear.entity;

import com.wheat_ear.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.particle.ItemStackParticleEffect;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;

public class WinterMelonSnowballEntity extends ThrownItemEntity {
    public WinterMelonSnowballEntity(EntityType<? extends WinterMelonSnowballEntity> entityType, World world) {
        super(entityType, world);
    }

    public WinterMelonSnowballEntity(World world, LivingEntity owner) {
        super(ModEntityType.WINTER_MELON_SNOWBALL, owner, world);
    }

    public WinterMelonSnowballEntity(World world, double x, double y, double z) {
        super(ModEntityType.WINTER_MELON_SNOWBALL, x, y, z, world);
    }

    public static WinterMelonSnowballEntity create(EntityType<? extends WinterMelonSnowballEntity> entityType, World world) {
        return new WinterMelonSnowballEntity(entityType, world);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.WINTER_MELON_SNOWBALL;
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        Entity entity = entityHitResult.getEntity();
        float amount = random.nextBetween(3, 8);

        entity.damage(this.getDamageSources().thrown(this, this.getOwner()), amount);
        entity.setFrozenTicks(random.nextBetween(200, 500));
    }

    private ParticleEffect getParticleParameters() {
        return new ItemStackParticleEffect(ParticleTypes.ITEM, getStack());
    }

    public void handleStatus(byte status) {
        if (status == 3) {
            ParticleEffect particleEffect = this.getParticleParameters();

            for(int i = 0; i < 20; ++i) {
                this.getWorld().addParticle(particleEffect, this.getX(), this.getY(), this.getZ(), 0.0, 0.0, 0.0);
            }
        }
    }

    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if (!this.getWorld().isClient) {
            this.getWorld().sendEntityStatus(this, (byte) 3);
            this.discard();
        }
    }
}
