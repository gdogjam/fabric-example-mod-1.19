package net.gdogjam.tutorialmod.Block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.gdogjam.tutorialmod.Block.custom.JumpyBlock;
import net.gdogjam.tutorialmod.TutorialMod;
import net.gdogjam.tutorialmod.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block TANZANITE_BLOCK = registerBlock("tanzanite_block",
        new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.Tanzanite);
    public static final Block JUMPY_BLOCK = registerBlock("jumpy_block",
        new JumpyBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.Tanzanite);
    public static final Block TANZANITE_ORE = registerBlock("tanzanite_ore",
        new OreBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool(),
                UniformIntProvider.create(3, 7)), ModItemGroup.Tanzanite);
    public static final Block DEEPSLATE_TANZANITE_ORE = registerBlock("deepslate_tanzanite_ore",
        new OreBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool(),
                UniformIntProvider.create(3, 7)), ModItemGroup.Tanzanite);



    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);

    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks(){
        TutorialMod.LOGGER.debug("registering ModBlocks for " + TutorialMod.MOD_ID);

    }
}
