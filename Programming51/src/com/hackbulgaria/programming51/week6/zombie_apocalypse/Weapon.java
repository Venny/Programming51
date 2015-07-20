package com.hackbulgaria.programming51.week6.zombie_apocalypse;

/**
 * Created by Inspired Day on 7/13/2015.
 */
public abstract class Weapon {
    private int damage;
    private int durability;

    public Weapon(int damage, int durability){
        this.damage = damage;
        this.durability = durability;
    }
    public int getDamage() {
        return damage;
    }

    public abstract int hit();

    public abstract String getType();

}
