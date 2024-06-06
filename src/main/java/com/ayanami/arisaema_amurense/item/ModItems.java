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

    //叶片
    public static final RegistryObject<Item> SCALE_LEAF = ITEMS.register("scale_leaf",
            () -> new Item(new Item.Properties()));
    //根茎
    public static final RegistryObject<Item> TUBER = ITEMS.register("tuber",
            () -> new Item(new Item.Properties()));
    //花朵
    public static final RegistryObject<Item> SPATHE = ITEMS.register("spathe",
            () -> new Item(new Item.Properties()));
    //果子
    public static final RegistryObject<Item> ARISAEMA_AMURENSE_BERRY = ITEMS.register("berry",
            () -> new Item(new Item.Properties().food(ModFoods.ARISAEMA_AMURENSE_BERRY)));
    //本体
    public static final RegistryObject<Item> ARISAEMA_AMURENSE = ITEMS.register("arisaema_amurense",
            () -> new Item(new Item.Properties()));
    //干制版本
    public static final RegistryObject<Item> ARISAEMA_AMURENSE_DRIED = ITEMS.register("arisaema_amurense_dried",
            () -> new Item(new Item.Properties()));
    //熔炉烤制版本
    public static final RegistryObject<Item> ARISAEMA_AMURENSE_COOKED = ITEMS.register("arisaema_amurense_cooked",
            () -> new Item(new Item.Properties()));
    //晶针
    public static final RegistryObject<Item> RAPHIDES = ITEMS.register("raphides",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
