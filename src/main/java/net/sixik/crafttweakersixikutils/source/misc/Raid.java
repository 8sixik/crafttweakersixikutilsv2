package net.sixik.crafttweakersixikutils.source.misc;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import org.openzen.zencode.java.ZenCodeType;

import javax.annotation.Nullable;

public class Raid {

    private final net.minecraft.world.entity.raid.Raid pRaid;

    public Raid (net.minecraft.world.entity.raid.Raid raid){
        this.pRaid = raid;
    }

    @Nullable
    public static Raid getRaid(net.minecraft.world.entity.raid.Raid raid){
        if(raid == null) return null;

        return new Raid(raid);
    }


    public int getBadOmenLevel(){
        return pRaid.getBadOmenLevel();
    }

    public int getMaxBadOmenLevel(){
        return pRaid.getMaxBadOmenLevel();
    }

    public Level getWorld(){
        return pRaid.getLevel();
    }

    public BlockPos getCenter(){
        return pRaid.getCenter();
    }

    public float getEnchantOdds(){
        return pRaid.getEnchantOdds();
    }

    public float getGroupsSpawned(){
        return pRaid.getGroupsSpawned();
    }

    public float getHealthOfLivingRaiders(){
        return pRaid.getHealthOfLivingRaiders();
    }

    public int getTotalRaidersAlive(){
        return pRaid.getTotalRaidersAlive();
    }

    public int getId(){
        return pRaid.getId();
    }

    public boolean isActive(){
        return pRaid.isActive();
    }

    public boolean isLoss(){
        return pRaid.isLoss();
    }

    public boolean isBetweenWaves(){
        return pRaid.isBetweenWaves();
    }

    public boolean isOver(){
        return pRaid.isOver();
    }

    public boolean isStarted(){
        return pRaid.isStarted();
    }

    public boolean isStopped(){
        return pRaid.isStopped();
    }

    public boolean isVictory(){
        return pRaid.isVictory();
    }

    public void stop(){
        pRaid.stop();
    }
}
