package net.sixik.crafttweakersixikutils.mixin;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.npc.VillagerData;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.sixik.crafttweakersixikutils.source.events.VillagerTradingEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import javax.annotation.Nullable;

@Mixin(Villager.class)
public abstract class VillagerMixin {

    @Shadow
    public abstract VillagerData getVillagerData();

    @Shadow @Nullable
    private Player lastTradedPlayer;

    @Inject(method = "Lnet/minecraft/world/entity/npc/Villager;mobInteract(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;)Lnet/minecraft/world/InteractionResult;",
            at = @At(value = "INVOKE",
                    target = "Lnet/minecraft/world/entity/npc/Villager;startTrading(Lnet/minecraft/world/entity/player/Player;)V"),
            locals = LocalCapture.CAPTURE_FAILHARD)
    public void ctus$$onTrading(Player player, InteractionHand p_35473_, CallbackInfoReturnable<InteractionResult> cir, ItemStack itemstack, boolean flag){
        MinecraftForge.EVENT_BUS.post(new VillagerTradingEvent(player, itemstack, getVillagerData(), lastTradedPlayer));
    }

}
