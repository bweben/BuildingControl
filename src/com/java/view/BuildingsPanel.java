package com.java.view;

import com.java.listener.ButtonListener;
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
        buildingButtons = new ArrayList<BuildingButton>();
        init();
    }

    private void init() {
        setLayout(new GridLayout(Game.getGameInstance().getBuildings().size() / 2,2));

        for (Building building : Game.getGameInstance().getBuildings()) {
            BuildingButton button = new BuildingButton();
            button.setBuilding(building);
            button.addMouseListener(new ButtonListener(building));
            buildingButtons.add(button);
            add(button);
        }
    }
}
