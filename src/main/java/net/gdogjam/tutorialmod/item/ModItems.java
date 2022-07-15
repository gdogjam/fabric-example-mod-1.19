package net.gdogjam.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.gdogjam.tutorialmod.TutorialMod;
import net.gdogjam.tutorialmod.item.custom.EightBalIItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
            new Item(new FabricItemSettings().group(ModItemGroup.Tanzanite)));

    public static final Item TANZANITE = registerItem("tanzanite",
            new Item(new FabricItemSettings().group(ModItemGroup.Tanzanite)));
    public static final Item Eight_Ball = registerItem("eight_ball",
            new EightBalIItem(new FabricItemSettings().group(ModItemGroup.Tanzanite)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }



    public static void registerModItems() {
        TutorialMod.LOGGER.debug("Registering Mod Items for " + TutorialMod.MOD_ID);
    }
}
