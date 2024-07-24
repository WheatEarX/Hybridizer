package com.wheat_ear.component;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent WINTER_MELON_SLICE = new FoodComponent.Builder()
            .nutrition(3).saturationModifier(0.3F).build();
    public static final FoodComponent POTATO_BREAD = new FoodComponent.Builder()
            .nutrition(6).saturationModifier(0.9F).build();
    public static final FoodComponent BAKED_POTATO_BREAD = new FoodComponent.Builder()
            .nutrition(10).saturationModifier(1.2F).build();
    public static final FoodComponent IRON_BERRIES = new FoodComponent.Builder()
            .nutrition(4).saturationModifier(0.2F).build();
    public static final FoodComponent BOTTLE_OF_MAGMA = new FoodComponent.Builder()
            .nutrition(1).saturationModifier(0.1F).alwaysEdible().build();
    public static final FoodComponent GOLDEN_CARROT_CAKE = new FoodComponent.Builder()
            .nutrition(5).saturationModifier(0.4F).alwaysEdible().build();
}
