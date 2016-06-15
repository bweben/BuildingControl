package com.java.testing;

import java.awt.*;

/**
 * Created by natha on 13.06.2016.
 */
public class Kreis extends Figur {
    private int radius;

    public Kreis(int x, int y, int radius) {
        super(x,y);
        this.radius = radius;
    }

    @Override
    public void zeichne(Graphics g) {
        g.drawOval(x,y,radius,radius);
    }
}
