package net.gdogjam.tutorialmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.gdogjam.tutorialmod.TutorialMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup Tanzanite = FabricItemGroupBuilder.build(
            new Identifier(TutorialMod.MOD_ID, "tanzanite"), () -> new ItemStack(ModItems.TANZANITE));
}
