package com.ayanami.araceae.datagen;

import com.ayanami.araceae.Araceae;
import com.ayanami.araceae.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> ARACEAE_SMELTABLES = List.of(ModItems.ARACEAE.get(),
            ModItems.ACAULE.get(), ModItems.AQUATICUM.get(), ModItems.AMORPHOPHALLUS_TITANUM.get(),
            ModItems.ASTEROSTIGMA.get(),ModItems.DRACONTIUM.get(), ModItems.ZAMIIFOLIA.get(),
            ModItems.PINELLIA.get(),ModItems.MONSTERA.get(), ModItems.LEMNA.get(), ModItems.ARACEAE_TUBER.get()
            );

    public ModRecipeProvider(PackOutput pOutput){
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        foodSmelting(pWriter, ARACEAE_SMELTABLES, RecipeCategory.MISC, ModItems.ARACEAE.get(), 0.25f, 200, "araceae");
    }


    protected static void foodSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        araceaeCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_smelting");
    }


    protected static void araceaeCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, @NotNull List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemLike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemLike), pCategory, pResult,
                    pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemLike), has(itemLike))
                    .save(pFinishedRecipeConsumer, Araceae.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemLike));
        }
    }
}
