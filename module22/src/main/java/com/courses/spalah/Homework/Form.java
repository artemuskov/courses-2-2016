package com.courses.spalah.Homework;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;

/**
 * Created by Artem Uskov on 12.10.2016.
 */
public class Form extends JFrame {
    private JPanel panel = new JPanel();

    public Form() {
        init();
    }

    public void init() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(800, 800);
        setResizable(false);
        setVisible(true);
        panel.setBackground(Color.lightGray);
        add(panel);
    }
}
