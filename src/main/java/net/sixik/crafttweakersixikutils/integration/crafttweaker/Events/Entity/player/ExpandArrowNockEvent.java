package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.Entity.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.api.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = ArrowNockEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.player.ArrowNockEvent")
public class ExpandArrowNockEvent {
    @ZenCodeType.Method
    public static Player getPlayer(ArrowNockEvent event){
        return event.getEntity();
    }
    @ZenCodeType.Method
    public static Level getWorld(ArrowNockEvent event){
        return event.getLevel();
    }
    @ZenCodeType.Method
    public static IItemStack getBow(ArrowNockEvent event){
        return new MCItemStack(event.getBow());
    }
    @ZenCodeType.Method
    public static InteractionHand getHand(ArrowNockEvent event){
        return event.getHand();
    }
}
