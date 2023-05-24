package net.xanthian.variantcartographytables;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

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

import java.util.Comparator;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "variantcartographytables";

    public static final RegistryKey<ItemGroup> ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "variantcartographytables"));

    @Override
    public void onInitialize() {
        // Custom Item Group
        Registry.register(Registries.ITEM_GROUP, ITEM_GROUP, FabricItemGroup.builder()
                .displayName(Text.literal("Variant Cartography Tables"))
                .icon(() -> new ItemStack(CartographyTables.MANGROVE_CARTOGRAPHY_TABLE))
                .entries((context, entries) -> {
                    entries.addAll(Registries.ITEM.getIds().stream()
                            .filter(identifier -> identifier.getNamespace().matches(MOD_ID))
                            .sorted(Comparator.comparing(Identifier::getPath))
                            .map(Registries.ITEM::get)
                            .map(ItemStack::new)
                            .filter(input -> !input.isEmpty())
                            .toList());
                })
                .build());

        // Cartography Table Registration
        CartographyTables.registerVanillaTables();

        // Cartographer POI Registration
        ModPOITypes.init();
    }
}