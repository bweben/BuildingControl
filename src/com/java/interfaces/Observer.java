package com.java.interfaces;

import com.java.model.Game;

import java.util.Objects;

/**
 * Created by Nathanael on 24.03.2016.
 * For the change in the buildings arraylist to notify the BuildingsPanel.
 * http://www.tutorialspoint.com/design_pattern/observer_pattern.htm
 */
public abstract class Observer {
    protected Object subject;
    public abstract void update();
}
