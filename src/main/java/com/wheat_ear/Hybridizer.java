package com.wheat_ear;

import com.wheat_ear.block.ModBlocks;
import com.wheat_ear.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hybridizer implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("hybridizer");
	public static final String MOD_ID = "hybridizer";

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModItems.registerModItemGroups();

		LOGGER.info("Mod Hybridizer has been initialized");
	}
}