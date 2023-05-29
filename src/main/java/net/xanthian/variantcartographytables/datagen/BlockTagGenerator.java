package net.xanthian.variantcartographytables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import net.xanthian.variantcartographytables.block.CartographyTables;

import java.util.concurrent.CompletableFuture;

import static net.xanthian.variantcartographytables.Initialise.MOD_ID;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final TagKey<Block> CARTOGRAPHYTABLES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"cartographytables"));
    private static final TagKey<Block> MINEABLE_AXE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:mineable/axe"));
    private static final TagKey<Block> JOB_SITE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c:villager_job_sites"));

    @Override
    protected void configure (RegistryWrapper.WrapperLookup arg){

        getOrCreateTagBuilder(CARTOGRAPHYTABLES)
                .add(CartographyTables.ACACIA_CARTOGRAPHY_TABLE)
                .add(CartographyTables.BAMBOO_CARTOGRAPHY_TABLE)
                .add(CartographyTables.BIRCH_CARTOGRAPHY_TABLE)
                .add(CartographyTables.CHERRY_CARTOGRAPHY_TABLE)
                .add(CartographyTables.CRIMSON_CARTOGRAPHY_TABLE)
                .add(CartographyTables.JUNGLE_CARTOGRAPHY_TABLE)
                .add(CartographyTables.MANGROVE_CARTOGRAPHY_TABLE)
                .add(CartographyTables.OAK_CARTOGRAPHY_TABLE)
                .add(CartographyTables.SPRUCE_CARTOGRAPHY_TABLE)
                .add(CartographyTables.WARPED_CARTOGRAPHY_TABLE);

        getOrCreateTagBuilder(MINEABLE_AXE)
                .addTag(CARTOGRAPHYTABLES);

        getOrCreateTagBuilder(JOB_SITE)
                .addTag(CARTOGRAPHYTABLES);

    }
}