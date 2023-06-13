package net.sixik.crafttweakersixikutils.source.events;

import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingEvent;

public class LivingEntityXpDropEvent extends LivingEvent {
    int reward;
    public LivingEntityXpDropEvent(LivingEntity entity, int reward) {
        super(entity);
        this.reward = reward;
    }

    @Override
    public LivingEntity getEntity() {
        return super.getEntity();
    }

    public int getReward() {
        return reward;
    }
}
