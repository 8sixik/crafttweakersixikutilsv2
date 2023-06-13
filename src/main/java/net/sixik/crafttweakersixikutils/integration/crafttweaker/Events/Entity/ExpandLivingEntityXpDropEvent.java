package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.Entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.sixik.crafttweakersixikutils.source.events.LivingEntityXpDropEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = LivingEntityXpDropEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.LivingEntityXpDropEvent")
public class ExpandLivingEntityXpDropEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("xp")
    public static int getXp(LivingEntityXpDropEvent event){
        return event.getReward();
    }
}
