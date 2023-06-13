//package net.sixik.crafttweakerutils.ct.entity.player.client;
//
//import com.blamejared.crafttweaker.api.annotation.ZenRegister;
//import net.minecraft.client.player.AbstractClientPlayer;
//import net.minecraft.client.player.LocalPlayer;
//import net.minecraft.world.entity.player.Player;
//import org.openzen.zencode.java.ZenCodeType;
//
//@ZenRegister
//@ZenCodeType.Name("mods.crafttweakerutils.entity.player.ClientPlayer")
//public class ClientPlayer{
//
//    private final ClientPlayer player;
//
//    public ClientPlayer(Player player) {
//        this.player = ClientPlayer.getClient(player);
//    }
//
//    @ZenCodeType.Nullable
//    public static ClientPlayer getClient(Player player) {
//        if (player == null) return null;
//        return new ClientPlayer(player);
//    }
//
//    @ZenCodeType.Method
//    public boolean inventoryMenuOpen(){
//       return player.inventoryMenuOpen();
//    }
//    @ZenCodeType.Method
//    public boolean getInputKey(int Type){
//        return player.getInputKey(Type);
//    }
//    @ZenCodeType.Method
//    public void sendChat(String message){
//        player.sendChat(message);
//    }
//}
