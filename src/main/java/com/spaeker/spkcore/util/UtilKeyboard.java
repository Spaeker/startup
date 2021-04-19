package com.spaeker.spkcore.util;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.InputMappings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.lwjgl.glfw.GLFW;

public class UtilKeyboard {
    @OnlyIn(Dist.CLIENT)
    public static boolean isHoldingShift(){
        return InputMappings.isKeyDown((Minecraft.getInstance().getWindow().getWindow()),
                GLFW.GLFW_KEY_LEFT_SHIFT);
    }
    @OnlyIn(Dist.CLIENT)
    public static boolean isHoldingCrontrol(){
        return InputMappings.isKeyDown((Minecraft.getInstance().getWindow().getWindow()),
                GLFW.GLFW_KEY_LEFT_CONTROL);
    }





}
