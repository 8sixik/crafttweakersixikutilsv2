package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.Entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.BabyEntitySpawnEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = BabyEntitySpawnEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.BabyEntitySpawnEvent")
public class ExpandBabyEntitySpawnEvent {

    @ZenCodeType.Method
    public static Entity getChildEntity(BabyEntitySpawnEvent event){
       return event.getChild();
    }
    @ZenCodeType.Method
    public static int getChildEntityAge(BabyEntitySpawnEvent event){
       return event.getChild().getAge();
    }
    @ZenCodeType.Method
    public static void setChildEntityBaby(BabyEntitySpawnEvent event, boolean bool){
        event.getChild().setBaby(bool);
    }
    @ZenCodeType.Method
    public static Entity getParentA(BabyEntitySpawnEvent event){
       return event.getParentA();
    }
    @ZenCodeType.Method
    public static Entity getParentB(BabyEntitySpawnEvent event){
       return event.getParentB();
    }
    @ZenCodeType.Method
    public static Player getCausedByPlayer(BabyEntitySpawnEvent event){
       return event.getCausedByPlayer();
    }
}
