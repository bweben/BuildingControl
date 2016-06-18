package com.java.testing;

import java.awt.*;

/**
 * Created by natha on 13.06.2016.
 */
public class Linie extends Figur {
    public int endx;
    public int endy;

    public Linie(int x, int y, int endx, int endy) {
        super(x,y);
        this.endx = endx;
        this.endy = endy;
    }

    @Override
    public void zeichne(Graphics g) {
        g.drawLine(x,y,endx,endy);
    }
}
