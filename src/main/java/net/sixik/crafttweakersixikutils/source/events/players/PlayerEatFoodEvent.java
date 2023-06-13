package net.sixik.crafttweakersixikutils.source.events.players;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class PlayerEatFoodEvent extends PlayerEvent {
    ItemStack food;
    public PlayerEatFoodEvent(Player player, ItemStack foodItem) {
        super(player);
        this.food = foodItem;
    }

    @Override
    public boolean isCancelable() {
        return false;
    }

    public ItemStack getFood() {
        return food;
    }

    public boolean isFastFood(){
        return food.getItem().getFoodProperties().isFastFood();
    }
    public boolean canAlwaysEat(){
        return food.getItem().getFoodProperties().canAlwaysEat();
    }
    public boolean isMeat(){
        return food.getItem().getFoodProperties().isMeat();
    }
    public int getNutrition(){
        return food.getItem().getFoodProperties().getNutrition();
    }
    public float getSaturationModifier(){
        return food.getItem().getFoodProperties().getSaturationModifier();
    }
}
