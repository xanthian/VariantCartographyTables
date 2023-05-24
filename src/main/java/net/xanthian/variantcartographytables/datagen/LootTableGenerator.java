package net.xanthian.variantcartographytables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import net.xanthian.variantcartographytables.block.CartographyTables;

public class LootTableGenerator extends FabricBlockLootTableProvider {
    public LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(CartographyTables.ACACIA_CARTOGRAPHY_TABLE);
        addDrop(CartographyTables.BAMBOO_CARTOGRAPHY_TABLE);
        addDrop(CartographyTables.CHERRY_CARTOGRAPHY_TABLE);
        addDrop(CartographyTables.SPRUCE_CARTOGRAPHY_TABLE);
        addDrop(CartographyTables.JUNGLE_CARTOGRAPHY_TABLE);
        addDrop(CartographyTables.MANGROVE_CARTOGRAPHY_TABLE);
        addDrop(CartographyTables.OAK_CARTOGRAPHY_TABLE);
        addDrop(CartographyTables.BIRCH_CARTOGRAPHY_TABLE);
        addDrop(CartographyTables.CRIMSON_CARTOGRAPHY_TABLE);
        addDrop(CartographyTables.WARPED_CARTOGRAPHY_TABLE);
        addDrop(CartographyTables.MANGROVE_CARTOGRAPHY_TABLE);
    }
}