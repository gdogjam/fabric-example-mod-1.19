package net.gdogjam.tutorialmod.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class VillagerGuard extends IronGolemEntity implements IAnimatable {

    private AnimationFactory factory = new AnimationFactory(this);

    public VillagerGuard(EntityType<? extends IronGolemEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder setAttributes() {
        return IronGolemEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 30.00)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 10.0f)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, 2.0f)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.4f);
    }


    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (event .isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.villager_guard.walk", true));
            return PlayState.CONTINUE;
        }

        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.villager_guard.idle", true));
        return PlayState.CONTINUE;
    }
    @Override
    public void registerControllers(AnimationData animationData) {


    }



    @Override
    public AnimationFactory getFactory() {
        return factory;
    }
    //can put custom sounds here its 4 methods
}
