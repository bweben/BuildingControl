package com.java.testing;

/**
 * Created by natha on 13.06.2016.
 */
public class Linie extends Figur {
    private int endx;
    private int endy;

    public Linie(int x, int y, int endx, int endy) {
        super(x,y);
        this.endx = endx;
        this.endy = endy;
    }
}
