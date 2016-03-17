package com.java.view;

import com.java.model.Building;
import com.java.model.Game;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Nathanael on 17.03.2016.
 */
public class BuildingsPanel extends JPanel {
    private ArrayList<BuildingButton> buildingButtons;

    public BuildingsPanel() {
        super();
        init();
    }

    private void init() {
        setLayout(new GridLayout(Game.getGameInstance().getBuildings().size() / 2,2));

        buildingButtons = new ArrayList<BuildingButton>();

        for (Building building : Game.getGameInstance().getBuildings()) {
            BuildingButton button = new BuildingButton();
            button.setBuilding(building);
            buildingButtons.add(button);
            add(button);
        }
    }
}
