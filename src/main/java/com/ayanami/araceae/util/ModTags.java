package com.ayanami.araceae.util;

import com.ayanami.araceae.Araceae;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.tags.BlockTags;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> GROWABLE = tag("Growable");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Araceae.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> GROWABLE = tag("Growable");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Araceae.MOD_ID, name));
        }
    }
}
