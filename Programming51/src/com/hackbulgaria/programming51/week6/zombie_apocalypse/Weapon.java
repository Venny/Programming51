package com.hackbulgaria.programming51.week6.zombie_apocalypse;

/**
 * Created by Inspired Day on 7/13/2015.
 */
public interface Weapon {
    public int getDamage();
    public int getDurability();
    public String getType(); // can return "TO_SMASH" or "TO_SHOOT"
    public void hit();
}
