package net.sixik.crafttweakersixikutils.mixin;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.raid.Raid;
import net.minecraft.world.entity.raid.Raids;
import net.minecraftforge.common.MinecraftForge;
import net.sixik.crafttweakersixikutils.source.events.RaidEvent;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.Iterator;
import java.util.Map;

@Mixin(Raids.class)
public class RaidMixin {

    @Shadow
    @Final
    private Map<Integer, Raid> raidMap;

    @Shadow @Final private ServerLevel level;

//    @Inject(method = "createOrExtendRaid(Lnet/minecraft/server/level/ServerPlayer;)Lnet/minecraft/world/entity/raid/Raid;",
//            at = @At(value = "INVOKE",
//                    target = "Ljava/util/Map;put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"),
//            locals = LocalCapture.CAPTURE_FAILHARD)
//    public void ctus$$onStartRaid(ServerPlayer player, CallbackInfoReturnable<Raid> cir, DimensionType dimensiontype, BlockPos blockpos, List list, int i, Vec3 vec3, BlockPos blockpos1, Raid raid, boolean flag){
//        MinecraftForge.EVENT_BUS.post(new RaidEvent.StartRaidEvent(player, raid, dimensiontype, blockpos, level, raidMap));
//    }

//    @Inject(method = "createOrExtendRaid(Lnet/minecraft/server/level/ServerPlayer;)Lnet/minecraft/world/entity/raid/Raid;",
//    at = @At(value ="INVOKE", target = "Lnet/minecraft/world/entity/raid/Raid;isStarted()Z"), locals = LocalCapture.CAPTURE_FAILHARD)
//    public void ctus$$onStartRaid(ServerPlayer p_37964_, CallbackInfoReturnable<Raid> cir, DimensionType dimensiontype, BlockPos blockpos, List list, int i, Vec3 vec3, BlockPos blockpos1, Raid raid, boolean flag){
//        //MinecraftForge.EVENT_BUS.post(new RaidEvent.StartRaidEvent(player, raid, dimensiontype, blockpos, level, raidMap));
//    }

    @Inject(method = "Lnet/minecraft/world/entity/raid/Raids;tick()V",
            at = @At(value = "INVOKE",
                    target = "Lnet/minecraft/world/entity/raid/Raid;tick()V"),
            locals = LocalCapture.CAPTURE_FAILHARD)
    public void ctus$$onTickRaid(CallbackInfo ci, Iterator iterator, Raid raid) {
        MinecraftForge.EVENT_BUS.post(new RaidEvent.TickRaidEvent(raid, level, raidMap));

    }
    @Inject(method = "Lnet/minecraft/world/entity/raid/Raids;tick()V",
            at = @At(value = "INVOKE",
                    target = "Ljava/util/Iterator;remove()V"),
            locals = LocalCapture.CAPTURE_FAILHARD)
    public void ctus$$onStopRaid(CallbackInfo ci, Iterator iterator, Raid raid){
        MinecraftForge.EVENT_BUS.post(new RaidEvent.StopRaidEvent(raid, level, raidMap));
    }
}
