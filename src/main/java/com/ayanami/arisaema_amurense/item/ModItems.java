package com.ayanami.arisaema_amurense.item;

import com.ayanami.arisaema_amurense.Arisaema_amurense;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Arisaema_amurense.MOD_ID);

    public static final RegistryObject<Item> SCALE_LEAF = ITEMS.register("scale_leaf",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
