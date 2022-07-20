package net.gdogjam.tutorialmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent CROWN = new FoodComponent.Builder().saturationModifier(2f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 1), 1.0f).alwaysEdible().build();

}
