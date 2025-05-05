package net.bomb.additions.item;

import net.bomb.additions.BombsAdditions;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BOMBS_ADDITIONS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BombsAdditions.MOD_ID, "bombs_additions"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.bombs_additions"))
                    .icon(() -> new ItemStack(ModItems.AMETHYST_SEED)).entries((displayContext, entries) -> {
                        entries.add(ModItems.AMETHYST_SEED);
                        entries.add(ModItems.AMETHYST_DUST);
                    }).build());


    public static void registerItemGroups() {
        BombsAdditions.LOGGER.info("Registering item groups for " +BombsAdditions.MOD_ID);
    }
}
