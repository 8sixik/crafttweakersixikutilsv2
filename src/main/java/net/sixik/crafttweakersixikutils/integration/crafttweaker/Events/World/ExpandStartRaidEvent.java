package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.World;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.raid.Raid;
import net.minecraft.world.level.Level;
import net.sixik.crafttweakersixikutils.source.events.RaidEvent;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Map;

@ZenRegister
@NativeTypeRegistration(value = RaidEvent.StartRaidEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.world.MCStartRaidEvent")
public class ExpandStartRaidEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("raid")
    public static Raid getRaid(RaidEvent.StartRaidEvent event){
        return event.getRaid();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("pos")
    public static BlockPos getBlockpos(RaidEvent.StartRaidEvent event){
        return event.getBlockpos();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("player")
    public static Player getPlayer(RaidEvent.StartRaidEvent event){
        return event.getPlayer();
    }

    @ZenCodeType.Method
    public static boolean isCancelable(RaidEvent.StartRaidEvent event){
        return event.isCancelable();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("world")
    public static Level getWorld(RaidEvent.StartRaidEvent event){
        return event.getWorld();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("raidMap")
    public static Map<Integer, Raid> getRaidMap(RaidEvent.StartRaidEvent event) {
        return event.getRaidMap();
    }
}
