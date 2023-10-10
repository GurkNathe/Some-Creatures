package net.gurknathe.somecreatures.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.gurknathe.somecreatures.SomeCreatures;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup SOME_CREATURES = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SomeCreatures.MOD_ID, "somecreatures"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.somecreatures"))
                    .icon(() -> new ItemStack(ModItems.PORCUPINE_SPAWN_EGG)).entries((displayContext, entries) -> {
                        entries.add(ModItems.PORCUPINE_SPAWN_EGG);
                    }).build());
    public static void registerItemGroups() {
        SomeCreatures.LOGGER.info("Registering Item Groups for " + SomeCreatures.MOD_ID);
    }
}
