package net.sixik.crafttweakersixikutils.source.events;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent;

public class LivingEnityKillByPlayerEvent extends LivingEvent {

    private Player player;
    private ItemStack item;
    public LivingEnityKillByPlayerEvent(LivingEntity entity, Player player, ItemStack item) {
        super(entity);
        this.player = player;
        this.item = item;
    }

    public Player getPlayer() {
        return player;
    }

    @Override
    public LivingEntity getEntity() {
        return super.getEntity();
    }

    public ItemStack getItem() {
        return item;
    }
}
