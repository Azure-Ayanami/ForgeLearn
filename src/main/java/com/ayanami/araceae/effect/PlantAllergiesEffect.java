package com.ayanami.araceae.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

public class PlantAllergiesEffect extends MobEffect {
    public PlantAllergiesEffect(MobEffectCategory mobEffectCategory, int color) {
        super(mobEffectCategory, color);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if (!pLivingEntity.getCommandSenderWorld().isClientSide()) {
            pLivingEntity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 200, 0));
            pLivingEntity.addEffect(new MobEffectInstance(MobEffects.HARM, 1, 0));
        }
        super.applyEffectTick(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier){
        if(pDuration <= 0)
            return false;
        else
            return true;
    }
}
