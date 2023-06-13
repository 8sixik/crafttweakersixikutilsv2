package net.sixik.crafttweakersixikutils.source.events;

import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingEvent;

public class LivingEntityTickEvent extends LivingEvent {

    public LivingEntityTickEvent(LivingEntity entity) {
        super(entity);
    }

    @Override
    public LivingEntity getEntity() {
        return super.getEntity();
    }
}
