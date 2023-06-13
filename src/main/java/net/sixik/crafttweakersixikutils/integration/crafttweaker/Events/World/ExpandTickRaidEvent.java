package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.World;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.raid.Raid;
import net.minecraft.world.level.Level;
import net.sixik.crafttweakersixikutils.source.events.RaidEvent;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Map;

@ZenRegister
@NativeTypeRegistration(value = RaidEvent.TickRaidEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.world.TickRaidEvent")
public class ExpandTickRaidEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("raid")
    public static Raid getRaid(RaidEvent.TickRaidEvent event){
        return event.getRaid();
    }

    @ZenCodeType.Method
    public static boolean isCancelable(RaidEvent.TickRaidEvent event){
        return event.isCancelable();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("world")
    public static Level getWorld(RaidEvent.TickRaidEvent event){
        return event.getWorld();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("raidMap")
    public static Map<Integer, Raid> getRaidMap(RaidEvent.TickRaidEvent event) {
        return event.getRaidMap();
    }
}
