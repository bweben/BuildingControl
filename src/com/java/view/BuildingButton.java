package com.java.view;

import com.java.model.Building;

import javax.swing.*;

/**
 * Created by Nathanael on 17.03.2016.
 */
public class BuildingButton extends JButton {
    private Building building;

    public BuildingButton() {
        super();
    }

    public BuildingButton(String text) {
        super(text);
    }

    public void setBuilding(Building building) {
        this.building = building;
        setText(building.getTypeName());
    }
}
