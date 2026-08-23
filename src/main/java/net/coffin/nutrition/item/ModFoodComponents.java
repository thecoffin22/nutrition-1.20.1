package net.coffin.nutrition.item;

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

    public static final FoodComponent COOKED_TROPICAL_FISH = new FoodComponent.Builder().hunger(5).saturationModifier(0.6f)
            .build();

    public static final FoodComponent COOKED_PUFFERFISH = new FoodComponent.Builder().hunger(5).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 20 * 12), 0.2f)
            .build();

    public static final FoodComponent AXOLOTL = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20 * 4, 0), 1.0f)
            .build();

    public static final FoodComponent COOKED_AXOLOTL = new FoodComponent.Builder().hunger(3).saturationModifier(0.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20 * 8, 0), 1.0f)
            .build();

    //Bowl
    public static final FoodComponent MAGMA_CREAM_SOUP = createSmallStew(8)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20 * 120), 1.0f)
            .build();

    public static final FoodComponent SLIME_SOUP = createSmallStew(8)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 20 * 16, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 20 * 16), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 20 * 8, 2), 0.05f)
            .build();

    private static FoodComponent.Builder createSmallStew(int hunger) {
        return new FoodComponent.Builder().hunger(hunger).saturationModifier(0.7F);
    }
}
