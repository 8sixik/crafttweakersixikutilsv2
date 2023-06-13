package net.sixik.crafttweakersixikutils.integration.crafttweaker.Entity.type.player.Client;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.shaders.Uniform;
import com.mojang.math.Matrix3f;
import com.mojang.math.Matrix4f;
import com.mojang.math.Vector3f;
import com.mojang.math.Vector4f;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;
import net.sixik.crafttweakersixikutils.integration.crafttweaker.Entity.type.player.Client.CTCamera;
import org.openzen.zencode.java.ZenCodeType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@ZenRegister
@ZenCodeType.Name("mods.crafttweakerutils.entity.player.client.GameRender")
public class CTGameRender {

    private GameRenderer renderer;
    public CTGameRender(GameRenderer renderer){
        this.renderer = renderer;
    }

    public GameRenderer getRenderer() {
        return renderer;
    }

    @ZenCodeType.Method
    public CTCamera getMainCamera(){
        return new CTCamera(renderer.getMainCamera());
    }
    @ZenCodeType.Method
    public Player getPlayerByUUID(String uuid){
        return Objects.requireNonNull(renderer.getMinecraft().player).clientLevel.getPlayerByUUID(UUID.fromString(uuid));
    }
    @ZenCodeType.Method
    public Player getPlayer(){
        return renderer.getMinecraft().player;
    }

    @ZenCodeType.Method
    public List<String> getShadersName(){
        List<String> names = new ArrayList<>();
        names.add(renderer.blitShader.TEXTURE_MATRIX.getName());
        names.add(renderer.blitShader.CHUNK_OFFSET.getName());
        names.add(renderer.blitShader.FOG_END.getName());
        names.add(renderer.blitShader.COLOR_MODULATOR.getName());
        names.add(renderer.blitShader.FOG_COLOR.getName());
        names.add(renderer.blitShader.FOG_SHAPE.getName());
        names.add(renderer.blitShader.FOG_START.getName());
        names.add(renderer.blitShader.GAME_TIME.getName());
        names.add(renderer.blitShader.INVERSE_VIEW_ROTATION_MATRIX.getName());
        names.add(renderer.blitShader.LIGHT0_DIRECTION.getName());
        names.add(renderer.blitShader.LIGHT1_DIRECTION.getName());
        names.add(renderer.blitShader.LINE_WIDTH.getName());
        names.add(renderer.blitShader.MODEL_VIEW_MATRIX.getName());
        names.add(renderer.blitShader.PROJECTION_MATRIX.getName());
        names.add(renderer.blitShader.SCREEN_SIZE.getName());
        return names;
    }

    @ZenCodeType.Method
    public void blitShader(String uni, float f){
        renderer.blitShader.getUniform(uni).set(f);
    }
    @ZenCodeType.Method
    public void blitShader(String uni, float f, float f2){
        renderer.blitShader.getUniform(uni).set(f, f2);
    }
    @ZenCodeType.Method
    public void blitShader(String uni, float f, float f2, float f3){
        renderer.blitShader.getUniform(uni).set(f, f2, f3);
    }
    @ZenCodeType.Method
    public void blitShader(String uni, float f, float f2, float f3, float f4){
        renderer.blitShader.getUniform(uni).set(f, f2, f3, f4);
    }
    @ZenCodeType.Method
    public void blitShader(String uni, float[] f){
        renderer.blitShader.getUniform(uni).set(f);
    }
    @ZenCodeType.Method
    public void blitShader(String uni, Matrix4f f){
        renderer.blitShader.getUniform(uni).set(f);
    }
    @ZenCodeType.Method
    public void blitShader(String uni, Matrix3f f){
        renderer.blitShader.getUniform(uni).set(f);
    }
    @ZenCodeType.Method
    public void blitShader(String uni, Vector3f f){
        renderer.blitShader.getUniform(uni).set(f);
    }
    @ZenCodeType.Method
    public void blitShaderSet(String uni, Vector4f f){
        renderer.blitShader.getUniform(uni).set(f);
    }
    @ZenCodeType.Method
    public void blitShaderSetLocation(String uni, int f){
        renderer.blitShader.getUniform(uni).setLocation(f);
    }
    @ZenCodeType.Method
    public void blitShaderSetSafe(String uni, float f1, float f2, float f3, float f4){
        renderer.blitShader.getUniform(uni).setSafe(f1,f2,f3,f4);
    }
}
