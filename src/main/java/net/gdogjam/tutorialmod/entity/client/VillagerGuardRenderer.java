package net.gdogjam.tutorialmod.entity.client;

import net.gdogjam.tutorialmod.TutorialMod;
import net.gdogjam.tutorialmod.entity.custom.VillagerGuard;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class VillagerGuardRenderer extends GeoEntityRenderer<VillagerGuard> {


    public VillagerGuardRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new VillagerGuardModel());
    }

    @Override
    public Identifier getTextureResource(VillagerGuard instance) {
        return new Identifier(TutorialMod.MOD_ID, "textures/entity/villagerguard/villagerguard.png");
    }
}
