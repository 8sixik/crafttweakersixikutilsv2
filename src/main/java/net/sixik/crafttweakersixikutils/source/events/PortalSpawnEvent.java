package net.sixik.crafttweakersixikutils.source.events;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.portal.PortalShape;
import net.minecraftforge.event.level.BlockEvent;

public class PortalSpawnEvent extends BlockEvent {
    PortalShape portalShape;
    public PortalSpawnEvent(LevelAccessor level, BlockPos pos, BlockState state, PortalShape portalSize) {
        super(level, pos, state);
        this.portalShape = portalSize;
    }

    public PortalShape getPortalShape() {
        return portalShape;
    }

    @Override
    public BlockPos getPos() {
        return super.getPos();
    }

    @Override
    public BlockState getState() {
        return super.getState();
    }

    @Override
    public LevelAccessor getLevel() {
        return super.getLevel();
    }

    @Override
    public void setCanceled(boolean cancel) {
        super.setCanceled(cancel);
    }

    @Override
    public boolean isCancelable() {
        return super.isCancelable();
    }

    @Override
    public boolean isCanceled() {
        return super.isCanceled();
    }
}
