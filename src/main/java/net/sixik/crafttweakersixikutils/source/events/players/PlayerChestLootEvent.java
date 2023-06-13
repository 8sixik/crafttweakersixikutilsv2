package net.sixik.crafttweakersixikutils.source.events.players;

import net.minecraft.core.BlockPos;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraftforge.eventbus.api.Event;

public class PlayerChestLootEvent extends Event {
    public Player player;
    public LootContext ctx;
    public Container inventory;
    public BlockPos pos;

    public PlayerChestLootEvent(Player player, LootContext ctx, Container inventory, BlockPos pos) {
        this.player = player;
        this.ctx = ctx;
        this.inventory = inventory;
        this.pos = pos;
    }

    public Player getPlayer() {
        return player;
    }

    public BlockPos getPos() {
        return pos;
    }

    public Container getInventory() {
        return inventory;
    }
}
