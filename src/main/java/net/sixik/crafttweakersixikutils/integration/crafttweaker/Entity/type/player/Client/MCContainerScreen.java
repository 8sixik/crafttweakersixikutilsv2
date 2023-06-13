package net.sixik.crafttweakersixikutils.integration.crafttweaker.Entity.type.player.Client;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.player.LocalPlayer;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@ZenCodeType.Name("mods.crafttweakerutils.api.client.ContainerScreen")
public class MCContainerScreen {

    private AbstractContainerScreen<?> abstractContainerScreen;

    public MCContainerScreen(AbstractContainerScreen<?> abstractContainerScreen) {
        this.abstractContainerScreen = abstractContainerScreen;
    }

//    @ZenCodeType.Method
//    public AbstractContainerScreen<?> getAbstractContainerScreen() {
//        return abstractContainerScreen;
//    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("player")
    public LocalPlayer getPlayer() {
        return abstractContainerScreen.getMinecraft().player;
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("left")
    public int getGuiLeft() {
        return abstractContainerScreen.getGuiLeft();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("top")
    public int getGuiTop() {
        return abstractContainerScreen.getGuiTop();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("xSize")
    public int getXSize() {
        return abstractContainerScreen.getXSize();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("ySize")
    public int getYSize() {
        return abstractContainerScreen.getYSize();
    }

    @ZenCodeType.Method
    @ZenCodeType.Nullable
    @ZenCodeType.Getter("slot")
    public MCSlot getSlotUnderMouse(){
        try {
            if(abstractContainerScreen.getSlotUnderMouse() == null) return null;
            return MCSlot.setSlot(abstractContainerScreen.getSlotUnderMouse());
        } catch (NullPointerException ex){
            return null;
        }
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("screen")
    public MCScreen getScreen(){
        return new MCScreen(abstractContainerScreen.getMinecraft().screen);
    }
}
