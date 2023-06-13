package net.sixik.crafttweakersixikutils.integration.crafttweaker.Misc.world;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.biome.BiomeResolver;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.levelgen.structure.Structure;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = ChunkAccess.class, zenCodeName = "mods.crafttweakerutils.api.misc.world.Chunk")
public class ExpandChunk {
    @ZenCodeType.Method
    public static void addEntity(ChunkAccess chunk,Entity entity){
        chunk.addEntity(entity);
    }
    @ZenCodeType.Method
    public static void addEntity(ChunkAccess chunk,Structure structure, long lg){
        chunk.addReferenceForStructure(structure, lg);
    }
    @ZenCodeType.Method
    public static void fillBiomesFromNoise(ChunkAccess chunk,BiomeResolver biomeResolver, Climate.Sampler climateSampler){
        chunk.fillBiomesFromNoise(biomeResolver, climateSampler);
    }
}
