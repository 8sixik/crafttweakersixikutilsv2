package net.sixik.crafttweakersixikutils.integration.crafttweaker.Block;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.world.Container;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@NativeTypeRegistration(value = BlockEntity.class, zenCodeName = "crafttweaker.api.block.entity.BlockEntity")
public class ExpandBlockEntity {
    @ZenCodeType.Method
    @ZenCodeType.Getter("container")
    public static Container getContainer(BlockEntity entity){
        if(entity != null){
            if(!onHaveContainer(entity)) return null;
            if(entity instanceof BaseContainerBlockEntity block){
                return block;
            }
            return null;
        }
        return null;
    }
    private static boolean onHaveContainer(BlockEntity blockEntity){
        if(blockEntity == null) return false;
        return blockEntity instanceof BaseContainerBlockEntity;
    }
    @ZenCodeType.Method
    public static int testSixik(BlockEntity blockEntity){
        if(blockEntity instanceof BaseContainerBlockEntity baseContainer){
            Container container = (Container) baseContainer;
            return container.getContainerSize();
        }
        return -1;
    }
}
