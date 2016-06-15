package com.java.testing;

import java.awt.*;

/**
 * Created by natha on 13.06.2016.
 */
public abstract class Figur {
    protected int x;
    protected int y;

    public Figur(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void zeichne(Graphics g);
}
