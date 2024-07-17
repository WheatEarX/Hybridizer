package com.wheat_ear.component;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent WINTER_MELON_SLICE = new FoodComponent.Builder()
            .nutrition(3).saturationModifier(0.5F).build();
    public static final FoodComponent POTATO_BREAD = new FoodComponent.Builder()
            .nutrition(6).saturationModifier(0.9F).build();
    public static final FoodComponent BAKED_POTATO_BREAD = new FoodComponent.Builder()
            .nutrition(10).saturationModifier(1.2F).build();
    public static final FoodComponent IRON_BERRIES = new FoodComponent.Builder()
            .nutrition(4).saturationModifier(0.2F).build();

}
