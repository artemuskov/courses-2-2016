package com.courses.spalah;

import com.sun.jndi.cosnaming.IiopUrl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Artem Uskov on 26.09.2016.
 */
public class Form extends JFrame {
    private JPanel panel = new JPanel();
    private JButton buttonSave = new JButton("Save");
    private JButton buttonRead = new JButton("Read");
    private JTextField textFieldNameIn = new JTextField("First Name", 15);
    private JTextField textFieldSurnameIn = new JTextField("Surname", 15);
    private JTextField textFieldAddressIn = new JTextField("Address", 15);
    private JTextField textFieldNameOut = new JTextField("First Name", 15);
    private JTextField textFieldSurnameOut = new JTextField("Surname", 15);
    private JTextField textFieldAddressOut = new JTextField("Address", 15);
    private JTextField textFieldId = new JTextField();
    private JLabel label = new JLabel("");

    public Form() {
        super("Contacts");
        this.init();
    }

    public void init() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(543, 363);
        setResizable(true);
        setVisible(true);
        panel.setLayout(null);
        panel.add(textFieldNameIn);
        textFieldNameIn.setBounds(20, 20, 120, 25);
        textFieldNameIn.addFocusListener(new Focus(textFieldNameIn));
        panel.add(textFieldSurnameIn);
        textFieldSurnameIn.setBounds(150, 20, 120, 25);
        textFieldSurnameIn.addFocusListener(new Focus(textFieldSurnameIn));
        panel.add(textFieldAddressIn);
        textFieldAddressIn.setBounds(280, 20, 200, 25);
        textFieldAddressIn.addFocusListener(new Focus(textFieldAddressIn));
        panel.add(buttonSave);
        buttonSave.setBounds(20, 50, 65, 65);
        buttonSave.setBackground(Color.GREEN);
        panel.add(buttonRead);
        buttonRead.setBounds(20, 130, 65, 65);
        buttonRead.setBackground(Color.CYAN);
        panel.add(label);
        label.setBounds(120, 50, 70, 70);
        panel.add(textFieldId);
        textFieldId.setBounds(120, 150, 25, 25);
        panel.add(textFieldNameOut);
        panel.add(textFieldSurnameOut);
        panel.add(textFieldAddressOut);
        textFieldNameOut.setBounds(20, 220, 120, 25);
        textFieldSurnameOut.setBounds(150, 220, 120, 25);
        textFieldAddressOut.setBounds(280, 220, 200, 25);
        buttonRead.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(textFieldId.getText());
                DataManager data = new DataManager();
                try {
                    Person person = data.readPerson(id);
                    textFieldNameOut.setText(person.getName());
                    textFieldSurnameOut.setText(person.getSurname());
                    textFieldAddressOut.setText(person.getAddress());
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        add(panel);
        panel.requestFocus();
    }

    public String getInputName() {
        return textFieldNameIn.getText();
    }

    public String getInputSurname() {
        return textFieldSurnameIn.getText();
    }

    public String getInputAddress() {
        return textFieldAddressIn.getText();
    }

    public void setOutputName(String s) {
        textFieldNameOut.setText(s);
    }

    public void setOutputSurname(String s) {
        textFieldSurnameOut.setText(s);
    }

    public void setOutputAddress(String s) {
        textFieldAddressOut.setText(s);
    }
}

class Focus implements FocusListener {
    private JTextField textField;

    Focus(JTextField field) {
        this.textField = field;
    }

    @Override
    public void focusGained(FocusEvent e) {
        if(textField.getText().equals("First Name") || textField.getText().equals("Surname") || textField.getText().equals("Address")) {
            textField.setText("");
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
    }
}
