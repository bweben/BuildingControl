package com.java.view;

import com.java.listener.myListener;

import javax.swing.*;

/**
 * Created by Nathanael on 2/4/2016.
 */
public class App {
    public static void main(String[] args) {
        myFrame jFrame = new myFrame("New Jframe");
        jFrame.addMouseListener(new myListener());
        jFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
        JPanel jPanel = new JPanel();
        JButton einfamilienhausBtn = new JButton("neues Einfamilienhaus");
        einfamilienhausBtn.addMouseListener(new myListener());
        JButton mehrfamilienhausBtn = new JButton("neues Mehrfamilienhaus");
        einfamilienhausBtn.addMouseListener(new myListener());
        jFrame.add(jPanel);
        jFrame.setVisible(true);
    }
}
