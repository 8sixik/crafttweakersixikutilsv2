package net.sixik.crafttweakersixikutils.integration.crafttweaker.Entity.type.player.Client;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.openzen.zencode.java.ZenCodeType;

import java.util.UUID;

@ZenRegister
@NativeTypeRegistration(value = LocalPlayer.class, zenCodeName = "mods.crafttweakerutils.api.entity.client.LocalPlayer")
public class MCLocalPlayer {

    @ZenCodeType.Getter("uuid")
    @ZenCodeType.Method
    public static String getUUID(LocalPlayer player){
        return player.getUUID().toString();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("server")
    public static ServerLevel getServer(LocalPlayer player){
        return player.getServer().getLevel(player.getLevel().dimension());
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("level")
    public static Level getLevel(LocalPlayer player){
        return player.getLevel();
    }

    @ZenCodeType.Getter("player")
    @ZenCodeType.Method
    public static Player getClientPlayer(LocalPlayer player){
        return player;
    }
}
