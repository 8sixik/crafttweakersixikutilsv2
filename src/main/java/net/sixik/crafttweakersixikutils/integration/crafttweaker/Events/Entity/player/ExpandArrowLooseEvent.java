package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.Entity.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.api.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = ArrowLooseEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.player.ArrowLooseEvent")
public class ExpandArrowLooseEvent {

    @ZenCodeType.Method
    public static Player getPlayer(ArrowLooseEvent event){
        return event.getEntity();
    }
    @ZenCodeType.Method
    public static Level getWorld(ArrowLooseEvent event){
        return event.getLevel();
    }
    @ZenCodeType.Method
    public static IItemStack getBow(ArrowLooseEvent event){
        return new MCItemStack(event.getBow());
    }
    @ZenCodeType.Method
    public static int getCharge(ArrowLooseEvent event){
       return event.getCharge();
    }
}
