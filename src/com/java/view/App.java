package com.java.view;

/**
 * Created by Nathanael on 2/4/2016.
 */
public class App {
    private static Display display;

    public static void main(String[] args) {
        display = new Display();
        display.initUI();
    }
}
