package com.wheat_ear.entity;

import com.wheat_ear.Hybridizer;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntityType {
    public static final EntityType<WinterMelonSnowballEntity> WINTER_MELON_SNOWBALL = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(Hybridizer.MOD_ID, "winter_melon_snowball"),
            EntityType.Builder.create(WinterMelonSnowballEntity::create, SpawnGroup.MISC)
                    .dimensions(0.35F, 0.35F).maxTrackingRange(4).trackingTickInterval(10).build());
}
