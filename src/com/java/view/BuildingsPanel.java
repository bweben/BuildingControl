package com.java.view;

import com.java.interfaces.Observer;
import com.java.interfaces.PanelInterface;
import com.java.listener.ButtonListener;
import com.java.model.Building;
import com.java.model.BuildingsPanelObserver;
import com.java.model.Game;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Nathanael on 17.03.2016.
 */
public class BuildingsPanel extends JPanel implements PanelInterface {
    private ArrayList<BuildingButton> buildingButtons;
    private Observer observer;

    public BuildingsPanel() {
        super();
        buildingButtons = new ArrayList<BuildingButton>();
        new BuildingsPanelObserver(this);
        init();
    }

    public void attach(Observer observer) {
        this.observer = observer;
    }

    public void init() {
        setLayout(new GridLayout(Game.getGameInstance().getBuildings().size() / 2,2));
        refresh();
    }

    public void refresh() {
        buildingButtons.clear();
        removeAll();
        for (Building building : Game.getGameInstance().getBuildings()) {
            BuildingButton button = new BuildingButton();
            button.setBuilding(building);
            button.addMouseListener(new ButtonListener(building));
            buildingButtons.add(button);
            add(button);
        }
        repaint();
        doLayout();
    }
}
