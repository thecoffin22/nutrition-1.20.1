package net.coffin.nutrition.item;

import net.coffin.nutrition.item.custom.GooJuiceItem;
import net.coffin.nutrition.item.custom.JerkyItem;
import net.coffin.nutrition.item.custom.MagmaCreamSoupItem;
import net.coffin.nutrition.item.custom.SlimeSoupItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.coffin.nutrition.Nutrition;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.minecraft.item.Items.register;

public class ModItems {

    public static final Item LIGHT_GOLDEN_APPLE = registerItem("light_golden_apple", new Item(new FabricItemSettings().food(ModFoodComponents.LIGHT_GOLDEN_APPLE)
            .maxCount(64)));
    public static final Item GOLDEN_POTATO = registerItem("golden_potato", new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_POTATO)
            .maxCount(64)));
    public static final Item GOLDEN_BEETROOT = registerItem("golden_beetroot", new Item(new FabricItemSettings().food(ModFoodComponents.GOLDEN_BEETROOT)
            .maxCount(64)));
    public static final Item JERKY = registerItem("jerky", new JerkyItem(new FabricItemSettings().food(ModFoodComponents.JERKY)
            .maxCount(64)));
    public static final Item NIBBLED_JERKY = registerItem("nibbled_jerky", new Item(new FabricItemSettings().food(ModFoodComponents.NIBBLED_JERKY)
            .maxCount(64)));
    public static final Item COOKED_TROPICAL_FISH = registerItem("cooked_tropical_fish", new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_TROPICAL_FISH)
            .maxCount(64)));
    public static final Item COOKED_PUFFERFISH = registerItem("cooked_pufferfish", new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_PUFFERFISH)
            .maxCount(64)));
    public static final Item AXOLOTL = registerItem("axolotl", new Item(new FabricItemSettings().food(ModFoodComponents.AXOLOTL)
            .maxCount(64)));
    public static final Item COOKED_AXOLOTL = registerItem("cooked_axolotl", new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_AXOLOTL)
            .maxCount(64)));

    public static final Item MAGMA_CREAM_SOUP = registerItem("magma_cream_soup", new MagmaCreamSoupItem(new FabricItemSettings().food(ModFoodComponents.MAGMA_CREAM_SOUP)
            .maxCount(16)));
    public static final Item SLIME_SOUP = registerItem("slime_soup", new SlimeSoupItem(new FabricItemSettings().food(ModFoodComponents.SLIME_SOUP)
            .maxCount(16)));

    public static final Item GOO_JUICE = registerItem("goo_juice", new GooJuiceItem(new FabricItemSettings().food(ModFoodComponents.GOO_JUICE)
            .maxCount(16)));

    private static void addItemsToFoodItemGroup(FabricItemGroupEntries entries) {
        entries.add(LIGHT_GOLDEN_APPLE);
        entries.add(GOLDEN_POTATO);
        entries.add(GOLDEN_BEETROOT);
        entries.add(JERKY);
        entries.add(NIBBLED_JERKY);
        entries.add(COOKED_TROPICAL_FISH);
        entries.add(COOKED_PUFFERFISH);
        entries.add(AXOLOTL);
        entries.add(COOKED_AXOLOTL);

        entries.add(MAGMA_CREAM_SOUP);
        entries.add(SLIME_SOUP);

        entries.add(GOO_JUICE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Nutrition.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Nutrition.LOGGER.info("Registering Mod Items for " + Nutrition.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodItemGroup);
    }
}