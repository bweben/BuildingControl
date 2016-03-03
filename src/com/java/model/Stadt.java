package com.java.model;

import com.java.model.Hauspack.Haus;

import java.util.ArrayList;

/**
 * Created by Nathanael on 18.02.2016.
 */
public class Stadt {
    private ArrayList<Haus> hauses;

    public void neuerBauplatz(Haus haus) {
        hauses.add(haus);
    }
}
