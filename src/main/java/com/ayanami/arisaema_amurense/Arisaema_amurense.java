package com.ayanami.arisaema_amurense;

import net.minecraft.client.Minecraft;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.vehicle.Minecart;
import net.minecraft.world.entity.vehicle.MinecartFurnace;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Properties;

@Mod(Arisaema_amurense.MOD_ID)
public class Arisaema_amurense {
    public static final String MOD_ID = "arisaema_amurense";

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "arisaema_amurense");
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "arisaema_amurense");
    public static final RegistryObject<Block> ROCK_BLOCK = BLOCKS.register("rock", ()->new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));
    public static final RegistryObject<Item> LINGHT_ITEM = ITEMS.register("linght", ()->new Item(new Item.Properties()));

    public Arisaema_amurense() {
        MinecraftForge.EVENT_BUS.addListener(Arisaema_amurense::onLoggedIn);
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    @SubscribeEvent
    public void buildContents(@NotNull BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ROCK_BLOCK.get());
            event.accept(LINGHT_ITEM.get());
        }
    }


    public static void onLoggedIn (PlayerEvent.@NotNull PlayerLoggedInEvent event){
        var player = event.getEntity();
        player.sendSystemMessage(Component.translatable("欢迎使用arisaema_amurense模组"));
    }

}
