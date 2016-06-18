package com.java.testing;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by natha on 18.06.2016.
 */
public class KreisMockTest {
    private Graphics g = mock(Graphics.class);

    @Test
    public void zeichne() throws Exception {
        Kreis k = new Kreis(10,20,6);
        k.zeichne(g);
        verify(g, times(1)).drawOval(10,20,6,6);
    }
}