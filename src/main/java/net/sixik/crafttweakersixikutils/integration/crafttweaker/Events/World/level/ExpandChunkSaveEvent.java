package net.sixik.crafttweakersixikutils.integration.crafttweaker.Events.World.level;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraftforge.event.level.LevelEvent;

@ZenRegister
@NativeTypeRegistration(value = LevelEvent.Save.class, zenCodeName = "mods.crafttweakerutils.api.events.world.level.ChunkSaveEvent")
public class ExpandChunkSaveEvent {
}
