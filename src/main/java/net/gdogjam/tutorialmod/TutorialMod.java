package net.gdogjam.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.gdogjam.tutorialmod.Block.ModBlocks;
import net.gdogjam.tutorialmod.item.ModItems;
import net.gdogjam.tutorialmod.util.ModRegistries;
import net.gdogjam.tutorialmod.villager.ModVillagers;
import net.gdogjam.tutorialmod.world.feature.ModConfiguredFeatures;
import net.gdogjam.tutorialmod.world.gen.ModOreGeneration;
import net.gdogjam.tutorialmod.world.structure.ModStructures;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {

	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModVillagers.registerVillagers();
		ModVillagers.registerTrades();
		ModRegistries.registerAttributes();
		ModOreGeneration.generateOres();

		ModStructures.registerStructureFeatures();
	}
}
