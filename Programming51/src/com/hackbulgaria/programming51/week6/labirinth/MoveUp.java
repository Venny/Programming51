package com.hackbulgaria.programming51.week6.labirinth;

/**
 * Created by Inspired Day on 7/19/2015.
 */
public class MoveUp extends Movement {

    public MoveUp(){
        super();
    }

    public Pair<Integer> move(Pair<Integer> currentPosition) {
        return new Pair<>(currentPosition.getFirst() - 1, currentPosition.getSecond());
    }
}
