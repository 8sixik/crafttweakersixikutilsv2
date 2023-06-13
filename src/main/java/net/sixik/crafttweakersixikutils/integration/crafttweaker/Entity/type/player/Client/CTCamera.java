package net.sixik.crafttweakersixikutils.integration.crafttweaker.Entity.type.player.Client;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.mojang.math.Vector3f;
import net.minecraft.client.Camera;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@ZenCodeType.Name("mods.crafttweakerutils.entity.player.client.Camera")
public class CTCamera {

    private Camera camera;
    public CTCamera(Camera camera){
        this.camera = camera;
    }

    public Camera getCamera() {
        return camera;
    }
    @ZenCodeType.Method
    public float getXRot(){
        return camera.getXRot();
    }
    @ZenCodeType.Method
    public float getYRot(){
        return camera.getYRot();
    }
    @ZenCodeType.Method
    public BlockState getBlockAtCamera(){
        return camera.getBlockAtCamera();
    }
    @ZenCodeType.Method
    public BlockPos getBlockPosition(){
        return camera.getBlockPosition();
    }
    @ZenCodeType.Method
    public Vec3 getPosition(){
        return camera.getPosition();
    }
    @ZenCodeType.Method
    public Entity getEntity(){
        return camera.getEntity();
    }
    @ZenCodeType.Method
    public Vector3f getLeftVector(){
        return camera.getLeftVector();
    }
    @ZenCodeType.Method
    public Vector3f getUpVector(){
        return camera.getUpVector();
    }
    @ZenCodeType.Method
    public Vector3f getLookVector(){
        return camera.getLookVector();
    }
    @ZenCodeType.Method
    public Vec3 getBottomLeft(){
        return camera.getNearPlane().getBottomLeft();
    }
    @ZenCodeType.Method
    public Vec3 getBottomRight(){
        return camera.getNearPlane().getBottomRight();
    }
    @ZenCodeType.Method
    public Vec3 getTopLeft(){
        return camera.getNearPlane().getTopLeft();
    }
    @ZenCodeType.Method
    public Vec3 getTopRight(){
        return camera.getNearPlane().getTopRight();
    }
    @ZenCodeType.Method
    public Vec3 getPointOnPlane(float block1, float block2){
        return camera.getNearPlane().getPointOnPlane(block1, block2);
    }
    @ZenCodeType.Method
    public boolean isDetached(){
        return camera.isDetached();
    }
    @ZenCodeType.Method
    public boolean isInitialized(){
        return camera.isInitialized();
    }

//    public void setup(Level level, Entity entity, boolean b1, boolean b2, float num1){
//        camera.setup(level, entity, b1, b2, num1);
//    }
//    public void setAnglesInternal(float num1, float num2){
//        camera.setAnglesInternal(num1, num1);
//    }
}
