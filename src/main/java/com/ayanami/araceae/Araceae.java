package com.ayanami.araceae;

import com.ayanami.araceae.effect.ModEffects;
import com.ayanami.araceae.item.ModItems;
import com.ayanami.araceae.item.ModCreativeModTabs;
import com.ayanami.araceae.block.ModBlocks;
import com.ayanami.araceae.potion.ModPotions;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
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
        ModPotions.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
