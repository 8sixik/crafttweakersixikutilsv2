package net.sixik.crafttweakerutils.ct.events.server.entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.api.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.sixik.crafttweakersixikutils.source.events.LivingEnityKillByPlayerEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = LivingEnityKillByPlayerEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.LivingEntityKillByPlayerEvent")
public class ExpandLivingEnityKillByPlayerEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("entityLiving")
    public static LivingEntity getLivingEntity(LivingEnityKillByPlayerEvent event){
        return event.getEntity();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("player")
    public static Player getPlayer(LivingEnityKillByPlayerEvent event){
        return event.getPlayer();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("item")
    public static IItemStack getItem(LivingEnityKillByPlayerEvent event) {return new MCItemStack(event.getItem());}
}