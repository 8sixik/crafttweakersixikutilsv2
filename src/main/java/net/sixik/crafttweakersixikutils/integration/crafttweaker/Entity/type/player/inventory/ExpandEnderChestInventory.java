package net.sixik.crafttweakersixikutils.integration.crafttweaker.Entity.type.player.inventory;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.api.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.PlayerEnderChestContainer;
import org.openzen.zencode.java.ZenCodeType;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

@ZenRegister
@NativeTypeRegistration(value = PlayerEnderChestContainer.class, zenCodeName = "mods.crafttweakerutils.entity.player.inventory.EnderChestInventory")
public class ExpandEnderChestInventory {



    @ZenCodeType.Method
    public static IItemStack getItem(PlayerEnderChestContainer inventory,int index){
        return new MCItemStack(inventory.getItem(index));
    }

    @ZenCodeType.Method
    public static List<IItemStack> getItems(PlayerEnderChestContainer inventory){
        List<IItemStack> item = new ArrayList<>();
        for(int i = 0; i < inventory.getContainerSize(); i++){
            item.add(new MCItemStack(inventory.getItem(i)));
        }
        return item;
    }
    @ZenCodeType.Method
    public static int getContainerSize(PlayerEnderChestContainer inventory){
        return inventory.getContainerSize();
    }
    @ZenCodeType.Method
    public static int getMaxStackSize(PlayerEnderChestContainer inventory){
        return inventory.getMaxStackSize();
    }
    @ZenCodeType.Method
    public static void setItem(PlayerEnderChestContainer inventory,int index, IItemStack item){
        inventory.setItem(index, item.getInternal());
    }
    @ZenCodeType.Method
    public static void addItem(PlayerEnderChestContainer inventory,IItemStack item){
        inventory.addItem(item.getInternal());
    }
}