package net.juhumc.therandompack.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.juhumc.therandompack.TheRandomPack;
import net.juhumc.therandompack.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup PINK_GARNET_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TheRandomPack.MOD_ID, "pink_garnet_group"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.pink_garnet_group")).icon(() -> new ItemStack(ModItems.PINK_GARNET)).entries((displayContext, entries) -> {
                entries.add(ModItems.PINK_GARNET);
                entries.add(ModItems.RAW_PINK_GARNET);
                entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
                entries.add(ModBlocks.PINK_GARNET_BLOCK);
                entries.add(ModBlocks.PINK_GARNET_ORE);
                entries.add(ModBlocks.DEEPSLATE_PINK_GARNET_ORE);
                entries.add(ModBlocks.END_STONE_PINK_GARNET_ORE);
                entries.add((ModBlocks.NETHER_PINK_GARNET_ORE));
            }).build());

    public static void registerItemGroups(){

    }
}
