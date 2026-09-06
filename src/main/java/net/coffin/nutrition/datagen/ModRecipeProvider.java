package net.coffin.nutrition.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.coffin.nutrition.item.ModItems;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> COOKED_TROPICAL_FISH_SMELTABLES = List.of(Items.TROPICAL_FISH);
    private static final List<ItemConvertible> COOKED_PUFFERFISH_SMELTABLES = List.of(Items.PUFFERFISH);
    private static final List<ItemConvertible> COOKED_AXOLOTL_SMELTABLES = List.of(ModItems.AXOLOTL);
    private static final List<ItemConvertible> CHOCOLATE_SMELTABLES = List.of(Items.COCOA_BEANS);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        //Golden Foods
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.LIGHT_GOLDEN_APPLE, 1)
                .pattern(" S ")
                .pattern("SRS")
                .pattern(" S ")
                .input('S', Items.GOLD_INGOT)
                .input('R', Items.APPLE)
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.LIGHT_GOLDEN_APPLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GOLDEN_POTATO, 1)
                .pattern("SSS")
                .pattern("SRS")
                .pattern("SSS")
                .input('S', Items.GOLD_NUGGET)
                .input('R', Items.POTATO)
                .criterion(hasItem(Items.GOLD_NUGGET), conditionsFromItem(Items.GOLD_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_POTATO)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.GOLDEN_BEETROOT, 1)
                .pattern("SSS")
                .pattern("SRS")
                .pattern("SSS")
                .input('S', Items.GOLD_NUGGET)
                .input('R', Items.BEETROOT)
                .criterion(hasItem(Items.GOLD_NUGGET), conditionsFromItem(Items.GOLD_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.GOLDEN_BEETROOT)));

        //Tropical Fish
        offerSmelting(exporter, COOKED_TROPICAL_FISH_SMELTABLES, RecipeCategory.MISC, ModItems.COOKED_TROPICAL_FISH,
                0.7f, 200, "nutrition");
        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.TROPICAL_FISH), RecipeCategory.FOOD, ModItems.COOKED_TROPICAL_FISH, 0.15f, 100)
                .criterion(hasItem(Items.TROPICAL_FISH), conditionsFromItem(Items.TROPICAL_FISH))
                .offerTo(exporter, getRecipeName(ModItems.COOKED_TROPICAL_FISH) + "_from_smoker");
        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.TROPICAL_FISH), RecipeCategory.FOOD, ModItems.COOKED_TROPICAL_FISH, 0.15f, 250)
                .criterion(hasItem(Items.TROPICAL_FISH), conditionsFromItem(Items.TROPICAL_FISH))
                .offerTo(exporter, getRecipeName(ModItems.COOKED_TROPICAL_FISH) + "_from_campfire");

        //Pufferfish
        offerSmelting(exporter, COOKED_PUFFERFISH_SMELTABLES, RecipeCategory.MISC, ModItems.COOKED_PUFFERFISH,
                0.7f, 200, "nutrition");
        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.PUFFERFISH), RecipeCategory.FOOD, ModItems.COOKED_PUFFERFISH, 0.15f, 100)
                .criterion(hasItem(Items.PUFFERFISH), conditionsFromItem(Items.PUFFERFISH))
                .offerTo(exporter, getRecipeName(ModItems.COOKED_PUFFERFISH) + "_from_smoker");
        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.PUFFERFISH), RecipeCategory.FOOD, ModItems.COOKED_PUFFERFISH, 0.15f, 250)
                .criterion(hasItem(Items.PUFFERFISH), conditionsFromItem(Items.PUFFERFISH))
                .offerTo(exporter, getRecipeName(ModItems.COOKED_PUFFERFISH) + "_from_campfire");

        //Jerky
        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.ROTTEN_FLESH), RecipeCategory.FOOD, ModItems.JERKY, 0.15f, 100)
                .criterion(hasItem(Items.ROTTEN_FLESH), conditionsFromItem(Items.ROTTEN_FLESH))
                .offerTo(exporter, getRecipeName(ModItems.JERKY) + "_from_smoker");
        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(Items.ROTTEN_FLESH), RecipeCategory.FOOD, ModItems.JERKY, 0.15f, 250)
                .criterion(hasItem(Items.ROTTEN_FLESH), conditionsFromItem(Items.ROTTEN_FLESH))
                .offerTo(exporter, getRecipeName(ModItems.JERKY) + "_from_campfire");

        //Axolotl
        offerSmelting(exporter, COOKED_AXOLOTL_SMELTABLES, RecipeCategory.MISC, ModItems.COOKED_AXOLOTL,
                0.7f, 200, "nutrition");
        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(ModItems.AXOLOTL), RecipeCategory.FOOD, ModItems.COOKED_AXOLOTL, 0.15f, 100)
                .criterion(hasItem(ModItems.AXOLOTL), conditionsFromItem(ModItems.AXOLOTL))
                .offerTo(exporter, getRecipeName(ModItems.COOKED_AXOLOTL) + "_from_smoker");
        CookingRecipeJsonBuilder.createCampfireCooking(Ingredient.ofItems(ModItems.AXOLOTL), RecipeCategory.FOOD, ModItems.COOKED_AXOLOTL, 0.15f, 250)
                .criterion(hasItem(ModItems.AXOLOTL), conditionsFromItem(ModItems.AXOLOTL))
                .offerTo(exporter, getRecipeName(ModItems.COOKED_AXOLOTL) + "_from_campfire");

        //Soups/Stews
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MAGMA_CREAM_SOUP, 1)
                .input(Items.BOWL)
                .input(Items.MAGMA_CREAM)
                .input(Items.MAGMA_CREAM)
                .input(Items.BLAZE_POWDER)
                .criterion(hasItem(Items.MAGMA_CREAM), conditionsFromItem(Items.MAGMA_CREAM))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SLIME_SOUP, 1)
                .input(Items.BOWL)
                .input(Items.SLIME_BALL)
                .input(Items.SLIME_BALL)
                .input(Items.SLIME_BALL)
                .criterion(hasItem(Items.SLIME_BALL), conditionsFromItem(Items.SLIME_BALL))
                .offerTo(exporter);

        //Vanilla Crafts
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.AXOLOTL_BUCKET, 1)
                .input(Items.WATER_BUCKET)
                .input(ModItems.AXOLOTL)
                .input(Items.GHAST_TEAR)
                .criterion(hasItem(Items.GHAST_TEAR), conditionsFromItem(Items.GHAST_TEAR))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, Items.COOKIE, 8)
                .pattern("SRS")
                .input('S', Items.WHEAT)
                .input('R', ModItems.CHOCOLATE)
                .criterion(hasItem(ModItems.CHOCOLATE), conditionsFromItem(ModItems.CHOCOLATE))
                .offerTo(exporter, new Identifier(getRecipeName(Items.COOKIE)));

        //Bottled
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GOO_JUICE, 1)
                .input(Items.GLASS_BOTTLE)
                .input(Items.SLIME_BALL)
                .criterion(hasItem(Items.SLIME_BALL), conditionsFromItem(Items.SLIME_BALL))
                .offerTo(exporter);

        //Candy
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GLOW_CANDY, 1)
                .input(Items.SUGAR)
                .input(Items.GLOW_BERRIES)
                .input(Items.GLOWSTONE_DUST)
                .criterion(hasItem(Items.GLOW_BERRIES), conditionsFromItem(Items.GLOW_BERRIES))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SWEET_CANDY, 1)
                .input(Items.SUGAR)
                .input(Items.SWEET_BERRIES)
                .criterion(hasItem(Items.SWEET_BERRIES), conditionsFromItem(Items.SWEET_BERRIES))
                .offerTo(exporter);

        //Chocolate
        offerSmelting(exporter, CHOCOLATE_SMELTABLES, RecipeCategory.MISC, ModItems.CHOCOLATE,
                0.7f, 200, "nutrition");
        CookingRecipeJsonBuilder.createSmoking(Ingredient.ofItems(Items.COCOA_BEANS), RecipeCategory.FOOD, ModItems.CHOCOLATE, 0.15f, 100)
                .criterion(hasItem(Items.COCOA_BEANS), conditionsFromItem(ModItems.AXOLOTL))
                .offerTo(exporter, getRecipeName(ModItems.CHOCOLATE) + "_from_smoker");

        //Pop Crystals
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.POP_CRYSTALS, 2)
                .input(Items.GUNPOWDER)
                .input(Items.SUGAR)
                .input(Items.AMETHYST_SHARD)
                .criterion(hasItem(Items.AMETHYST_SHARD), conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter);
    }
}