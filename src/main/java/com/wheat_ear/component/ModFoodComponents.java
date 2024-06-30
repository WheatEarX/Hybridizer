package com.wheat_ear.component;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent WINTER_MELON_SLICE = new FoodComponent.Builder()
            .nutrition(3).saturationModifier(0.5F).snack().build();
}
