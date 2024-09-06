package com.ayanami.araceae.util;

import com.ayanami.araceae.Araceae;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.tags.BlockTags;
import org.jetbrains.annotations.NotNull;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> GROWABLE = tag("growable");


        private static @NotNull TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Araceae.MOD_ID, name));
        }
    }

    public static class Items {

        private static @NotNull TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Araceae.MOD_ID, name));
        }
    }
}
