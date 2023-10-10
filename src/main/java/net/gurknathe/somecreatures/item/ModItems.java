package net.gurknathe.somecreatures.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.gurknathe.somecreatures.SomeCreatures;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.gurknathe.somecreatures.entity.ModEntities;

public class ModItems {
    public static final Item PORCUPINE_SPAWN_EGG = registerItem("porcupine_spawn_egg",
            new SpawnEggItem(ModEntities.PORCUPINE, 0xa86518, 0x3b260f, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SomeCreatures.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SomeCreatures.LOGGER.info("Registering Mod Items for " + SomeCreatures.MOD_ID);
    }
}
