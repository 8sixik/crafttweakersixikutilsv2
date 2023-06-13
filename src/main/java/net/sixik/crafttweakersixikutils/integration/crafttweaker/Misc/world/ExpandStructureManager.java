package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;

import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import jdk.jfr.Registered;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;
import org.openzen.zencode.java.ZenCodeType;

import java.util.ArrayList;
import java.util.List;


@Registered
@NativeTypeRegistration(value = StructureTemplateManager.class, zenCodeName = "mods.crafttweakerutils.api.misc.world.ServerLevelData")
public class ExpandStructureManager {

    @ZenCodeType.Method
    public List<String> getNamespace(StructureTemplateManager template){
        List<String> list = new ArrayList<>();
        template.listTemplates().forEach(s -> {
            list.add(s.getNamespace());
        });
        return list;
    }
    @ZenCodeType.Method
    public List<String> getPath(StructureTemplateManager template){
        List<String> list = new ArrayList<>();
        template.listTemplates().forEach(s -> {
            list.add(s.getPath());
        });
        return list;
    }
    @ZenCodeType.Method
    public List<String> getLanguageKey(StructureTemplateManager template){
        List<String> list = new ArrayList<>();
        template.listTemplates().forEach(s -> {
            list.add(s.toLanguageKey());
        });
        return list;
    }
    @ZenCodeType.Method
    public List<String> getShortLanguageKey(StructureTemplateManager template){
        List<String> list = new ArrayList<>();
        template.listTemplates().forEach(s -> {
            list.add(s.toShortLanguageKey());
        });
        return list;
    }

//    @ZenCodeType.Method
//    public void inStructure(ServerLevel serverLevel, BlockPos pos, ResourceLocation res){
//
//        Structure t = (Structure) serverLevel.structureManager().getAllStructuresAt(pos);
//        StructureTemplate = (StructureTemplate) t;
//    }

    @ZenCodeType.Method
    public boolean placeInWorld(StructureTemplateManager template,ResourceLocation res, ServerLevel serverLevel, BlockPos pos, BlockPos pos2, int type){
        switch (type){
            case 1:
                if(template.get(res).isEmpty()) return false;
                return template.get(res).get().placeInWorld(serverLevel, pos, pos2, new StructurePlaceSettings().setRandom(serverLevel.random), serverLevel.random, 10);
            case 2:
                template.getOrCreate(res).placeInWorld(serverLevel, pos, pos2, new StructurePlaceSettings().setRandom(serverLevel.random), serverLevel.random, 10);
            default:
                return false;
        }
    }
}
