package com.hackbulgaria.programming51.week6.zombie_apocalypse;

/**
 * Created by Inspired Day on 7/13/2015.
 */
public class Axe implements Weapon {
    private int damage = 10;
    private int durability = 50;
    private String type = "TO_SMASH";

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public String getType() {
        return type;
    }
}
