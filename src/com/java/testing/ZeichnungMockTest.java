package com.java.testing;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import java.awt.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Created by natha on 18.06.2016.
 */
public class ZeichnungMockTest {
    private Graphics g = mock(Graphics.class);
    private Zeichnung zeichnung;

    @Before
    public void setUp() throws Exception {
        zeichnung = new Zeichnung();
        FigurParser fp = new FigurParser(new FigurFileStubDAO());
        for (Figur figur : fp.parse()) {
            zeichnung.add(figur);
        }
    }

    @Test
    public void zeichneFiguren() throws Exception {
        InOrder order = inOrder(g);

        zeichnung.zeichneFiguren(g);
        Rechteck f1 = (Rechteck) zeichnung.get(0);
        order.verify(g).drawRect(f1.x,f1.y,f1.breite,f1.hoehe);
        Kreis k1 = (Kreis) zeichnung.get(1);
        order.verify(g).drawOval(k1.x,k1.y,k1.radius,k1.radius);
        Linie l1 = (Linie) zeichnung.get(2);
        order.verify(g).drawLine(l1.x,l1.y,l1.endx,l1.endy);
    }

}