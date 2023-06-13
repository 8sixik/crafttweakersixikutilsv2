package net.sixik.crafttweakersixikutils.integration.crafttweaker.Entity;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.openzen.zencode.java.ZenCodeType;

import java.util.HashMap;
import java.util.Map;

@ZenRegister
@NativeTypeRegistration(value = net.minecraft.world.entity.LivingEntity.class, zenCodeName = "crafttweaker.api.entity.LivingEntity")
public class ExpandLivingEntity {

    @ZenCodeType.Method
    public static boolean isFriendly(net.minecraft.world.entity.LivingEntity entity){
        return entity.getType().getCategory().isFriendly();
    }
    @ZenCodeType.Method
    public static boolean isPersistent(net.minecraft.world.entity.LivingEntity entity){
        return entity.getType().getCategory().isPersistent();
    }
    @ZenCodeType.Method
    public static int getDespawnDistance(net.minecraft.world.entity.LivingEntity entity){
        return entity.getType().getCategory().getDespawnDistance();
    }
    @ZenCodeType.Method
    public static int getNoDespawnDistance(net.minecraft.world.entity.LivingEntity entity){
        return entity.getType().getCategory().getNoDespawnDistance();
    }
    @ZenCodeType.Method
    public static int getMaxInstancesPerChunk(net.minecraft.world.entity.LivingEntity entity){
        return entity.getType().getCategory().getMaxInstancesPerChunk();
    }
    @ZenCodeType.Method
    public static int getArrowCount(net.minecraft.world.entity.LivingEntity entity){
        return entity.getArrowCount();
    }
    @ZenCodeType.Method
    public static int getArmorValue(net.minecraft.world.entity.LivingEntity entity){
        return entity.getArmorValue();
    }

}
