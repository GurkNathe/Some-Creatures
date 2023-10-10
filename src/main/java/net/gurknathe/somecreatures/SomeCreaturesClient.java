package net.gurknathe.somecreatures;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.gurknathe.somecreatures.entity.ModEntities;
import net.gurknathe.somecreatures.entity.client.ModModelLayers;
import net.gurknathe.somecreatures.entity.client.PorcupineModel;
import net.gurknathe.somecreatures.entity.client.PorcupineRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;

public class SomeCreaturesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        addEntity(ModEntities.PORCUPINE, PorcupineRenderer::new, ModModelLayers.PORCUPINE, PorcupineModel::getTexturedModelData);
    }

    public void addEntity(
            EntityType<? extends Entity> entityType,
            EntityRendererFactory entityRendererFactory,
            EntityModelLayer modelLayer,
            EntityModelLayerRegistry.TexturedModelDataProvider texturedModelDataProvider
    ) {
        EntityRendererRegistry.register(entityType, entityRendererFactory);
        EntityModelLayerRegistry.registerModelLayer(modelLayer, texturedModelDataProvider);
    }
}
