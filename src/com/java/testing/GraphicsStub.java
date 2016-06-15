package com.java.testing;

import java.awt.*;

/**
 * Created by natha on 14.06.2016.
 */
public class GraphicsStub extends MyGraphics {
    int count;
    int x;
    int y;
    int width;
    int height;

    @Override
    public void drawOval(int x, int y, int width, int height) {
        count++;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
