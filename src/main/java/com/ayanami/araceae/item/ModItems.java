package com.ayanami.araceae.item;

import com.ayanami.araceae.Araceae;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Araceae.MOD_ID);

    //本体
    public static final RegistryObject<Item> ARACEAE = ITEMS.register("araceae",
            () -> new Item(new Item.Properties().food(ModFoods.ARACEAE)));

    //晶针
    public static final RegistryObject<Item> RAPHIDES = ITEMS.register("raphides",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
