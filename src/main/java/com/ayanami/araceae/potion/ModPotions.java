package com.ayanami.araceae.potion;

import com.ayanami.araceae.Araceae;
import com.ayanami.araceae.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS
            = DeferredRegister.create(ForgeRegistries.POTIONS, Araceae.MOD_ID);

    public static final RegistryObject<Potion> PLANT_ALLERGIES_POTION = POTIONS.register("plant_allergies_potion",
            () -> new Potion(new MobEffectInstance(ModEffects.PLANT_ALLERGIES.get(), 200, 0)));


    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}
