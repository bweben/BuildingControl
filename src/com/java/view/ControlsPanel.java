package com.java.view;

import com.java.listener.NewBuildingListener;

import javax.swing.*;

/**
 * Created by Nathanael on 17.03.2016.
 */
public class ControlsPanel extends JPanel {
    private static JButton newBuilding;

    public ControlsPanel() {
        super();
        init();
    }

    private void init() {
        newBuilding = new JButton("new Building");
        newBuilding.addMouseListener(new NewBuildingListener());
    }
}
