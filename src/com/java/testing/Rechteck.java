package com.java.testing;

/**
 * Created by natha on 13.06.2016.
 */
public class Rechteck extends Figur {
    private int hoehe;
    private int breite;

    public Rechteck(int x, int y, int breite, int hoehe) {
        super(x,y);
        this.breite = breite;
        this.hoehe = hoehe;
    }
}
