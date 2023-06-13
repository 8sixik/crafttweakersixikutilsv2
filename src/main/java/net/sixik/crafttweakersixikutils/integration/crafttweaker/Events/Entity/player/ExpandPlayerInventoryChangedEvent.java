package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.Entity.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.api.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.sixik.crafttweakersixikutils.source.events.players.PlayerInventoryChangedEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = PlayerInventoryChangedEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.entity.player.PlayerInventoryChangedEvent")
public class ExpandPlayerInventoryChangedEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("player")
    public static Player getPlayer(PlayerInventoryChangedEvent event) {
        return event.getEntity();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("item")
    public static IItemStack getItem(PlayerInventoryChangedEvent event) {
        return new MCItemStack(event.getItem());
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("inventory")
    public static Inventory getInventory(PlayerInventoryChangedEvent event) {
        return event.getInventory();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("container")
    public static Container getContainer(PlayerInventoryChangedEvent event) {
        return event.getContainer();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("index")
    public static int getIndex(PlayerInventoryChangedEvent event) {
        return event.getIndex();
    }
}
