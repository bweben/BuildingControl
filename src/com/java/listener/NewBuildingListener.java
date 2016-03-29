package com.java.listener;

import com.java.controller.HouseFactory;
import com.java.model.Game;
import com.java.model.Houses;

import javax.swing.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by Nathanael on 24.03.2016.
 */
public class NewBuildingListener implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        Object[] posibilities = Houses.values();
        JFrame frame = new JFrame();
        Icon icon = UIManager.getIcon("OptionPane.InformationIcon");
        Houses house = (Houses) JOptionPane.showInputDialog(frame,"Select the building you want","Select building",JOptionPane.PLAIN_MESSAGE,icon,posibilities,Houses.FAMILYHOUSE);
        Game.getGameInstance().addBuilding(HouseFactory.getInstance().getHouse(house));
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
