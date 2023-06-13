package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.World;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraftforge.event.DifficultyChangeEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = DifficultyChangeEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.world.DifficultyChangeEvent")
public class ExpandDifficultyChange {

    @ZenCodeType.Method
    @ZenCodeType.Getter("NewDifficultyKey")
    public static String getNewDifficultyKey(DifficultyChangeEvent event){
        return event.getDifficulty().getKey();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("NewDifficultyIndex")
    public static int getNewDifficultyIndex(DifficultyChangeEvent event){
        return event.getDifficulty().getId();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("OldDifficultyKey")
    public static int getOldDifficultyIndex(DifficultyChangeEvent event){
        return event.getOldDifficulty().getId();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("OldDifficultyIndex")
    public static String getOldDifficultyKey(DifficultyChangeEvent event){
        return event.getOldDifficulty().getKey();
    }
}
