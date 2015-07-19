package com.hackbulgaria.programming51.week6.labirinth;

/**
 * Created by Inspired Day on 7/19/2015.
 */
public class MoveRight extends Movement {

    public MoveRight(){
        super();
    }

    public Pair<Integer> move(Pair<Integer> currentPosition) {
        return new Pair<>(currentPosition.getFirst(), currentPosition.getSecond()+1);
    }
}
