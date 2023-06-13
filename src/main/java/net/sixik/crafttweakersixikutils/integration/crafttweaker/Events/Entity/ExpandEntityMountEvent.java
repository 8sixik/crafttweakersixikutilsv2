package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.Entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.EntityMountEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = EntityMountEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.EntityMountEvent")
public class ExpandEntityMountEvent {
    @ZenCodeType.Method
    public static Entity getEntity(EntityMountEvent event){
        return event.getEntity();
    }
    @ZenCodeType.Method
    public static Entity getEntityMounting(EntityMountEvent event){
        return event.getEntityMounting();
    }
    @ZenCodeType.Method
    public static Entity getEntityBeingMounted(EntityMountEvent event){
        return event.getEntityBeingMounted();
    }
    @ZenCodeType.Method
    public static Level getWorld(EntityMountEvent event){
        return event.getLevel();
    }
}
