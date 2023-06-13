package net.sixik.crafttweakersixikutils.source.events;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent;

public class LivingItemPickUpEvent extends LivingEvent {
    ItemStack itemStack;
    ItemEntity itemEntity;
    public LivingItemPickUpEvent(LivingEntity entity, ItemEntity itemStack) {
        super(entity);
        this.itemEntity = itemStack;
        this.itemStack = itemStack.getItem();
    }

    @Override
    public LivingEntity getEntity() {
        return super.getEntity();
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public ItemEntity getItemEntity() {
        return itemEntity;
    }
}
