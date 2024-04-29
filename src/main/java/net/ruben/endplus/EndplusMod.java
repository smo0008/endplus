package net.ruben.endplus;

import net.fabricmc.api.ModInitializer;
import net.ruben.endplus.item.ModItemGroups;
import net.ruben.endplus.item.ModItems;
import net.ruben.endplus.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EndplusMod implements ModInitializer {
    public static final String MOD_ID = "endplus";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModItemGroups.registerItemGroups();

    }

}
