package net.sixik.crafttweakersixikutils.integration.crafttweaker.Entity.type.player.inventory;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.api.item.MCItemStack;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.player.Inventory;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = Inventory.class, zenCodeName = "crafttweaker.api.entity.type.player.Inventory")
public class ExpandPlayerInventory {

    @ZenCodeType.Method
    public static int getItemSlot(Inventory inventory, IItemStack item){
        for(int i = 0; i < inventory.getContainerSize(); i++){
            if(inventory.getItem(i).equals(item.getInternal())){
                return i;
            }
        }
        return -1;
    }
    @ZenCodeType.Method
    public static IItemStack getArmor(Inventory inventory, int slot) {
        return new MCItemStack(inventory.armor.get(slot));
    }
    @ZenCodeType.Method
    public static boolean isArmor(Inventory inventory, int slot, IItemStack item){
        if(inventory.armor.get(slot) == item.getInternal()) return true;
        else return false;
    }
    @ZenCodeType.Method
    public static void setArrmor(Inventory inventory, int slot, IItemStack item){
        inventory.armor.set(slot, item.getInternal());
    }
    @ZenCodeType.Method
    public static int getSelectedIndex(Inventory inventory){
        return inventory.selected;
    }

}