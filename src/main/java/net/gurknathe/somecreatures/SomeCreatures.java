package net.gurknathe.somecreatures;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.gurknathe.somecreatures.entity.ModEntities;
import net.gurknathe.somecreatures.entity.custom.PorcupineEntity;
import net.gurknathe.somecreatures.item.ModItemGroups;
import net.gurknathe.somecreatures.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SomeCreatures implements ModInitializer {
	public static final String MOD_ID = "somecreatures";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		FabricDefaultAttributeRegistry.register(ModEntities.PORCUPINE, PorcupineEntity.createAttributes());

		LOGGER.info("Hello Fabric world!");
	}
}