package net.gurknathe.somecreatures;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.gurknathe.somecreatures.entity.ModEntities;
import net.gurknathe.somecreatures.entity.client.ModModelLayers;
import net.gurknathe.somecreatures.entity.client.PorcupineModel;
import net.gurknathe.somecreatures.entity.client.PorcupineRenderer;

public class SomeCreaturesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.PORCUPINE, PorcupineRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.PORCUPINE, PorcupineModel::getTexturedModelData);
    }
}
