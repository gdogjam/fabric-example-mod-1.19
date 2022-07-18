package net.gdogjam.tutorialmod.entity.client;

import net.gdogjam.tutorialmod.TutorialMod;
import net.gdogjam.tutorialmod.entity.custom.VillagerGuard;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class VillagerGuardModel extends AnimatedGeoModel<VillagerGuard> {
    @Override
    public Identifier getModelResource(VillagerGuard object) {
        return new Identifier(TutorialMod.MOD_ID, "geo/villagerguard.geo.json");
    }

    @Override
    public Identifier getTextureResource(VillagerGuard object) {
        return new Identifier(TutorialMod.MOD_ID, "textures/entity/villagerguard/villagerguard.png");
    }

    @Override
    public Identifier getAnimationResource(VillagerGuard animatable) {
        return new Identifier(TutorialMod.MOD_ID, "animations/villagerguard.animation.json");
    }


}
