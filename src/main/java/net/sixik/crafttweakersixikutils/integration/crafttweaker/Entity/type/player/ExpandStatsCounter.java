package net.sixik.crafttweakersixikutils.integration.crafttweaker.Entity.type.player;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker.api.item.IItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.stats.ServerStatsCounter;
import net.minecraft.stats.Stat;
import net.minecraft.stats.Stats;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.Block;
import org.openzen.zencode.java.ZenCodeType;


@ZenRegister
@ZenCodeType.Name("mods.crafttweakerutils.api.entity.type.player.StatsCounter")
public class ExpandStatsCounter {
    
    private ServerStatsCounter statFile;
    private Player player;
    public ExpandStatsCounter(ServerStatsCounter statFile,Player player){
        this.statFile = statFile;
        this.player =player;
    }

    public int get(Stat<?> stat) {
        return this.statFile.getValue(stat);
    }
    public int get(ResourceLocation rl) {
        return this.get(Stats.CUSTOM.get(rl));
    }

    @ZenCodeType.Method
    public void set(ResourceLocation rl, int value) {
        this.statFile.setValue(this.player, Stats.CUSTOM.get(rl), value);
    }

    @ZenCodeType.Method
    public void add(ResourceLocation rl, int value) {
        this.statFile.increment(this.player, Stats.CUSTOM.get(rl), value);
    }

//    public int test(String stat){
//        statFile.getValue(Stats.CUSTOM.contains())
//    }

//    @ZenCodeType.Method
//    public int getValue(String stat){
//        if(Stat.getCustomCriteriaNames().contains(stat)){
//            return statFile.getValue((Stat<?>) Stat.byName(stat).get());
//        }
//        else {
//            return -1;
//        }
//    }
    @ZenCodeType.Method
    public int getValue(ResourceLocation stat){
        if(Stats.CUSTOM.contains(stat)){
            return statFile.getValue(Stats.CUSTOM.get(stat));
        }
        else {
            return -1;
        }
    }
    @ZenCodeType.Method
    public int getStatValue(ResourceLocation rl){
        return this.get(rl);
    }

    @ZenCodeType.Method
    public int getPlayTime() {
        return this.get(Stats.PLAY_TIME);
    }

    @ZenCodeType.Method
    public int getTimeSinceDeath() {
        return this.get(Stats.TIME_SINCE_DEATH);
    }
    @ZenCodeType.Method
    public int getTimeSinceRest() {
        return this.get(Stats.TIME_SINCE_REST);
    }
    @ZenCodeType.Method
    public int getTimeCrouchTime() {
        return this.get(Stats.CROUCH_TIME);
    }
    @ZenCodeType.Method
    public int getJumps() {
        return this.get(Stats.JUMP);
    }
    @ZenCodeType.Method
    public int getWalkDistance() {
        return this.get(Stats.WALK_ONE_CM);
    }
    @ZenCodeType.Method
    public int getSprintDistance() {
        return this.get(Stats.SPRINT_ONE_CM);
    }
    @ZenCodeType.Method
    public int getSwimDistance() {
        return this.get(Stats.SWIM_ONE_CM);
    }
    @ZenCodeType.Method
    public int getCrouchDistance() {
        return this.get(Stats.CROUCH_ONE_CM);
    }
    @ZenCodeType.Method
    public int getDamageDealt() {
        return this.get(Stats.DAMAGE_DEALT);
    }
    @ZenCodeType.Method
    public int getDamageDealt_absorbed() {
        return this.get(Stats.DAMAGE_DEALT_ABSORBED);
    }
    @ZenCodeType.Method
    public int getDamageDealt_resisted() {
        return this.get(Stats.DAMAGE_DEALT_RESISTED);
    }
    @ZenCodeType.Method
    public int getDamageTaken() {
        return this.get(Stats.DAMAGE_TAKEN);
    }
    @ZenCodeType.Method
    public int getDamageBlocked_by_shield() {
        return this.get(Stats.DAMAGE_BLOCKED_BY_SHIELD);
    }
    @ZenCodeType.Method
    public int getDamageAbsorbed() {
        return this.get(Stats.DAMAGE_ABSORBED);
    }
    @ZenCodeType.Method
    public int getDamageResisted() {
        return this.get(Stats.DAMAGE_RESISTED);
    }
    @ZenCodeType.Method
    public int getDeaths() {
        return this.get(Stats.DEATHS);
    }
    @ZenCodeType.Method
    public int getMobKills() {
        return this.get(Stats.MOB_KILLS);
    }
    @ZenCodeType.Method
    public int getAnimalsBred() {
        return this.get(Stats.ANIMALS_BRED);
    }
    @ZenCodeType.Method
    public int getPlayerKills() {
        return this.get(Stats.PLAYER_KILLS);
    }
    @ZenCodeType.Method
    public int getFishCaught() {
        return this.get(Stats.FISH_CAUGHT);
    }

    @ZenCodeType.Method
    public int getBlocksMined(Block block) {
        return this.statFile.getValue(Stats.BLOCK_MINED.get(block));
    }
    @ZenCodeType.Method
    public int getItemsCrafted(IItemStack item) {
        return this.statFile.getValue(Stats.ITEM_CRAFTED.get(item.getDefinition()));
    }
    @ZenCodeType.Method
    public int getItemsUsed(IItemStack item) {
        return this.statFile.getValue(Stats.ITEM_USED.get(item.getDefinition()));
    }
    @ZenCodeType.Method
    public int getItemsBroken(IItemStack item) {
        return this.statFile.getValue(Stats.ITEM_BROKEN.get(item.getDefinition()));
    }
    @ZenCodeType.Method
    public int getItemsPickedUp(IItemStack item) {
        return this.statFile.getValue(Stats.ITEM_PICKED_UP.get(item.getDefinition()));
    }
    @ZenCodeType.Method
    public int getItemsDropped(IItemStack item) {
        return this.statFile.getValue(Stats.ITEM_DROPPED.get(item.getDefinition()));
    }
    @ZenCodeType.Method
    public int getKilled(EntityType<?> entity) {
        return this.statFile.getValue(Stats.ENTITY_KILLED.get(entity));
    }
    @ZenCodeType.Method
    public int getKilledBy(EntityType<?> entity) {
        return this.statFile.getValue(Stats.ENTITY_KILLED_BY.get(entity));
    }

//    @ZenCodeType.Method
//    public List<ResourceLocation> DumpStatsResourceLocation(){
//        List<ResourceLocation> list = new ArrayList<>();
//        Stats.CUSTOM.getRegistry().forEach(s ->{
//            list.add(s);
//        });
//        return list;
//    }

//    @ZenCodeType.Method
//    public List<String> DumpStatsString(){
//        List<String> list = new ArrayList<>();
//        Stats.getCustomCriteriaNames().forEach(s ->{
//            list.add(s);
//        });
//        return list;
//    }
}
