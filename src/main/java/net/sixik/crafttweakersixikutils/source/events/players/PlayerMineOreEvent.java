package net.sixik.crafttweakersixikutils.source.events.players;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.level.BlockEvent;

public class PlayerMineOreEvent extends BlockEvent {

    private BlockState state;
    private BlockPos pos;
    private Player player;

    public PlayerMineOreEvent(LevelAccessor level, BlockPos pos, BlockState state, Player player) {
        super(level, pos, state);
        this.state = state;
        this.pos = pos;
        this.player = player;
    }


    @Override
    public BlockState getState() {
        return state;
    }

    public Player getPlayer() {
        return player;
    }

    @Override
    public BlockPos getPos() {
        return pos;
    }
}
