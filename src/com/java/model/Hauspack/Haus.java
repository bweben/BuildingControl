package com.java.model.Hauspack;

import com.java.model.Heizungpack.Heizung;
import com.java.model.Zimmer;

/**
 * Created by Nathanael on 2/4/2016.
 */
public class Haus {
    private boolean gebaut;
    private int hoehe;
    private int flaeche;
    private int breite;
    private int laenge;
    private Zimmer[] zimmers;
    private Heizung heizung;

    public Haus() {
        gebaut = false;
    }

    public void bauen() {
        gebaut = true;
    }
}
