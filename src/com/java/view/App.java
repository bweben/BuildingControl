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

/*
technische Klassen = berechnen etwas und geben etwas zurück, beispielsweise Math
fachliche Klassen = verwenden technische Klassen und berechnen selbst nicht wirklich etwas, beispielsweise häufig GUI-Klassen.
 */