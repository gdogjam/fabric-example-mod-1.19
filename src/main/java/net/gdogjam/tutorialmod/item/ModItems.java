package net.gdogjam.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.gdogjam.tutorialmod.Block.ModBlocks;
import net.gdogjam.tutorialmod.TutorialMod;
import net.gdogjam.tutorialmod.entity.ModEntities;
import net.gdogjam.tutorialmod.item.custom.CrownItem;
import net.gdogjam.tutorialmod.item.custom.EightBalIItem;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
            new Item(new FabricItemSettings().group(ModItemGroup.Tanzanite)));

    public static final Item TANZANITE = registerItem("tanzanite",
            new Item(new FabricItemSettings().group(ModItemGroup.Tanzanite)));

    public static final Item Eight_Ball = registerItem("eight_ball",
            new EightBalIItem(new FabricItemSettings().group(ModItemGroup.Tanzanite).maxCount(1)));

    public static final Item EGGPLANT_SEEDS = registerItem("eggplant_seeds",
            new AliasedBlockItem(ModBlocks.EGGPLANT_CROP, new FabricItemSettings().group(ModItemGroup.Tanzanite)));

    public static final Item EGGPLANT = registerItem("eggplant",
            new Item(new FabricItemSettings().group(ModItemGroup.Tanzanite).food(new FoodComponent.Builder().hunger(4).saturationModifier(4f).build())));

    public static final Item KING_CROWN = registerItem("crown",
            new CrownItem(new FabricItemSettings().food(ModFoodComponents.CROWN)));

    public static final Item VILLAGER_GUARD_EGG = registerItem("villager_guard_egg",
            new SpawnEggItem(ModEntities.VILLAGERGUARD, 0x048e8d, 0x3b3635, new FabricItemSettings().group(ModItemGroup.Tanzanite).maxCount(1)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }



    public static void registerModItems() {
        TutorialMod.LOGGER.debug("Registering Mod Items for " + TutorialMod.MOD_ID);
    }
}
