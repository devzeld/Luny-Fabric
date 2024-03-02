package me.zeld.luny;

import me.zeld.luny.item.ModItem;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Luny implements ModInitializer {

	public static final String MOD_ID = "luny";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Luny is here!");

		ModItem.registerModItems();
	}
}