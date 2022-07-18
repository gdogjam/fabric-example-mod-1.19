package net.gdogjam.tutorialmod;

import net.fabricmc.api.ModInitializer;
import net.gdogjam.tutorialmod.Block.ModBlocks;
import net.gdogjam.tutorialmod.item.ModItems;
import net.gdogjam.tutorialmod.util.ModRegistries;
import net.gdogjam.tutorialmod.villager.ModVillagers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {

	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModVillagers.registerVillagers();
		ModVillagers.registerTrades();
		ModRegistries.registerAttributes();
	}
}
