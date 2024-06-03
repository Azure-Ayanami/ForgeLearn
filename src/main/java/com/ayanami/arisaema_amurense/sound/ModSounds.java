package com.ayanami.arisaema_amurense.sound;

import com.ayanami.arisaema_amurense.Arisaema_amurense;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Arisaema_amurense.MOD_ID);

    public static final RegistryObject<SoundEvent> METAL_DETECTOR_FOUND_ORE = registerSoundEvents("metal_detector_found_ore");


    private static RegistryObject<SoundEvent> registerSoundEvents(String name){
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(Arisaema_amurense.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus)  {
        SOUND_EVENTS.register(eventBus);
    }
}
