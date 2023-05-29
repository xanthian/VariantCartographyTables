package net.xanthian.variantcartographytables.utils;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.FireBlock;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.xanthian.variantcartographytables.block.CartographyTables;

public class ModRegistries {

    public static void registerFuelandFlammable() {
        //registerFlammableBlocks(); //not flammable
        registerFuel();
    }

    private static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

/**
 Copy from {@link FireBlock#registerDefaultFlammables()}
 **/

        registry.add(CartographyTables.ACACIA_CARTOGRAPHY_TABLE, 30, 20);
        registry.add(CartographyTables.BAMBOO_CARTOGRAPHY_TABLE, 30, 20);
        registry.add(CartographyTables.BIRCH_CARTOGRAPHY_TABLE, 30, 20);
        registry.add(CartographyTables.CHERRY_CARTOGRAPHY_TABLE, 30, 20);
        registry.add(CartographyTables.JUNGLE_CARTOGRAPHY_TABLE, 30, 20);
        registry.add(CartographyTables.MANGROVE_CARTOGRAPHY_TABLE, 30, 20);
        registry.add(CartographyTables.OAK_CARTOGRAPHY_TABLE, 30, 20);
        registry.add(CartographyTables.SPRUCE_CARTOGRAPHY_TABLE, 30, 20);
    }

    private static void registerFuel() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

/**
 Copy from {@link AbstractFurnaceBlockEntity#createFuelTimeMap()}
 **/

        registry.add(CartographyTables.ACACIA_CARTOGRAPHY_TABLE, 300);
        registry.add(CartographyTables.BAMBOO_CARTOGRAPHY_TABLE, 300);
        registry.add(CartographyTables.BIRCH_CARTOGRAPHY_TABLE, 300);
        registry.add(CartographyTables.CHERRY_CARTOGRAPHY_TABLE, 300);
        registry.add(CartographyTables.JUNGLE_CARTOGRAPHY_TABLE, 300);
        registry.add(CartographyTables.MANGROVE_CARTOGRAPHY_TABLE, 300);
        registry.add(CartographyTables.OAK_CARTOGRAPHY_TABLE, 300);
        registry.add(CartographyTables.SPRUCE_CARTOGRAPHY_TABLE, 300);
    }
}