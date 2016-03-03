package com.java.model.Hauspack;

import com.java.model.Vermieter;

/**
 * Created by Nathanael on 2/4/2016.
 */
public class Einfamilienhaus extends Haus {
    private Vermieter eigentuemer;

    public void changeEingentuemer(Vermieter neu) {
        eigentuemer = neu;
    }
}
