package net.bomb.additions.item;

import net.bomb.additions.BombsAdditions;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item AMETHYST_SEED = registerItem("amethyst_seed", new Item(new FabricItemSettings()));
    public static final Item AMETHYST_DUST = registerItem("amethyst_dust", new Item(new FabricItemSettings()));
    public static final Item GROWING_AMETHYST = registerItem("growing_amethyst", new Item(new FabricItemSettings()));


    //Method that register items to the game with the mod name
    private static Item registerItem(String name, Item item) {
        return Registry .register(Registries.ITEM, new Identifier(BombsAdditions.MOD_ID, name), item);
    }

    //Registers a method that holds info to use as status and logging for
    public static void registerModItems() {
        BombsAdditions.LOGGER.info("Registering mod items for "+ BombsAdditions.MOD_ID);
    }
}
