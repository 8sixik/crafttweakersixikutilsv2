package net.sixik.crafttweakersixikutils.mixin;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraftforge.common.MinecraftForge;
import net.sixik.crafttweakersixikutils.source.events.LivingEntityTickEvent;
import net.sixik.crafttweakersixikutils.source.events.LivingEntityXpDropEvent;
import net.sixik.crafttweakersixikutils.source.events.LivingItemPickUpEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(LivingEntity.class)
public class EntityLivingMixin {

    @Inject(at = @At("TAIL"),
            method = "Lnet/minecraft/world/entity/LivingEntity;onItemPickup(Lnet/minecraft/world/entity/item/ItemEntity;)V")
    public void ctus$$onItemPickUp(ItemEntity p_21054_, CallbackInfo ci){
        MinecraftForge.EVENT_BUS.post(new LivingItemPickUpEvent((LivingEntity) (Object)this, p_21054_));
    }

    @Inject(at = @At("HEAD"), method = "Lnet/minecraft/world/entity/LivingEntity;tick()V")
    public void onEntityTick(CallbackInfo ci){
        MinecraftForge.EVENT_BUS.post(new LivingEntityTickEvent((LivingEntity) (Object)this));
    }

    @Inject(method = "Lnet/minecraft/world/entity/LivingEntity;dropExperience()V",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/entity/ExperienceOrb;award(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;I)V"),
            locals = LocalCapture.CAPTURE_FAILHARD)
    public void onEntityXpDrop(CallbackInfo ci, int reward){
        try {
            MinecraftForge.EVENT_BUS.post(new LivingEntityXpDropEvent((LivingEntity) (Object)this, reward));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
