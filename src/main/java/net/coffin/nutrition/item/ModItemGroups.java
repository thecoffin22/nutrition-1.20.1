package net.coffin.nutrition.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.coffin.nutrition.Nutrition;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup NUTRITION_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Nutrition.MOD_ID, "nutrition"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.nutrition"))
                    .icon(() -> new ItemStack(ModItems.LIGHT_GOLDEN_APPLE)).entries((displayContext, entries) -> {


                        entries.add(ModItems.LIGHT_GOLDEN_APPLE);
                        entries.add(ModItems.GOLDEN_POTATO);
                        entries.add(ModItems.GOLDEN_BEETROOT);
                        entries.add(ModItems.JERKY);
                        entries.add(ModItems.COOKED_TROPICAL_FISH);
                        entries.add(ModItems.COOKED_PUFFERFISH);
                        entries.add(ModItems.AXOLOTL);
                        entries.add(ModItems.COOKED_AXOLOTL);

                        entries.add(ModItems.MAGMA_CREAM_SOUP);
                        entries.add(ModItems.SLIME_SOUP);

                    }).build());


    public static void registerItemGroups() {
        Nutrition.LOGGER.info("Registering Item Groups for " + Nutrition.MOD_ID);
    }
}