package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.stats.ServerStatsCounter;
import net.minecraft.stats.Stats;

@ZenRegister
@NativeTypeRegistration(value = ServerStatsCounter.class, zenCodeName = "mods.crafttweakerutils.api.misc.world.ServerStatsCounter")
public class ExpandServerStatsCounter {

}
