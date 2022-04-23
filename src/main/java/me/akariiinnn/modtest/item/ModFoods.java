package me.akariiinnn.modtest.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties CUCUMBER = (new FoodProperties.Builder()).fast().nutrition(2).saturationMod(0.2F).build();
    public static final FoodProperties CUCUMBER_SALAD = (new FoodProperties.Builder().nutrition(8).saturationMod(1.0F).build());

}
