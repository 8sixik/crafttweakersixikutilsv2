package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.Entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.LivingEntity;
import net.sixik.crafttweakersixikutils.source.events.LivingEntityTickEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = LivingEntityTickEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.MCLivingTickEvent")
public class ExpandLivingTickEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("entityLiving")
    public static LivingEntity getEntity(LivingEntityTickEvent event){
        return event.getEntity();
    }
}
