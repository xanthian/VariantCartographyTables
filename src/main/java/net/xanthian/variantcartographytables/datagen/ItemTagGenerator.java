package net.xanthian.variantcartographytables.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.xanthian.variantcartographytables.block.CartographyTables;

import java.util.concurrent.CompletableFuture;

import static net.xanthian.variantcartographytables.Initialise.MOD_ID;

public class ItemTagGenerator extends FabricTagProvider.ItemTagProvider {
    public ItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

        private static final TagKey<Item> CARTOGRAPHYTABLES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"cartographytables"));
        private static final TagKey<Item> NON_FLAMMABLE_WOOD = TagKey.of(Registries.ITEM.getKey(), new Identifier("minecraft:non_flammable_wood"));
        private static final TagKey<Item> JOB_SITE = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:villager_job_sites"));

        @Override
        protected void configure (RegistryWrapper.WrapperLookup arg){

            getOrCreateTagBuilder(CARTOGRAPHYTABLES)
                    .add(Item.fromBlock(CartographyTables.ACACIA_CARTOGRAPHY_TABLE))
                    .add(Item.fromBlock(CartographyTables.BAMBOO_CARTOGRAPHY_TABLE))
                    .add(Item.fromBlock(CartographyTables.BIRCH_CARTOGRAPHY_TABLE))
                    .add(Item.fromBlock(CartographyTables.CHERRY_CARTOGRAPHY_TABLE))
                    .add(Item.fromBlock(CartographyTables.CRIMSON_CARTOGRAPHY_TABLE))
                    .add(Item.fromBlock(CartographyTables.JUNGLE_CARTOGRAPHY_TABLE))
                    .add(Item.fromBlock(CartographyTables.MANGROVE_CARTOGRAPHY_TABLE))
                    .add(Item.fromBlock(CartographyTables.OAK_CARTOGRAPHY_TABLE))
                    .add(Item.fromBlock(CartographyTables.SPRUCE_CARTOGRAPHY_TABLE))
                    .add(Item.fromBlock(CartographyTables.WARPED_CARTOGRAPHY_TABLE));

            getOrCreateTagBuilder(NON_FLAMMABLE_WOOD)
                    .add(Item.fromBlock(CartographyTables.CRIMSON_CARTOGRAPHY_TABLE))
                    .add(Item.fromBlock(CartographyTables.WARPED_CARTOGRAPHY_TABLE));

            getOrCreateTagBuilder(JOB_SITE)
                    .addTag(CARTOGRAPHYTABLES);
        }
    }