package com.java.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Nathanael on 17.03.2016.
 */
public class MainFrame extends JFrame {
    private static BuildingsPanel BUILDINGSPAN;
    private static ControlsPanel CONTROLS;
    private static DetailsPanel DETAILS;
    private static Dimension SIZE;

    public MainFrame() {
        super();
        init();
    }

    public MainFrame(String title) {
        super(title);
        init();
    }

    private void init() {
        SIZE = new Dimension(900,500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(this.SIZE);

        BUILDINGSPAN = new BuildingsPanel();
        CONTROLS = new ControlsPanel();
        DETAILS = new DetailsPanel();

        add(CONTROLS, BorderLayout.NORTH);
        add(BUILDINGSPAN,BorderLayout.CENTER);
        add(DETAILS, BorderLayout.EAST);
    }
}
