package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;

import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.command.argument.IItemStackArgument;
import com.blamejared.crafttweaker.api.item.IItemStack;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import com.mojang.datafixers.util.Either;
import net.minecraft.ChatFormatting;
import net.minecraft.ResourceLocationException;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Iterator;
import java.util.UUID;

@ZenRegister
@NativeTypeRegistration(value = ServerLevel.class, zenCodeName = "crafttweaker.api.world.ServerLevel")
public class ExpandServerLevel {
    private static final ResourceLocation DEFAULT_STRUCTURE = new ResourceLocation("minecraft:mineshaft");
    private Either<ResourceKey<Structure>, TagKey<Structure>> structure;
    public ExpandServerLevel(ServerLevel serverLevel){
        this.structure = Either.left(ResourceKey.create(Registry.STRUCTURE_REGISTRY, DEFAULT_STRUCTURE));
    }

    @ZenCodeType.Method
    public static BlockPos getRandomPos(ServerLevel world, int[] t){
        if(t == null) return null;
        return world.getBlockRandomPos(t[0], t[1], t[2], t[3]);
    }
    @ZenCodeType.Method
    public static int getMaxLocalRawBrightness(ServerLevel world, BlockPos pos){
        return world.getMaxLocalRawBrightness(pos);
    }
    @ZenCodeType.Method
    public static int getMaxBuildHeight(ServerLevel world){
        return world.getMaxBuildHeight();
    }
    @ZenCodeType.Method
    public static int getMaxLightLevel(ServerLevel world){
        return world.getMaxLightLevel();
    }
    @ZenCodeType.Method
    public static int getMoonPhase(ServerLevel world){
        return world.getMoonPhase();
    }
    @ZenCodeType.Method
    public static float getMoonBrightness(ServerLevel world){
        return world.getMoonBrightness();
    }
    @ZenCodeType.Method
    public static int getHeight(ServerLevel world){
        return world.getHeight();
    }
    @ZenCodeType.Method
    public static int getSeaLevel(ServerLevel world){
        return world.getSeaLevel();
    }
    @ZenCodeType.Method
    public static ServerPlayer getRandomPlayer(ServerLevel world){
        return world.getRandomPlayer();
    }
    @ZenCodeType.Method
    public static void createOrExtendRaid(ServerLevel world, ServerPlayer player){
        world.getRaids().createOrExtendRaid(player);
    }
    @ZenCodeType.Method
    public static double getMaxEntityRadius(ServerLevel world){
        return world.getMaxEntityRadius();
    }
    @ZenCodeType.Method
    public static String getDifficultyString(ServerLevel world){
        return world.getDifficulty().getDisplayName().toString();
    }
    @ZenCodeType.Method
    public static int getDifficultyIndex(ServerLevel world){
        return world.getDifficulty().getId();
    }
    @ZenCodeType.Method
    public static String getDifficultyKey(ServerLevel world){
        return world.getDifficulty().getKey();
    }
    @ZenCodeType.Method
    public static String getGameRulesString(ServerLevel world){
        return world.getGameRules().toString();
    }
    @ZenCodeType.Method
    public static void setWorldBorderSize(ServerLevel world, double size){
        world.getWorldBorder().setSize(size);
    }
    @ZenCodeType.Method
    public static double getWorldBorderSize(ServerLevel world){
        return world.getWorldBorder().getSize();
    }
    @ZenCodeType.Method
    public static double getDistanceToWorldBorder(ServerLevel world, Entity entity){
        return world.getWorldBorder().getDistanceToBorder(entity);
    }
    @ZenCodeType.Method
    public static void setAbsoluteMaxWorldBorderSize(ServerLevel world, int size){
        world.getWorldBorder().setAbsoluteMaxSize(size);
    }
    @ZenCodeType.Method
    public static int getAbsoluteMaxWorldBorderSize(ServerLevel world){
        return world.getWorldBorder().getAbsoluteMaxSize();
    }
    @ZenCodeType.Method
    public static void setWorldBorderCenter(ServerLevel world, double x, double z){
        world.getWorldBorder().setCenter(x, z);
    }
    @ZenCodeType.Method
    public static double getWorldBorderCenterX(ServerLevel world){
        return world.getWorldBorder().getCenterX();
    }
    @ZenCodeType.Method
    public static double getWorldBorderCenterZ(ServerLevel world){
        return world.getWorldBorder().getCenterZ();
    }
    @ZenCodeType.Method
    public static void setDamagePerBlock(ServerLevel world, double damage){
        world.getWorldBorder().setDamagePerBlock(damage);
    }
    @ZenCodeType.Method
    public static double getDamagePerBlock(ServerLevel world){
        return world.getWorldBorder().getDamagePerBlock();
    }
    @ZenCodeType.Method
    public static void setWarningBlocks(ServerLevel world, int warn){
        world.getWorldBorder().setWarningBlocks(warn);
    }
    @ZenCodeType.Method
    public static int getWarningBlocks(ServerLevel world){
        return world.getWorldBorder().getWarningBlocks();
    }
    @ZenCodeType.Method
    public static void setDamageSafeZone(ServerLevel world, double damage){
        world.getWorldBorder().setDamageSafeZone(damage);
    }
    @ZenCodeType.Method
    public static double getDamageSafeZone(ServerLevel world){
        return world.getWorldBorder().getDamageSafeZone();
    }
    @ZenCodeType.Method
    public static void setWarningTime(ServerLevel world, int time){
        world.getWorldBorder().setWarningTime(time);
    }
    @ZenCodeType.Method
    public static int getWarningTime(ServerLevel world){
        return world.getWorldBorder().getWarningTime();
    }
    @ZenCodeType.Method
    public static Entity getEntity(ServerLevel world, String id){
        return world.getEntity(UUID.fromString(id));
    }
    @ZenCodeType.Method
    public static Entity getEntity(ServerLevel world, int id){
        return world.getEntity(id);
    }
    @ZenCodeType.Method
    public static int getChunkMaxBlockX(ServerLevel world, BlockPos pos){
        return world.getChunk(pos).getPos().getMaxBlockX();
    }
    @ZenCodeType.Method
    public static int getChunkMaxBlockZ(ServerLevel world, BlockPos pos){
        return world.getChunk(pos).getPos().getMaxBlockZ();
    }
    @ZenCodeType.Method
    public static int getChunkMinBlockX(ServerLevel world, BlockPos pos){
        return world.getChunk(pos).getPos().getMinBlockX();
    }
//    @ZenCodeType.Method
//    public static MCBaseContainerBlockEntity getBlockContainer(ServerLevel world, BlockPos pos){
//        Containers.
//    }


//    @ZenCodeType.Method
//    public static void setDefaultSpawnPos(ServerLevel world, ResourceLocation res, BlockPos pos, float f){
//        ResourceKey<Level> worldK = ResourceKey.create(Registry.DIMENSION_REGISTRY, res);
//        world.getServer().getLevel(worldK).setDefaultSpawnPos(pos, f);
//    }
//    @ZenCodeType.Method
//    public static String testLevels(ServerLevel world){
//        return world.getServer().getLevel()
//    }

//    public static void test(ServerLevel world, PlayerEntity player){
//
//    }

//    public static void getGameRule(ServerLevel world, boolean t, int type){
//        GameRules rule = world.getGameRules();
//        rule.getRule(rule.);
//        switch (type){
//            case 1:
//                rule.getRule(GameRules.RULE_DOENTITYDROPS).set(t, world.getServer());
//                return;
//            default:
//                CraftTweakerAPI.logInfo("Нету такого типа");
//                return;
//        }
//    }


