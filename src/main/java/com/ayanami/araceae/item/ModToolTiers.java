package com.ayanami.araceae.item;

import com.ayanami.araceae.Araceae;
import com.ayanami.araceae.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

//工具等级
public class ModToolTiers {
    public static final Tier ARACEAE = TierSortingRegistry.registerTier(
            new ForgeTier(1, 300, 5f, 2, 30,
                    ModTags.Blocks.GROWABLE, () -> Ingredient.of(ModItems.ARACEAE.get())),
            new ResourceLocation(Araceae.MOD_ID, "araceae"), List.of(Tiers.NETHERITE), List.of()
    );
}
