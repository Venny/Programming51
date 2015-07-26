package com.hackbulgaria.programming51.week7.functioncallextended;

/**
 * Created by Inspired Day on 7/24/2015.
 */
public class Function {
    private String name;
    private String body;

    public Function(String name, String body) {
        this.name = name;
        this.body = body;
    }


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        String temp = "";
        temp = name + ": " + body;
        return temp;
    }
}
