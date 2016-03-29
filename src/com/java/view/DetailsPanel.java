package com.java.view;

import com.java.model.House;

import javax.swing.*;

/**
 * Created by Nathanael on 17.03.2016.
 */

public class DetailsPanel extends JPanel {
    private JLabel rooms;
    private House house;

    public DetailsPanel() {
        super();
    }

    public DetailsPanel(House house) {
        super();
        init();
    }

    private void init() {
        rooms = new JLabel(String.valueOf(house.getRooms()));
    }

    public void addHouse(House house) {
        this.house = house;
    }
}
