package com.java.testing;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by natha on 18.06.2016.
 */
public class Zeichnung {
    private List<Figur> figuren = new ArrayList<>();

    public void add(Figur f) {
        figuren.add(f);
    }

    public void zeichneFiguren(Graphics g) {
        for (Figur figur : figuren) {
            figur.zeichne(g);
        }
    }

    public Figur get(int ind) {
        return figuren.get(ind);
    }

    public List<Figur> get() {
        return figuren;
    }
}
