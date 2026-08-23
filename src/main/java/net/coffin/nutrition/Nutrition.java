package net.coffin.nutrition;

import net.coffin.nutrition.item.ModItemGroups;
import net.coffin.nutrition.item.ModItems;
import net.coffin.nutrition.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Nutrition implements ModInitializer {
	public static final String MOD_ID = "nutrition";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();

        ModLootTableModifiers.modifyLootTables();
    }
}