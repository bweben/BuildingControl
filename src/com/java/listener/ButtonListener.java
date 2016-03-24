package com.java.listener;

import com.java.model.Building;

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
        System.out.println(building.getTypeName());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
