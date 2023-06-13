package net.sixik.crafttweakersixikutils.mixin;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraftforge.common.MinecraftForge;
import net.sixik.crafttweakersixikutils.source.events.players.PlayerChestCloseEvent;
import net.sixik.crafttweakersixikutils.source.events.players.PlayerChestOpenEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ChestBlockEntity.class)
public class ChestBlockEntityMixin {

    @Inject(method = "Lnet/minecraft/world/level/block/entity/ChestBlockEntity;startOpen(Lnet/minecraft/world/entity/player/Player;)V",
            at = @At("HEAD"))
    public void onOpen(Player p_59120_, CallbackInfo ci){
        MinecraftForge.EVENT_BUS.post(new PlayerChestOpenEvent(p_59120_, (BlockEntity) (Object)this));
    }
    @Inject(method = "Lnet/minecraft/world/level/block/entity/ChestBlockEntity;stopOpen(Lnet/minecraft/world/entity/player/Player;)V",
            at = @At("HEAD"))
    public void onClose(Player p_59120_, CallbackInfo ci){
        MinecraftForge.EVENT_BUS.post(new PlayerChestCloseEvent(p_59120_, (BlockEntity) (Object)this));
    }
}
