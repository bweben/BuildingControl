package com.java.listener;

import com.java.controller.HouseFactory;
import com.java.model.Game;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by Nathanael on 24.03.2016.
 */
public class NewBuildingListener implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        Game.getGameInstance().addBuilding(HouseFactory.getInstance().getHouse("Familyhouse"));
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
