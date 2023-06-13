package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;

import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import jdk.jfr.Registered;
import net.minecraft.world.level.storage.ServerLevelData;
import org.openzen.zencode.java.ZenCodeType;

import java.util.UUID;

@Registered
@NativeTypeRegistration(value = ServerLevelData.class, zenCodeName = "mods.crafttweakerutils.api.misc.world.ServerLevelData")
public class ExpandServerLevelData {

    @ZenCodeType.Method
    public static boolean getAllowCommands(ServerLevelData data){
        return data.getAllowCommands();
    }
    @ZenCodeType.Method
    public static String getLevelName(ServerLevelData data){
        return data.getLevelName();
    }
    @ZenCodeType.Method
    public static boolean isInitialized(ServerLevelData data){
        return data.isInitialized();
    }
    @ZenCodeType.Method
    public static int getClearWeatherTime(ServerLevelData data){
        return data.getClearWeatherTime();
    }
    @ZenCodeType.Method
    public static int getThunderTime(ServerLevelData data){
        return data.getThunderTime();
    }
    @ZenCodeType.Method
    public static UUID getWanderingTraderId(ServerLevelData data){
        return data.getWanderingTraderId();
    }
    @ZenCodeType.Method
    public static int getWanderingTraderSpawnChance(ServerLevelData data){
        return data.getWanderingTraderSpawnChance();
    }
    @ZenCodeType.Method
    public static int getWanderingTraderSpawnDelay(ServerLevelData data){
        return data.getWanderingTraderSpawnDelay();
    }
    @ZenCodeType.Method
    public static void setWanderingTraderSpawnDelay(ServerLevelData data, int delay){
        data.setWanderingTraderSpawnDelay(delay);
    }
    @ZenCodeType.Method
    public static void setWanderingTraderSpawnChance(ServerLevelData data,int chance){
        data.setWanderingTraderSpawnChance(chance);
    }
    @ZenCodeType.Method
    public static void setWanderingTraderSpawnChance(ServerLevelData data,String UUID){
        data.setWanderingTraderId(java.util.UUID.fromString(UUID));
    }
}
