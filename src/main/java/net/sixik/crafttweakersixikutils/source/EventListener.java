package net.sixik.crafttweakersixikutils.source;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sixik.crafttweakersixikutils.source.events.LivingEnityKillByPlayerEvent;
import net.sixik.crafttweakersixikutils.source.events.PortalSpawnEvent;

@Mod.EventBusSubscriber(modid = "crafttweakerutils", bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class EventListener {

    @SubscribeEvent
    public static void onEntityDied(LivingDeathEvent event){
        LivingEntity entity = event.getEntity();
        DamageSource damageSource = event.getSource();
        if(damageSource.getDirectEntity() == null || damageSource.getEntity() == null) return;
        if(damageSource.getDirectEntity() instanceof Player || damageSource.getEntity() instanceof Player){
            Player player = (Player) damageSource.getEntity();
            MinecraftForge.EVENT_BUS.post(new LivingEnityKillByPlayerEvent(entity, player, player.getInventory().getSelected()));
        }
    }
    @SubscribeEvent
    public static void onPortalSpawn(BlockEvent.PortalSpawnEvent event){
        if(event.getLevel() == null) return;
        MinecraftForge.EVENT_BUS.post(new PortalSpawnEvent(event.getLevel(), event.getPos(), event.getState(), event.getPortalSize()));
    }



//    @SubscribeEvent
//    public static void onBlockBreak(BlockEvent.BreakEvent event){
//        Player player = event.getPlayer();
//        BlockPos pos = event.getPos();
//        BlockState state = event.getState();
//        ItemStack blockItem = state.getBlock().asItem().getDefaultInstance();
//        Level level = (Level) event.getLevel();
//        if(player == null) return;
//        if(level.isClientSide || player.getLevel().isClientSide)return;
//        ItemStack itemBreak = player.getInventory().getSelected();
//        int expBlokc = event.getExpToDrop();
//        System.out.printf(blockItem.getTags().toString());
//        if(blockItem.getTag().contains("forge:ores")){
//
//        }
//    }
}
