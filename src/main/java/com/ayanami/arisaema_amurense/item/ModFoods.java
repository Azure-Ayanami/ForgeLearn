package com.ayanami.arisaema_amurense.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

/*
* .nutrition(2)：这个食物项可以恢复2点饥饿值。
*
.fast()：这个食物项可以快速食用。
*
.saturationMod(0.2f)：这个食物项的饱和度修饰器为0.2。
*
.effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 0.1f)：
* 食用这个食物项有10%的概率获得移动速度效果，效果持续时间为200游戏刻（10秒）。
*
* */
public class ModFoods {
    public static final FoodProperties ARISAEMA_AMURENSE_BERRY = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 0.1f).build();
}