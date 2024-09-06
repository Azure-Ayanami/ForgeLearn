package com.ayanami.araceae.item;

import com.ayanami.araceae.effect.ModEffects;
import com.ayanami.araceae.effect.PlantAllergiesEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/*
*@.nutrition(2)：这个食物项可以恢复2点饥饿值。
*
*@.fast()：这个食物项可以快速食用。
*
*@.saturationMod(0.2f)：这个食物项的饱和度修饰器为0.2。
*
*@.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 0.1f)：
* 食用这个食物项有10%的概率获得移动速度效果，效果持续时间为200游戏刻（10秒）。
*
* */
public class ModFoods {

    @Contract(" -> new")
    private static @NotNull MobEffectInstance createPlantAllergiesEffect() {
        return new MobEffectInstance(ModEffects.PLANT_ALLERGIES.get(), 1, 0, false, false, false);
    }

    public static final FoodProperties ARACEAE = new FoodProperties.Builder().nutrition(2)
            .saturationMod(1.0f).effect(ModFoods::createPlantAllergiesEffect, 1.0f).build();

    public static final FoodProperties AMORPHOPHALLUS_TITANUM = new FoodProperties.Builder().nutrition(5)
            .saturationMod(1.0f).effect(ModFoods::createPlantAllergiesEffect, 1.0f).build();

    public static final FoodProperties ASTEROSTIGMA = new FoodProperties.Builder().nutrition(2)
            .saturationMod(1.0f).effect(ModFoods::createPlantAllergiesEffect, 1.0f).build();

    public static final FoodProperties PINELLIA = new FoodProperties.Builder().nutrition(2)
            .saturationMod(1.0f).effect(ModFoods::createPlantAllergiesEffect, 1.0f).build();

    public static final FoodProperties DRACONTIUM = new FoodProperties.Builder().nutrition(2)
            .saturationMod(1.0f).effect(ModFoods::createPlantAllergiesEffect, 1.0f).build();

    public static final FoodProperties LEMNA = new FoodProperties.Builder().nutrition(2)
            .saturationMod(1.0f).effect(ModFoods::createPlantAllergiesEffect, 1.0f).build();

    public static final FoodProperties MONSTERA = new FoodProperties.Builder().nutrition(2)
            .saturationMod(1.0f).effect(ModFoods::createPlantAllergiesEffect, 1.0f).build();

    public static final FoodProperties AQUATICUM = new FoodProperties.Builder().nutrition(2)
            .saturationMod(1.0f).effect(ModFoods::createPlantAllergiesEffect, 1.0f).build();

    public static final FoodProperties ACAULE = new FoodProperties.Builder().nutrition(2)
            .saturationMod(1.0f).effect(ModFoods::createPlantAllergiesEffect, 1.0f).build();

    public static final FoodProperties ZAMIIFOLIA = new FoodProperties.Builder().nutrition(2)
            .saturationMod(1.0f).effect(ModFoods::createPlantAllergiesEffect, 1.0f).build();

    public static final FoodProperties TUBER = new FoodProperties.Builder().nutrition(4)
            .saturationMod(1.0f).effect(() -> new MobEffectInstance(MobEffects.SATURATION, 15), 0.5f).build();

}
