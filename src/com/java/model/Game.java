package com.java.model;

import com.java.controller.HouseFactory;
import com.java.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nathanael on 17.03.2016.
 */
public class Game {
    private static Game game;
    private ArrayList<Building> buildings;
    private List<Observer> observers = new ArrayList<Observer>();

    private Game() {
        buildings = new ArrayList<Building>();
    }

    public static Game getGameInstance() {
        if (game == null) {
            game = new Game();
        }
        return game;
    }

    public ArrayList<Building> getState() {
        return buildings;
    }

    public void setState(ArrayList<Building> state) {
        buildings = state;
        notifyAllObservers();
    }

    public void addBuilding(Building building) {
        buildings.add(building);
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }
}
