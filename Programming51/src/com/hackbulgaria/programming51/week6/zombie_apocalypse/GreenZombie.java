package com.hackbulgaria.programming51.week6.zombie_apocalypse;

/**
 * Created by Inspired Day on 7/15/2015.
 */
public class GreenZombie implements Zombie {
    private int totalHealth;
    private int currentHealth;

    public GreenZombie(int zombieHealth){
        this.totalHealth = zombieHealth;
        this.currentHealth = zombieHealth;
    }

    @Override
    public int getTotalHealth() {
        return totalHealth;
    }

    @Override
    public int getCurrentHealth() {
        return currentHealth;
    }

    @Override
    public void hit(int damage) {
        currentHealth -= damage;
    }

    @Override
    public boolean isDead() {
        return (currentHealth <= 0)? true: false;
    }
}
