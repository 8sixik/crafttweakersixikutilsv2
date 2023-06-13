package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.World.level;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.level.LevelEvent;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = LevelEvent.class, zenCodeName = "mods.crafttweakerutils.api.events.world.level.LevelEvent")
public class ExpandLevelEvent {

    @ZenCodeType.Method
    @ZenCodeType.Getter("level")
    public Level getLevel(LevelEvent event){
        if(event.getLevel() instanceof Level level) {
            return level;
        }
        throw new IllegalArgumentException("LevelAccessor instance was not an instance of Level!");
    }
}
