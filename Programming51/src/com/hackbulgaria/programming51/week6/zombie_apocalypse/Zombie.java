package com.hackbulgaria.programming51.week6.zombie_apocalypse;

/**
 * Created by Inspired Day on 7/13/2015.
 */
public interface Zombie {
    public int getTotalHealth();
    public int getCurrentHealth();
    public void hit(int damage);
    public boolean isDead();
}
