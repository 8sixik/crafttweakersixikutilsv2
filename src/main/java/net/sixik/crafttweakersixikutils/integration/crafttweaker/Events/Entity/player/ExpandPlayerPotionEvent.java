package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.Entity.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.api.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.sixik.crafttweakersixikutils.source.events.players.PlayerPotionEvent;
import org.openzen.zencode.java.ZenCodeType;


@ZenRegister
@NativeTypeRegistration(value = PlayerPotionEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.player.PlayerPotionEvent")
public class ExpandPlayerPotionEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("player")
    public static Player getPlayer(PlayerPotionEvent event){
        return event.getEntity();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("level")
    public static Level getLevel(PlayerPotionEvent event){
        return event.getEntity().getLevel();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("item")
    public static IItemStack getStack(PlayerPotionEvent event){
        return new MCItemStack(event.getStack());
    }
}
