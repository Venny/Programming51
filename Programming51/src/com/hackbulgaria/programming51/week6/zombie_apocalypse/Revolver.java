package com.hackbulgaria.programming51.week6.zombie_apocalypse;

/**
 * Created by Inspired Day on 7/13/2015.
 */
public class Revolver implements Weapon {
    private int damage = 15;
    private int durability = 6;
    private String type = "TO_SHOOT";

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
