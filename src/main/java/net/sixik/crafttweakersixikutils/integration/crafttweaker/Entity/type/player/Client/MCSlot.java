package net.sixik.crafttweakersixikutils.integration.crafttweaker.Entity.type.player.Client;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker.api.item.MCItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.Container;
import net.minecraft.world.inventory.Slot;
import org.apache.commons.lang3.ObjectUtils;
import org.openzen.zencode.java.ZenCodeType;

import javax.annotation.Nullable;

@ZenRegister
@ZenCodeType.Name("mods.crafttweakerutils.api.client.Slot")
public class MCSlot {

    public Slot slot;
    public static String image;
    public MCSlot(Slot slot){
        this.slot = slot;
    }

    @Nullable
    public static MCSlot setSlot(Slot slot){
        if(slot == null) return null;

        return new MCSlot(slot);
    }

    @ZenCodeType.Method
    @ZenCodeType.Nullable
    @ZenCodeType.Getter("item")
    public IItemStack getItem(){
        try {
            return new MCItemStack(slot.getItem());
        } catch (NullPointerException ex){
            return null;
        }
    }

//    @ZenCodeType.Method
//    @ZenCodeType.Setter("item")
//    public void setItem(IItemStack itemStack){
//        slot.set(itemStack.getInternal());
//    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("x")
    public int getX(){
        if(slot == null) return -1;
        return slot.x;
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("y")
    public int getY(){
        if(slot == null) return -1;
        return slot.y;
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("index")
    public int getIndex(){
        if(slot == null) return -1;
        return slot.index;
    }
//    @ZenCodeType.Getter("container")
//    @ZenCodeType.Method
//    public Container getContainer(){
//        if(slot.container == null) return null;
//        return slot.container;
//    }
    @ZenCodeType.Method
    public int getMaxStackSize(){
        if(slot == null) return -1;
        return slot.getMaxStackSize();
    }
    @ZenCodeType.Method
    public int getMaxStackSize(IItemStack itemStack){
        if(slot == null) return -1;
        return slot.getMaxStackSize(itemStack.getInternal());
    }
    @ZenCodeType.Method
    public int getContainerSlot(){
        if(slot == null) return -1;
        return slot.getContainerSlot();
    }
    @ZenCodeType.Method
    public boolean isActive(){
        if(slot == null) return false;
        return slot.isActive();
    }
    @ZenCodeType.Method
    public boolean isActive(Slot slot2){
        if(slot == null) return false;
        return slot.isSameInventory(slot);
    }
    @ZenCodeType.Method
    public boolean hasItem(){
        if(slot == null) return false;
        return slot.hasItem();
    }
    @ZenCodeType.Method
    public void setBackground(ResourceLocation res, ResourceLocation res2){
        slot.setBackground(res, res2);
    }
}
