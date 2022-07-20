package net.gdogjam.tutorialmod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.impl.object.builder.FabricEntityType;
import net.gdogjam.tutorialmod.TutorialMod;
import net.gdogjam.tutorialmod.entity.custom.VillagerGuard;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {

    public static final EntityType<VillagerGuard> VILLAGERGUARD = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(TutorialMod.MOD_ID, "villagerguard"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, VillagerGuard::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 2.3f)).build());
}
