package net.sixik.crafttweakersixikutils.source.events;

import net.minecraft.world.entity.npc.VillagerData;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class VillagerTradingEvent extends Event {

    Player player;
    ItemStack itemStack;
    VillagerData villagerData;
    @Nullable
    Player lastPlayer;
    public VillagerTradingEvent(Player player, ItemStack itemStack, VillagerData villagerData, @Nullable Player lastPlayer){
        this.itemStack = itemStack;
        this.player = player;
        this.villagerData = villagerData;
        this.lastPlayer = lastPlayer;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public Player getPlayer() {
        return player;
    }

    @Override
    public boolean isCancelable() {
        return false;
    }

    @Nullable
    public Player getLastPlayer() {
        return lastPlayer;
    }

    public VillagerType getType() {
        return villagerData.getType();
    }

    public VillagerProfession getProfession() {
        return villagerData.getProfession();
    }
}
