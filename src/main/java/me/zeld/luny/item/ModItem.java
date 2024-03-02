package me.zeld.luny.item;

import me.zeld.luny.Luny;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;


public class ModItem {
    public static final Item SPEAR = registerItem("spear", new Item(new FabricItemSettings()));

    private static void addItemToIngredientGroup(FabricItemGroupEntries entries) {
       entries.add(SPEAR);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Luny.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Luny.LOGGER.info("Registering Mod Items for " + Luny.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItem::addItemToIngredientGroup);
    }
}
