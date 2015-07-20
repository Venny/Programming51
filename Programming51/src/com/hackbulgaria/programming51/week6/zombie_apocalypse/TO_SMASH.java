package com.hackbulgaria.programming51.week6.zombie_apocalypse;

/**
 * Created by Inspired Day on 7/20/2015.
 */
public class TO_SMASH extends Weapon {
    private int damage;
    private int durability;
    private int currentDurability;
    private String type = "TO_SMASH";

    public TO_SMASH(int damage, int durability){
        super(damage, durability);
        this.damage = damage;
        this.durability = durability;
        this.currentDurability = durability;
    }

    public String getType() {
        return type;
    }

    public int hit() {
        if(currentDurability <= durability / 2 && currentDurability > 1){
            damage--;
        }
        if(currentDurability > 0){
            currentDurability--;
        }
        return damage;
    }
}
