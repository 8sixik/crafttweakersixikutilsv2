package net.sixik.crafttweakersixikutils.source.events.players;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class PlayerPotionEvent extends PlayerEvent {
    private ItemStack stack;
    public PlayerPotionEvent(Player player, ItemStack stack) {
        super(player);
        this.stack = stack;
    }

    public ItemStack getStack() {
        return stack;
    }

    @Override
    public Player getEntity() {
        return super.getEntity();
    }
}

