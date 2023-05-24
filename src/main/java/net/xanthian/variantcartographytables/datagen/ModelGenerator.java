package net.xanthian.variantcartographytables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;

import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

import net.xanthian.variantcartographytables.block.CartographyTables;
import net.xanthian.variantcartographytables.utils.ModTextureMap;

public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeWithCustomTextures(CartographyTables.ACACIA_CARTOGRAPHY_TABLE, Blocks.ACACIA_PLANKS, ModTextureMap::threesides);
        blockStateModelGenerator.registerCubeWithCustomTextures(CartographyTables.BAMBOO_CARTOGRAPHY_TABLE, Blocks.BAMBOO_PLANKS, ModTextureMap::threesides);
        blockStateModelGenerator.registerCubeWithCustomTextures(CartographyTables.CHERRY_CARTOGRAPHY_TABLE, Blocks.CHERRY_PLANKS, ModTextureMap::threesides);
        blockStateModelGenerator.registerCubeWithCustomTextures(CartographyTables.SPRUCE_CARTOGRAPHY_TABLE, Blocks.SPRUCE_PLANKS, ModTextureMap::threesides);
        blockStateModelGenerator.registerCubeWithCustomTextures(CartographyTables.JUNGLE_CARTOGRAPHY_TABLE, Blocks.JUNGLE_PLANKS, ModTextureMap::threesides);
        blockStateModelGenerator.registerCubeWithCustomTextures(CartographyTables.MANGROVE_CARTOGRAPHY_TABLE, Blocks.MANGROVE_PLANKS, ModTextureMap::threesides);
        blockStateModelGenerator.registerCubeWithCustomTextures(CartographyTables.OAK_CARTOGRAPHY_TABLE, Blocks.OAK_PLANKS, ModTextureMap::threesides);
        blockStateModelGenerator.registerCubeWithCustomTextures(CartographyTables.BIRCH_CARTOGRAPHY_TABLE, Blocks.BIRCH_PLANKS, ModTextureMap::threesides);
        blockStateModelGenerator.registerCubeWithCustomTextures(CartographyTables.CRIMSON_CARTOGRAPHY_TABLE, Blocks.CRIMSON_PLANKS, ModTextureMap::threesides);
        blockStateModelGenerator.registerCubeWithCustomTextures(CartographyTables.WARPED_CARTOGRAPHY_TABLE, Blocks.WARPED_PLANKS, ModTextureMap::threesides);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}