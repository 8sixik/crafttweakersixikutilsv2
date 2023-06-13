package net.sixik.crafttweakersixikutils.integration.crafttweaker.Game;

import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@ZenCodeType.Name("mods.crafttweakerutils.misc.Math")
public class Math {

    @ZenCodeType.Method
    public double getPercent(double num, int percent, int type){
        switch (type) {
            case 1 -> {
                String t = null;
                if (percent < 10) {
                    t = ("0.0" + percent);
                } else t = ("0." + percent);
                return num * Double.parseDouble(t);
            }
            case 2 -> {
                return num * percent / 100;
            }
            case 3 -> {
                return num / 100 * percent;
            }
            default -> {
                CraftTweakerAPI.LOGGER.error("(getPercent) -> Not Found Type");
                return -1;
            }
        }
    }

    @ZenCodeType.Method
    public static double getPercentageRatio(double num1, double num2, boolean rounding){
        if(rounding){
            return (double) (int) num1/num2 * 100;
        }
        else return num1/num2 * 100;
    }

    @ZenCodeType.Method
    public static float abs(float num){
        return Math.abs(num);
    }
    @ZenCodeType.Method
    public static int abs(int num){
        return Math.abs(num);
    }
    @ZenCodeType.Method
    public static double abs(double num){
        return Math.abs(num);
    }
    @ZenCodeType.Method
    public static long abs(long num){
        return Math.abs(num);
    }


    @ZenCodeType.Method
    public static double atan(double num1){
        return Math.atan(num1);
    }
    @ZenCodeType.Method
    public static double atan(double num1, double num2){
        return Math.atan(num1, num2);
    }

    @ZenCodeType.Method
    public static int addExact(int num1, int num2){
        return Math.addExact(num1, num2);
    }
    @ZenCodeType.Method
    public static long addExact(long num1, long num2){
        return Math.addExact(num1, num2);
    }

    @ZenCodeType.Method
    public static double asin(double num1){
        return Math.asin(num1);
    }
    @ZenCodeType.Method
    public static double acos(double num1){
        return Math.acos(num1);
    }
}
