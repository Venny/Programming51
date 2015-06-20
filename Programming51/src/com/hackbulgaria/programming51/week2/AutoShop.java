package com.hackbulgaria.programming51.week2;

/**
 * Created by Inspired Day on 6/17/2015.
 */
public class AutoShop {
    public Auto [] autos;

    public AutoShop(Auto [] myAutos){
        this.autos = myAutos;
    }

    public void addCar(Auto car){
        for(int i = 0; i < autos.length; i++){
            if(autos[i] == null){
                autos[i] = car;
                //System.out.println(car);
                return;
            }
        }
    }

    public Auto getTopSpeed(){
        int bestSpeed = 0;
        int bestSpeedCar = 0;
        for(int i = 0; i < autos.length; i++){
            if( autos[i] != null && autos[i].maxSpeed > bestSpeed ){
                bestSpeed = autos[i].maxSpeed;
                bestSpeedCar = i;
            }
        }


        return autos[bestSpeedCar];
    }
}
