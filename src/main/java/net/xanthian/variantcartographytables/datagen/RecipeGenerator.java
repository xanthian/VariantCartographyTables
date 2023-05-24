package net.xanthian.variantcartographytables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import net.xanthian.variantcartographytables.block.CartographyTables;

import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, CartographyTables.ACACIA_CARTOGRAPHY_TABLE)
                .input('@', Items.PAPER)
                .input('#', Blocks.ACACIA_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.PAPER), FabricRecipeProvider.conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CartographyTables.ACACIA_CARTOGRAPHY_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, CartographyTables.BAMBOO_CARTOGRAPHY_TABLE)
                .input('@', Items.PAPER)
                .input('#', Blocks.BAMBOO_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.PAPER), FabricRecipeProvider.conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CartographyTables.BAMBOO_CARTOGRAPHY_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, CartographyTables.CHERRY_CARTOGRAPHY_TABLE)
                .input('@', Items.PAPER)
                .input('#', Blocks.CHERRY_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.PAPER), FabricRecipeProvider.conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CartographyTables.CHERRY_CARTOGRAPHY_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, CartographyTables.SPRUCE_CARTOGRAPHY_TABLE)
                .input('@', Items.PAPER)
                .input('#', Blocks.SPRUCE_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.PAPER), FabricRecipeProvider.conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CartographyTables.SPRUCE_CARTOGRAPHY_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, CartographyTables.JUNGLE_CARTOGRAPHY_TABLE)
                .input('@', Items.PAPER)
                .input('#', Blocks.JUNGLE_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.PAPER), FabricRecipeProvider.conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CartographyTables.JUNGLE_CARTOGRAPHY_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, CartographyTables.MANGROVE_CARTOGRAPHY_TABLE)
                .input('@', Items.PAPER)
                .input('#', Blocks.MANGROVE_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.PAPER), FabricRecipeProvider.conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CartographyTables.MANGROVE_CARTOGRAPHY_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, CartographyTables.OAK_CARTOGRAPHY_TABLE)
                .input('@', Items.PAPER)
                .input('#', Blocks.OAK_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.PAPER), FabricRecipeProvider.conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CartographyTables.OAK_CARTOGRAPHY_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, CartographyTables.BIRCH_CARTOGRAPHY_TABLE)
                .input('@', Items.PAPER)
                .input('#', Blocks.BIRCH_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.PAPER), FabricRecipeProvider.conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CartographyTables.BIRCH_CARTOGRAPHY_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, CartographyTables.CRIMSON_CARTOGRAPHY_TABLE)
                .input('@', Items.PAPER)
                .input('#', Blocks.CRIMSON_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.PAPER), FabricRecipeProvider.conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CartographyTables.CRIMSON_CARTOGRAPHY_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, CartographyTables.WARPED_CARTOGRAPHY_TABLE)
                .input('@', Items.PAPER)
                .input('#', Blocks.WARPED_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.PAPER), FabricRecipeProvider.conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CartographyTables.WARPED_CARTOGRAPHY_TABLE)));
    }
}