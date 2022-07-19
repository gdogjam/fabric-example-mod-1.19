package net.gdogjam.tutorialmod.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.OrePlacedFeatures;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {


    public static final RegistryEntry<PlacedFeature> TANZANITE_ORE_PLACED = PlacedFeatures.register("tanzanite_ore_placed",
            ModConfiguredFeatures.TANZANITE_ORE, modifiersWithCount(9,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));

    public static final RegistryEntry<PlacedFeature> FISH_BLOCK_PLACED = PlacedFeatures.register("fish_block_placed",
            ModConfiguredFeatures.FISH_BLOCK, modifiersWithCount(5,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(70))));

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }


}
