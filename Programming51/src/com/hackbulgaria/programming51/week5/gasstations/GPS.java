package com.hackbulgaria.programming51.week5.gasstations;

import java.util.Scanner;
import java.util.Vector;

/**
 * Created by Inspired Day on 7/10/2015.
 */
public class GPS {

    public static Vector<Integer> getGasStations(int tripDistance, int tankSize, Vector<Integer> gasStations) {
        Vector<Integer> minGasStations = new Vector<>();
        gasStations.add(tripDistance); // Adding the last destination to the main vector, because we want to have enough gas to reach it
        int lastStation = 0;
        int traveledKm = tankSize;
        int x = 0;
        if(tankSize >= gasStations.get(0)){
            for (int i = 0; i < gasStations.size(); i++) {
                if(gasStations.get(i) > traveledKm){
                    x = traveledKm - lastStation; // x --> the kilometers which we have in our tank on the station where we have to charge
                    traveledKm += (tankSize - x);
                    minGasStations.add(lastStation);
                }
                lastStation = gasStations.get(i);
            }
        }
        return minGasStations;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tripDistance = scanner.nextInt();
        int tankSize = scanner.nextInt();

        int gasStationsCount = scanner.nextInt();
        Vector<Integer> gasStations = new Vector<Integer>();

        for (int i = 0; i < gasStationsCount; i++) {
            gasStations.add(scanner.nextInt());
        }

        Vector<Integer> result = getGasStations(tripDistance, tankSize, gasStations);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }
}
