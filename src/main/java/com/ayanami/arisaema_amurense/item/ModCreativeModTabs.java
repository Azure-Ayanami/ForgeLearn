package com.ayanami.arisaema_amurense.item;

import com.ayanami.arisaema_amurense.Arisaema_amurense;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Arisaema_amurense.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ARISAEMA_AMURENSE_TAB = CREATIVE_MODE_TABS.register("arisaema_amurense_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SCALE_LEAF.get()))
                    .title(Component.translatable("creativetab.arisaema_amurense_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SCALE_LEAF.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
