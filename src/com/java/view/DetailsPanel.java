package com.java.view;

import com.java.interfaces.Observer;
import com.java.interfaces.PanelInterface;
import com.java.model.Building;
import com.java.model.DetailsPanelObserver;
import com.java.model.House;

import javax.swing.*;

/**
 * Created by Nathanael on 17.03.2016.
 */

public class DetailsPanel extends JPanel implements PanelInterface {
    private JLabel rooms;
    private JLabel houseType;
    private LocationPanel locationPan;
    private House house;
    private static Observer OBSERVER;

    public DetailsPanel() {
        super();
        new DetailsPanelObserver(this,house);
        init();
    }

    public DetailsPanel(House house) {
        super();
        init();
    }

    public void init() {
        rooms = new JLabel();
        houseType = new JLabel();
        locationPan = new LocationPanel();

        if (house != null) {
            refresh();
        }

        add(rooms);
        add(houseType);
        add(locationPan);
    }

    public void refresh() {
        rooms.setText(String.valueOf(house.getRooms()));
        houseType.setText(String.valueOf(house.getTypeName()));
        locationPan.changeHouse(house);
    }

    public void changeBuilding(Building building) {
        this.house = (House) building;
        refresh();
    }

    public void attach(Observer observer) {
        OBSERVER = observer;
    }

    public static DetailsPanelObserver getObserver() {
        return (DetailsPanelObserver) OBSERVER;
    }
}
