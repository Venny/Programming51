package com.hackbulgaria.programming51.week2;

import java.lang.reflect.Array;

/**
 * Created by Inspired Day on 6/17/2015.
 */
public class AutoShop {
    public Auto [] autos;

    public AutoShop(Auto [] myAutos){
        this.autos = myAutos;
    }

    public void addCar(Auto car){
        for(int i = 0; i <= autos.length; i++){
            if(autos[i] == null){
                autos[i] = car;
                System.out.println(car);
                return;
            }
        }
    }
}
