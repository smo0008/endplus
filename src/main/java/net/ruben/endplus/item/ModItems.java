package net.ruben.endplus.item;

import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.ruben.endplus.EndplusMod;


public class ModItems {
    public static final Item ENDIUM_INGOT = registerItem("endium_ingot", new Item(new Item.Settings()));


    public static void registerModItems() {
        EndplusMod.LOGGER.info("Registering Mod Items for " + EndplusMod.MOD_ID);

    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EndplusMod.MOD_ID, name), item);
    }
}
