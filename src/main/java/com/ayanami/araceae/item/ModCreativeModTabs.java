package com.ayanami.araceae.item;

import com.ayanami.araceae.Araceae;
import com.ayanami.araceae.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Araceae.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ARACEAE_TAB = CREATIVE_MODE_TABS.register("araceae_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ARACEAE.get()))
                    .title(Component.translatable("creativetab.araceae_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ARACEAE.get());
                        pOutput.accept(ModItems.AMORPHOPHALLUS_TITANUM.get());
                        pOutput.accept(ModItems.ASTEROSTIGMA.get());
                        pOutput.accept(ModItems.PINELLIA.get());
                        pOutput.accept(ModItems.DRACONTIUM.get());
                        pOutput.accept(ModItems.LEMNA.get());
                        pOutput.accept(ModItems.MONSTERA.get());
                        pOutput.accept(ModItems.AQUATICUM.get());
                        pOutput.accept(ModItems.ACAULE.get());
                        pOutput.accept(ModItems.ZAMIIFOLIA.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
