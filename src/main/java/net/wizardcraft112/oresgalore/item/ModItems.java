package net.wizardcraft112.oresgalore.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.wizardcraft112.oresgalore.OresGalore;


public class ModItems {
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(OresGalore.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OresGalore.LOGGER.info("Registering Mod Items for " + OresGalore.MOD_ID);
    }

}
