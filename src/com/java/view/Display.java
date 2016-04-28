package com.java.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Nathanael on 10.03.2016.
 */
public class Display {
    private static MainFrame MAINFRAME;

    public void initUI() {
        MAINFRAME = new MainFrame("Buildings");
        MAINFRAME.setVisible(true);
    }

    public void refresh() {

    }
}
