package com.ayanami.araceae;

import com.ayanami.araceae.effect.ModEffects;
import com.ayanami.araceae.item.ModItems;
import com.ayanami.araceae.item.ModCreativeModTabs;
import com.ayanami.araceae.block.ModBlocks;
import com.mojang.logging.LogUtils;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

@Mod(Araceae.MOD_ID)
public class Araceae {
    public static final String MOD_ID = "araceae";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Araceae() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModEffects.register(modEventBus);

    //    modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
       // modEventBus.addListener(this::addCreative);
    }

//    private void addCreative(BuildCreativeModeTabContentsEvent event){
//        if(event.getTabKey() ==CreativeModeTabs.INGREDIENTS){
//            event.accept(ModItems.SCALE_LEAF);
//        }
//    }

//    public static void onLoggedIn (PlayerEvent.@NotNull PlayerLoggedInEvent event){
//        var player = event.getEntity();
//        player.sendSystemMessage(Component.translatable("欢迎使用天南星科模组"));
//    }

}
