package com.ayanami.arisaema_amurense;

import com.ayanami.arisaema_amurense.item.ModItems;
import com.ayanami.arisaema_amurense.item.ModCreativeModTabs;
import com.ayanami.arisaema_amurense.block.ModBlocks;
import com.mojang.logging.LogUtils;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

@Mod(Arisaema_amurense.MOD_ID)
public class Arisaema_amurense {
    public static final String MOD_ID = "arisaema_amurense";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Arisaema_amurense() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

    //    modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event){
        if(event.getTabKey() ==CreativeModeTabs.INGREDIENTS){
            event.accept(ModItems.SCALE_LEAF);
        }
    }

    public static void onLoggedIn (PlayerEvent.@NotNull PlayerLoggedInEvent event){
        var player = event.getEntity();
        player.sendSystemMessage(Component.translatable("欢迎使用arisaema_amurense模组"));
    }

}
