package com.ayanami.araceae.effect;

import com.ayanami.araceae.Araceae;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Araceae.MOD_ID);

    public static final RegistryObject<MobEffect> PLANT_ALLERGIES = MOB_EFFECTS.register("plant_allergies",
            () -> new PlantAllergiesEffect(MobEffectCategory.HARMFUL, 3124687));

    public static void register(IEventBus eventBus){
        MOB_EFFECTS.register(eventBus);
    }
}
