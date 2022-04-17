package net.wizardcraft112.oresgalore;

import net.fabricmc.api.ModInitializer;
import net.wizardcraft112.oresgalore.block.ModBlocks;
import net.wizardcraft112.oresgalore.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OresGalore implements ModInitializer {
	public static final String MOD_ID = "oresgalore";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
