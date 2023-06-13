package net.sixik.crafttweakersixikutils.mixin;

import com.mojang.authlib.GameProfile;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.ProfilePublicKey;
import net.minecraft.world.inventory.ContainerListener;
import net.minecraft.world.level.Level;
import net.sixik.crafttweakersixikutils.source.methods.InventoryListenerMethod;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin({ServerPlayer.class})
public class ServerPlayerMixin extends Player implements net.minecraft.world.ContainerListener {

    private InventoryListenerMethod inventoryListenerMethod;

    public ServerPlayerMixin(Level level, BlockPos pos, float f, GameProfile gameProfile, @Nullable ProfilePublicKey profilePublicKey) {
        super(level, pos, f, gameProfile, profilePublicKey);
    }

    public InventoryListenerMethod getInventoryListenerMethod(){
        if(this.inventoryListenerMethod == null){
            this.inventoryListenerMethod = new InventoryListenerMethod((ServerPlayer) (Object)this);
        }
        return this.inventoryListenerMethod;
    }

    @Override
    public boolean isSpectator() {
        return false;
    }

    @Override
    public boolean isCreative() {
        return false;
    }

    @Override
    public void containerChanged(Container p_18983_) {
        getInventoryListenerMethod();
    }
}
