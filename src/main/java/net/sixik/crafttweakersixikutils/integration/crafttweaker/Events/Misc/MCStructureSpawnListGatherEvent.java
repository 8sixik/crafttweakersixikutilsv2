//package net.sixik.crafttweakerutils.ct.events.server.misc;
//
//import com.blamejared.crafttweaker.api.annotation.ZenRegister;
//import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
//import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorList;
//import net.minecraftforge.eventbus.api.Event;
//import org.openzen.zencode.java.ZenCodeType;
//
//import java.util.List;
//
//@ZenRegister
//@NativeTypeRegistration(value = StructureProcessorList.class, zenCodeName = "mods.crafttweakerutils.api.events.misc.MCStructureSpawnListGatherEvent")
//public class MCStructureSpawnListGatherEvent {
//
//    @ZenCodeType.Method
//    public static Event.Result getResult(StructureProcessorList event){
//       return event.getResult();
//    }
//    @ZenCodeType.Method
//    public static boolean isInsideOnly(StructureProcessorList event){
//       return event.isInsideOnly();
//    }
//    @ZenCodeType.Method
//    public static ResourceLocation getRegistryName(StructureProcessorList event){
//       return event.getStructure().getRegistryName();
//    }
//    @ZenCodeType.Method
//    public static String getFeatureName(StructureProcessorList event){
//       return event.getStructure().getFeatureName();
//    }
//    @ZenCodeType.Method
//    public static List<MobSpawnInfo.Spawners> getSpawnList(StructureProcessorList event){
//       return event.getStructure().getSpawnList(EntityClassification.MONSTER);
//    }
//    @ZenCodeType.Method
//    public static String getSpawnListString(StructureProcessorList event){
//       return event.getStructure().getSpawnList(StructureProcessorList.MONSTER).toString();
//    }
//
//}
