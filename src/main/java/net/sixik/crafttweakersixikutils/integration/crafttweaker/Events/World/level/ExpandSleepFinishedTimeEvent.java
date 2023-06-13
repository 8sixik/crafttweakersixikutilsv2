package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.World.level;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraftforge.event.level.SleepFinishedTimeEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = SleepFinishedTimeEvent.class,zenCodeName = "mods.crafttweakerutils.api.events.world.level.SleepFinishedTimeEvent")
public class ExpandSleepFinishedTimeEvent {
    @ZenCodeType.Method
    public long getNewTime(SleepFinishedTimeEvent event){
        return event.getNewTime();
    }
    @ZenCodeType.Method
    public boolean setTimeAddition(SleepFinishedTimeEvent event, long l){
       return event.setTimeAddition(l);
    }
}
