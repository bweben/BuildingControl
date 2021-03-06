package com.java.listener;

import com.java.model.Building;
import com.java.view.BuildingButton;
import com.java.view.DetailsPanel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by Nathanael on 10.03.2016.
 */
public class ButtonListener implements MouseListener {
    private Building building;

    public ButtonListener(Building building) {
        this.building = building;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        DetailsPanel.getObserver().update(this.building);
        System.out.println(this.building.getTypeName());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        ((BuildingButton) e.getSource()).setPersons();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        ((BuildingButton) e.getSource()).unsetPersons();
    }
}
