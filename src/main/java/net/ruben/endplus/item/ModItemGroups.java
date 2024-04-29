package net.ruben.endplus.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.ruben.endplus.EndplusMod;
import net.ruben.endplus.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ENDPLUS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(EndplusMod.MOD_ID, "maccas"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.endplus"))
                    .icon(() -> new ItemStack(ModItems.ENDIUM_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ENDIUM_INGOT);



                        entries.add(ModBlocks.ENDIUM_ORE);



                    }).build());


    public static void registerItemGroups() {
        EndplusMod.LOGGER.info("Registering Item Groups for " + EndplusMod.MOD_ID);
    }
}