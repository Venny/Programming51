package com.hackbulgaria.programming51.week3;

import java.util.List;

/**
 * Created by Inspired Day on 6/24/2015.
 */
public class Travel {
    private String city;
    private String country;
    private int vat;

    public Travel(String city, String country, int vat){
        this.city = city;
        this.country = country;
        this.vat = vat;
    }

    public String getCity(){
        return city;
    }

    public String getCountry(){
        return country;
    }

    public int getVat(){
        return vat;
    }

}
