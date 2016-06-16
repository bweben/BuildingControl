package com.java.testing;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

/**
 * Created by natha on 14.06.2016.
 */
public class KreisTest {
    private GraphicsStub g = new GraphicsStub();

    @Test
    public void zeichne() throws Exception {
        Kreis k = new Kreis(10,20,6);
        k.zeichne(g);
        assertEquals(1,g.count);
        assertEquals(13,g.x);
        assertEquals(23,g.y);
        assertEquals(3,g.height);
        assertEquals(3,g.width);
    }

}