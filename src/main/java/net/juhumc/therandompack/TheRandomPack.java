package net.juhumc.therandompack;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheRandomPack implements ModInitializer {
	public static final String MOD_ID = "therandompack";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");

		LOGGER.warn("Im Launching the Mod" + MOD_ID +"Sucsessfully?"); //hi
	}
}