package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.Entity.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.sixik.crafttweakersixikutils.source.events.players.PlayerChestCloseEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = PlayerChestCloseEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.player.PlayerChestCloseEvent")
public class ExpandPlayerChestCloseEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("player")
    public Player getPlayer(PlayerChestCloseEvent event){
        return event.getEntity();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("block")
    public BlockEntity getBlockEntity(PlayerChestCloseEvent event){
        return event.getBlock();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("openCount")
    public int getOpenCount(PlayerChestCloseEvent event){
        return event.getOpenCount();
    }
}
