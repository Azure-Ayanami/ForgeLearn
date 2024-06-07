package com.ayanami.araceae.datagen;

import com.ayanami.araceae.Araceae;
import com.ayanami.araceae.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Araceae.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.SCALE_LEAF);
        simpleItem(ModItems.ARACEAE_TUBER);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        Araceae.LOGGER.info("数据生成");
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Araceae.MOD_ID, "item/" + item.getId().getPath()));
    }
}
