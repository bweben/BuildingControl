package com.java.view;

import com.java.interfaces.PanelInterface;
import com.java.model.House;

import javax.swing.*;

/**
 * Created by natha on 30.03.2016.
 */
public class LocationPanel extends JPanel implements PanelInterface {
    private House house;
    private JLabel address;

    public LocationPanel() {
        init();
    }

    public void init() {
        address = new JLabel();
        if (house != null) {
            refresh();
        }
        add(address);
    }

    public void refresh() {
        address.setText(house.getLocation().getAddress());
    }

    public void changeHouse(House house) {
        this.house = house;
        refresh();
    }
}
