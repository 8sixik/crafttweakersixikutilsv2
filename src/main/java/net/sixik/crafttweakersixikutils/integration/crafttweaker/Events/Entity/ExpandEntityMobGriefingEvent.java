package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.Entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.event.entity.EntityMobGriefingEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = EntityMobGriefingEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.EntityMobGriefingEvent")
public class ExpandEntityMobGriefingEvent {

    @ZenCodeType.Method
    public static Entity getEntity(EntityMobGriefingEvent event){
        return event.getEntity();
    }
}
