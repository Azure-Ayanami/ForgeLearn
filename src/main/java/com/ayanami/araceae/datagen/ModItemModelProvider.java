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
import org.jetbrains.annotations.NotNull;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Araceae.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.ARACEAE);
        simpleItem(ModItems.ASKALON);
    }

    private int logCounter = 0;
    private ItemModelBuilder simpleItem(@NotNull RegistryObject<Item> item) {
        logCounter++;
        Araceae.LOGGER.info("数据生成 - 第{}次", logCounter);
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Araceae.MOD_ID, "item/" + item.getId().getPath()));
    }
}
