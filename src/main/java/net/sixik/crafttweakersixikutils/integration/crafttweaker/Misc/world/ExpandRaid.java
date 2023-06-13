package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.raid.Raid;
import net.minecraft.world.level.Level;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = Raid.class, zenCodeName = "mods.crafttweakerutils.api.misc.world.Raid")
public class ExpandRaid {

    @ZenCodeType.Method
    public static int getBadOmenLevel(Raid pRaid){
        return pRaid.getBadOmenLevel();
    }
    @ZenCodeType.Method
    public static int getMaxBadOmenLevel(Raid pRaid){
        return pRaid.getMaxBadOmenLevel();
    }
    @ZenCodeType.Method
    public static Level getWorld(Raid pRaid){
        return pRaid.getLevel();
    }
    @ZenCodeType.Method
    public static BlockPos getCenter(Raid pRaid){
        return pRaid.getCenter();
    }
    @ZenCodeType.Method
    public static float getEnchantOdds(Raid pRaid){
        return pRaid.getEnchantOdds();
    }
    @ZenCodeType.Method
    public static float getGroupsSpawned(Raid pRaid){
        return pRaid.getGroupsSpawned();
    }
    @ZenCodeType.Method
    public static float getHealthOfLivingRaiders(Raid pRaid){
        return pRaid.getHealthOfLivingRaiders();
    }
    @ZenCodeType.Method
    public static int getTotalRaidersAlive(Raid pRaid){
        return pRaid.getTotalRaidersAlive();
    }
    @ZenCodeType.Method
    public static int getId(Raid pRaid){
        return pRaid.getId();
    }
    @ZenCodeType.Method
    public static boolean isActive(Raid pRaid){
        return pRaid.isActive();
    }
    @ZenCodeType.Method
    public static boolean isLoss(Raid pRaid){
        return pRaid.isLoss();
    }
    @ZenCodeType.Method
    public static boolean isBetweenWaves(Raid pRaid){
        return pRaid.isBetweenWaves();
    }
    @ZenCodeType.Method
    public static boolean isOver(Raid pRaid){
        return pRaid.isOver();
    }
    @ZenCodeType.Method
    public static boolean isStarted(Raid pRaid){
        return pRaid.isStarted();
    }
    @ZenCodeType.Method
    public static boolean isStopped(Raid pRaid){
        return pRaid.isStopped();
    }
    @ZenCodeType.Method
    public static boolean isVictory(Raid pRaid){
        return pRaid.isVictory();
    }
    @ZenCodeType.Method
    public static void stop(Raid pRaid){
        pRaid.stop();
    }
}
