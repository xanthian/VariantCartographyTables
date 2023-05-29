package net.xanthian.variantcartographytables;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;


import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import net.xanthian.variantcartographytables.block.CartographyTables;
import net.xanthian.variantcartographytables.utils.ModPOITypes;
import net.xanthian.variantcartographytables.utils.ModRegistries;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "variantcartographytables";

    public static final RegistryKey<ItemGroup> ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "variantcartographytables"));

    @Override
    public void onInitialize() {
        // Custom Item Group
        Registry.register(Registries.ITEM_GROUP, ITEM_GROUP, FabricItemGroup.builder()
                .displayName(Text.translatable("variantcartographytables.group.variantcartographytables"))
                .icon(() -> new ItemStack(CartographyTables.MANGROVE_CARTOGRAPHY_TABLE))
                .entries((context, entries) -> {
                    entries.add(CartographyTables.ACACIA_CARTOGRAPHY_TABLE);
                    entries.add(CartographyTables.BAMBOO_CARTOGRAPHY_TABLE);
                    entries.add(CartographyTables.BIRCH_CARTOGRAPHY_TABLE);
                    entries.add(CartographyTables.CHERRY_CARTOGRAPHY_TABLE);
                    entries.add(CartographyTables.CRIMSON_CARTOGRAPHY_TABLE);
                    entries.add(Blocks.CARTOGRAPHY_TABLE); // Dark Oak
                    entries.add(CartographyTables.JUNGLE_CARTOGRAPHY_TABLE);
                    entries.add(CartographyTables.MANGROVE_CARTOGRAPHY_TABLE);
                    entries.add(CartographyTables.OAK_CARTOGRAPHY_TABLE);
                    entries.add(CartographyTables.SPRUCE_CARTOGRAPHY_TABLE);
                    entries.add(CartographyTables.WARPED_CARTOGRAPHY_TABLE);
                })
                .build());

        // Cartography Table Registration
        CartographyTables.registerVanillaTables();

        // Fuel & Flammable Block registration
        ModRegistries.registerFuelandFlammable();

        // Cartographer POI Registration
        ModPOITypes.init();

    }
}