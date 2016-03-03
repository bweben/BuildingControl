package com.java.model.Hauspack;

import com.java.model.Mieter;
import com.java.model.Vermieter;

import java.util.ArrayList;

/**
 * Created by Nathanael on 2/4/2016.
 */
public class Mehrfamilienhaus extends Haus {
    private ArrayList<Mieter> mieters;
    private Vermieter vermieter;

    public Mehrfamilienhaus() {
        mieters = new ArrayList<Mieter>();
    }

    public void addMieter(Mieter mieter) {
        mieters.add(mieter);
    }
}
