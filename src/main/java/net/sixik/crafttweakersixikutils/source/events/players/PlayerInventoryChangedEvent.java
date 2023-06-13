package net.sixik.crafttweakersixikutils.source.events.players;

import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class PlayerInventoryChangedEvent extends PlayerEvent {

    private Container container;
    private Inventory inventory;
    private int index;
    private ItemStack item;
    public PlayerInventoryChangedEvent(Player player, Container container, int index, ItemStack item) {
        super(player);
        this.container = container;
        this.index = index;
        this.item = item;
        this.inventory = player.getInventory();
    }

    @Override
    public Player getEntity() {
        return super.getEntity();
    }

    public ItemStack getItem() {
        return item;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public Container getContainer() {
        return container;
    }

    public int getIndex() {
        return index;
    }
}
