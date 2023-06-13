package net.sixik.crafttweakersixikutils.source.events.players;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class PlayerChestOpenEvent extends PlayerEvent {

    BlockEntity block;
    public PlayerChestOpenEvent(Player player, BlockEntity block) {
        super(player);
        this.block = block;
    }

    public BlockEntity getBlock() {
        return block;
    }

    @Override
    public Player getEntity() {
        return super.getEntity();
    }

    public int getOpenCount(){
        if(block instanceof ChestBlockEntity chest){
            ChestBlockEntity.getOpenCount((BlockGetter) chest,chest.getBlockPos());
        }
        return -404;
    }
}