    @ZenCodeType.Method
    public static StructureTemplateManager getStructureManager(ServerLevel level){
        return level.getServer().getStructureManager();
    }

    @ZenCodeType.Method
    public boolean onStructure(ServerLevel level, ServerPlayer player, String st){
        this.setStructure(st);
        return getIfStructure(level, player);
    }

    private boolean getIfStructure(ServerLevel level, ServerPlayer player) {
        return (Boolean)this.structure.map((key) -> {
                    return level.structureManager().getStructureWithPieceAt(player.blockPosition(), key).isValid();
                }, (tag) -> {
            Registry<Structure> reg = level.registryAccess().registry(Registry.STRUCTURE_REGISTRY).orElseThrow();
            Iterator var4 = reg.getTagOrEmpty(tag).iterator();
            Holder holder;
            do {
                if (!var4.hasNext()) {
                    CraftTweakerAPI.LOGGER.error("[SixikUtils] Can't find a structure !");
                    return false;
                }

                holder = (Holder) var4.next();
            } while (!level.structureManager().getStructureWithPieceAt(player.blockPosition(), (Structure) holder.value()).isValid());
            return false;
        });
    }

    private void setStructure(String resLoc) {
        this.structure = resLoc.startsWith("#") ? Either.right(TagKey.create(Registry.STRUCTURE_REGISTRY, this.safeResourceLocation(resLoc.substring(1)))) : Either.left(ResourceKey.create(Registry.STRUCTURE_REGISTRY, this.safeResourceLocation(resLoc)));
    }

    private ResourceLocation safeResourceLocation(String str) {
        try {
            return new ResourceLocation(str);
        } catch (ResourceLocationException var3) {
            CraftTweakerAPI.LOGGER.error("[SixikUtils] Can't find a structure !");
            return DEFAULT_STRUCTURE;
        }
    }
}

