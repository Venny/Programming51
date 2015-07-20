package com.hackbulgaria.programming51.week6.zombie_apocalypse;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * Created by Inspired Day on 7/15/2015.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int zombiesNum = scanner.nextInt();
        int zombieHealth = scanner.nextInt();
        String weapon = scanner.next().toLowerCase();

        Weapon currentWeapon;
        int hits = 0;
        switch (weapon){
            case "axe":
               currentWeapon = new Axe();
            break;
            case "sword":
                currentWeapon = new AncientSword();
                break;
            case "shotgun":
                currentWeapon = new Shotgun();
                break;
            case "revolver":
                currentWeapon = new Revolver();
                break;
            default:
                currentWeapon = null;
                    break;
        }
        Zombie[] zombies = new Zombie[zombiesNum];
        for(int i = 0; i < zombiesNum; i++){
            zombies[i] = new GreenZombie(zombieHealth);
        }
        for(Zombie zombie:zombies){
            while (!zombie.isDead()){
                zombie.hit(currentWeapon.hit());
                hits ++;
            }
        }
        System.out.println(hits);
    }
}
