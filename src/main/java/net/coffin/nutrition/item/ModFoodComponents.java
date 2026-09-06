package net.coffin.nutrition.item;

import net.minecraft.block.GrassBlock;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Items;

public class ModFoodComponents {
    public static final FoodComponent LIGHT_GOLDEN_APPLE = new FoodComponent.Builder().hunger(4).saturationModifier(1.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20 * 60), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20 * 5, 0), 1.0f)
            .alwaysEdible().build();

    public static final FoodComponent GOLDEN_POTATO = new FoodComponent.Builder().hunger(6).saturationModifier(1.2f)
            .build();

    public static final FoodComponent GOLDEN_BEETROOT = new FoodComponent.Builder().hunger(6).saturationModifier(1.2f)
            .build();

    public static final FoodComponent JERKY = new FoodComponent.Builder().hunger(2).saturationModifier(0.35f)
            .snack().build();
    public static final FoodComponent NIBBLED_JERKY = new FoodComponent.Builder().hunger(1).saturationModifier(0.15f)
            .snack().build();

    public static final FoodComponent COOKED_TROPICAL_FISH = new FoodComponent.Builder().hunger(5).saturationModifier(0.6f)
            .build();

    public static final FoodComponent COOKED_PUFFERFISH = new FoodComponent.Builder().hunger(5).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20 * 12), 0.05f)
            .build();

    public static final FoodComponent AXOLOTL = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20 * 4, 0), 1.0f)
            .build();

    public static final FoodComponent COOKED_AXOLOTL = new FoodComponent.Builder().hunger(3).saturationModifier(0.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20 * 4, 0), 1.0f)
            .build();

    public static final FoodComponent GLOW_CANDY = new FoodComponent.Builder().hunger(2).saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 20 * 10, 0), 0.1f)
            .snack().build();

    public static final FoodComponent SWEET_CANDY = new FoodComponent.Builder().hunger(2).saturationModifier(0.1f)
            .snack().build();

    public static final FoodComponent CHOCOLATE = new FoodComponent.Builder().hunger(1).saturationModifier(0.05f)
            .build();

    public static final FoodComponent POP_CRYSTALS = new FoodComponent.Builder().hunger(2).saturationModifier(0.1f)
            .snack().build();

    //Bowl
    public static final FoodComponent MAGMA_CREAM_SOUP = createSmallStew(7)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20 * 15), 1.0f)
            .build();

    public static final FoodComponent SLIME_SOUP = createSmallStew(7)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 20 * 8, 2), 0.05f)
            .build();

    //Bottles
    public static final FoodComponent GOO_JUICE = new FoodComponent.Builder().hunger(4).saturationModifier(0.1f)
            .build();

    private static FoodComponent.Builder createSmallStew(int hunger) {
        return new FoodComponent.Builder().hunger(hunger).saturationModifier(0.7F);
    }
}
