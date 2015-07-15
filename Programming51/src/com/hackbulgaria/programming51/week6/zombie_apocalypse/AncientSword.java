package com.hackbulgaria.programming51.week6.zombie_apocalypse;

/**
 * Created by Inspired Day on 7/13/2015.
 */
public class AncientSword implements Weapon {
    private int damage = 50;
    private int durability = 10;
    private String type = "TO_SMASH";

    @Override
    public int getDamage() {
        return 0;
    }

    @Override
    public int getDurability() {
        return 0;
    }

    @Override
    public String getType() {
        return null;
    }
}
