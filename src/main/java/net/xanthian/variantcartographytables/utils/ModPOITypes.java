package net.xanthian.variantcartographytables.utils;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.poi.PointOfInterestType;
import net.minecraft.world.poi.PointOfInterestTypes;

import net.xanthian.variantcartographytables.block.CartographyTables;
import net.xanthian.variantcartographytables.mixin.PointOfInterestTypesAccessor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ModPOITypes {
    public static void init() {

        Map<BlockState, RegistryEntry<PointOfInterestType>> poiStatesToType = PointOfInterestTypesAccessor
                .getPointOfInterestStatesToType();

        RegistryEntry<PointOfInterestType> cartographerEntry = Registries.POINT_OF_INTEREST_TYPE
                .getEntry(PointOfInterestTypes.CARTOGRAPHER).get();

        PointOfInterestType cartographerPoiType = Registries.POINT_OF_INTEREST_TYPE.get(PointOfInterestTypes.CARTOGRAPHER);

        // NOTE: PointOfInterestType.blockStates is accessible by access widener
        List<BlockState> cartographerBlockStates = new ArrayList<BlockState>(cartographerPoiType.blockStates);

        for (Block block : CartographyTables.MOD_CARTOGRAPHY_TABLES.values()) {
            ImmutableList<BlockState> blockStates = block.getStateManager().getStates();

            for (BlockState blockState : blockStates) {
                poiStatesToType.putIfAbsent(blockState, cartographerEntry);
            }

            cartographerBlockStates.addAll(blockStates);
        }

        // NOTE: PointOfInterestType.blockStates is mutable by access widener
        cartographerPoiType.blockStates = ImmutableSet.copyOf(cartographerBlockStates);
    }
}