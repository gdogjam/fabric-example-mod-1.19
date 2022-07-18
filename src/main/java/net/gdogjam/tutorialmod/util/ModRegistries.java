package net.gdogjam.tutorialmod.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.gdogjam.tutorialmod.entity.ModEntities;
import net.gdogjam.tutorialmod.entity.custom.VillagerGuard;

public class ModRegistries {

    public static void registerAttributes(){
        FabricDefaultAttributeRegistry.register(ModEntities.VILLAGERGUARD, VillagerGuard.setAttributes());
    }
}
