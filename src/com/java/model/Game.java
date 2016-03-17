package com.java.model;

import com.java.controller.HouseFactory;

import java.util.ArrayList;

/**
 * Created by Nathanael on 17.03.2016.
 */
public class Game {
    private static Game game;
    private ArrayList<Building> buildings;

    private Game() {
        buildings = new ArrayList<Building>();
        temporaric();
    }

    public static Game getGameInstance() {
        if (game == null) {
            game = new Game();
        }
        return game;
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    private void temporaric() {
        //TODO remove this method after finishing the project
        buildings.add(HouseFactory.getInstance().getHouse("Familyhouse"));
        buildings.add(HouseFactory.getInstance().getHouse("Flat"));
        buildings.add(HouseFactory.getInstance().getHouse("House"));
        buildings.add(HouseFactory.getInstance().getHouse("Houseboat"));
        buildings.add(HouseFactory.getInstance().getHouse("House"));
    }
}
