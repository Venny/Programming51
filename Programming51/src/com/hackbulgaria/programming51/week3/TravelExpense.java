package com.hackbulgaria.programming51.week3;

import java.util.List;

/**
 * Created by Inspired Day on 6/24/2015.
 */
public class TravelExpense {
    private String type;
    private Employee employee;
    private int netCost;

    public TravelExpense(String type, Employee employee, int netCost){
        this.type = type;
        this.employee = employee;
        this.netCost = netCost;
    }

    public String toString(){
        return "Type: " + type + " Employee: " + employee + " netCost: " + netCost;
    }

    public String getType(){
        return type;
    }

    public Employee getEmployee(){
        return employee;
    }

    public int getNetCost(){
        return netCost;
    }
}
