package net.gurknathe.somecreatures.entity.client;

import net.gurknathe.somecreatures.SomeCreatures;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer PORCUPINE =
            new EntityModelLayer(new Identifier(SomeCreatures.MOD_ID, "porcupine"), "main");
}
