package com.java.testing;

import java.awt.*;

/**
 * Created by natha on 13.06.2016.
 */
public class Rechteck extends Figur {
    public int hoehe;
    public int breite;

    public Rechteck(int x, int y, int breite, int hoehe) {
        super(x,y);
        this.breite = breite;
        this.hoehe = hoehe;
    }

    @Override
    public void zeichne(Graphics g) {
        g.drawRect(x,y,breite,hoehe);
    }
}
