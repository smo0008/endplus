package net.ruben.endplus.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.ruben.endplus.EndplusMod;

public class ModBlocks {

    public static final Block ENDEREON_ORE = registerBlock("endereon_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.copy(Blocks.END_STONE).strength(0.5f)));


    public static void registerModBlocks() {
        EndplusMod.LOGGER.info("Registering Mod Items for " + EndplusMod.MOD_ID);

    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(EndplusMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(EndplusMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
}