package com.courses.spalah;

import com.sun.jndi.cosnaming.IiopUrl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * Created by Artem Uskov on 26.09.2016.
 */
public class Form extends JFrame {
    JPanel panel = new JPanel();
    JButton buttonSave = new JButton("Save");
    JButton buttonRead = new JButton("Read");
    JTextField textFieldNameIn = new JTextField("First Name", 15);
    JTextField textFieldSurnameIn = new JTextField("Surname Name", 15);
    JTextField textFieldAddressIn = new JTextField("Address", 15);
    JTextField textFieldNameOut = new JTextField("First Name", 15);
    JTextField textFieldSurnameOut = new JTextField("Surname", 15);
    JTextField textFieldAddressOut = new JTextField("Address", 15);

    public Form() {
        super("Contacts");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(543, 363);
        setResizable(true);
        setVisible(true);
        panel.setLayout(null);
        panel.add(textFieldNameIn);
        textFieldNameIn.setBounds(20, 20, 120, 25);
        textFieldNameIn.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                textFieldNameIn.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                textFieldNameIn.setText("First Name");
            }
        });
        panel.add(textFieldSurnameIn);
        textFieldSurnameIn.setBounds(150, 20, 120, 25);
        panel.add(textFieldAddressIn);
        textFieldAddressIn.setBounds(280, 20, 200, 25);
        panel.add(buttonSave);
        buttonSave.setBounds(20, 50, 65, 65);
        add(panel);
        panel.requestFocus();
    }
}
