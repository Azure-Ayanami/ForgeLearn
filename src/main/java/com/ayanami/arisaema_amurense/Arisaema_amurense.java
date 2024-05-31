package com.ayanami.arisaema_amurense;

import com.ayanami.arisaema_amurense.item.ModItems;
import com.mojang.logging.LogUtils;
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
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

import java.util.Properties;

@Mod(Arisaema_amurense.MOD_ID)
public class Arisaema_amurense {
    public static final String MOD_ID = "arisaema_amurense";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Arisaema_amurense() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

//        ModCreativeModTabs.register(modEventBus);
//
//        ModItems.register(modEventBus);
//        ModBlocks.register(modEventBus);
    }

    public static void onLoggedIn (PlayerEvent.@NotNull PlayerLoggedInEvent event){
        var player = event.getEntity();
        player.sendSystemMessage(Component.translatable("欢迎使用arisaema_amurense模组"));
    }

}
