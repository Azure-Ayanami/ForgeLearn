package com.ayanami.araceae.item;

import com.ayanami.araceae.Araceae;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
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
    public static final RegistryObject<Item> AMORPHOPHALLUS_TITANUM = ITEMS.register("amorphophallus_titanum",
            () -> new Item(new Item.Properties().food(ModFoods.AMORPHOPHALLUS_TITANUM)));
    public static final RegistryObject<Item> ASTEROSTIGMA = ITEMS.register("asterostigma",
            () -> new Item(new Item.Properties().food(ModFoods.ASTEROSTIGMA)));
    public static final RegistryObject<Item> PINELLIA = ITEMS.register("pinellia",
            () -> new Item(new Item.Properties().food(ModFoods.PINELLIA)));
    public static final RegistryObject<Item> DRACONTIUM = ITEMS.register("dracontium",
            () -> new Item(new Item.Properties().food(ModFoods.DRACONTIUM)));
    public static final RegistryObject<Item> LEMNA = ITEMS.register("lemna",
            () -> new Item(new Item.Properties().food(ModFoods.LEMNA)));
    public static final RegistryObject<Item> MONSTERA = ITEMS.register("monstera",
            () -> new Item(new Item.Properties().food(ModFoods.MONSTERA)));
    public static final RegistryObject<Item> AQUATICUM = ITEMS.register("aquaticum",
            () -> new Item(new Item.Properties().food(ModFoods.AQUATICUM)));
    public static final RegistryObject<Item> ACAULE = ITEMS.register("acaule",
            () -> new Item(new Item.Properties().food(ModFoods.ACAULE)));
    public static final RegistryObject<Item> ZAMIIFOLIA = ITEMS.register("zamiifolia",
            () -> new Item(new Item.Properties().food(ModFoods.ZAMIIFOLIA)));

    //处理品
    public static final RegistryObject<Item> ARACEAE_TUBER = ITEMS.register("araceae_tuber",
            () -> new Item(new Item.Properties().food(ModFoods.TUBER)));
    public static final RegistryObject<Item> ARACEAE_TRIFOLIATE = ITEMS.register("araceae_trifoliate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ARACEAE_SPATHE = ITEMS.register("araceae_spathe",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ARACEAE_ALKALOIDS = ITEMS.register("araceae_alkaloids",
            () -> new Item(new Item.Properties()));


    //weapon
    public static final RegistryObject<Item> ARACEAE_SWORD = ITEMS.register("araceae_sword",
            () -> new SwordItem(ModToolTiers.ARACEAE, 3, 3, new Item.Properties()));

    public static final RegistryObject<Item> ASKALON = ITEMS.register("askalon",
            () -> new SwordItem(ModToolTiers.ARACEAE, 10, 1, new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
