package net.coffin.nutrition.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.coffin.nutrition.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.LIGHT_GOLDEN_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_POTATO, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLDEN_BEETROOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_TROPICAL_FISH, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_PUFFERFISH, Models.GENERATED);
        itemModelGenerator.register(ModItems.JERKY, Models.GENERATED);
        itemModelGenerator.register(ModItems.AXOLOTL, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_AXOLOTL, Models.GENERATED);

        itemModelGenerator.register(ModItems.MAGMA_CREAM_SOUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.SLIME_SOUP, Models.GENERATED);
    }
}