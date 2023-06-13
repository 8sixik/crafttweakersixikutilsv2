package net.sixik.crafttweakersixikutils.mixin;

import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.sixik.crafttweakersixikutils.source.events.players.PlayerEatFoodEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.OptionalInt;

@Mixin(Player.class)
public class MixinEntityPlayer {


    @Inject(at = @At("HEAD"),
            method = "Lnet/minecraft/world/entity/player/Player;eat(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/item/ItemStack;")
    public void ctus$$FoodEating(Level level, ItemStack stack, CallbackInfoReturnable<ItemStack> cir){
        MinecraftForge.EVENT_BUS.post(new PlayerEatFoodEvent(((Player)(Object)this), stack));
    }


//    @Inject(at = @At("TAIL"),method = "Lnet/minecraft/world/entity/player/Player;travel(Lnet/minecraft/world/phys/Vec3;)V")
//    public void ctus$$onTavel(Vec3 p_36359_, CallbackInfo ci){
//        MinecraftForge.EVENT_BUS.post(new PlayerTravelEvent((Player) (Object)this, p_36359_));
//    }

//    @Inject(at = @At("HEAD"),
//            method = "Lnet/minecraft/world/entity/player/Player;openMenu(Lnet/minecraft/world/MenuProvider;)Ljava/util/OptionalInt;")
//    public void test(MenuProvider menuProvider, CallbackInfoReturnable<OptionalInt> cir){
//        Player player = (Player)(Object)this;
//        MinecraftForge.EVENT_BUS.post(new ExperementalEvent(player, menuProvider));
//    }
}
