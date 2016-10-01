package com.courses.spalah;

import javax.swing.*;

import static com.sun.glass.ui.Cursor.setVisible;

/**
 * Created by Artem Uskov on 01.10.2016.
 */
public class CreditCalculatorForm extends JFrame{

    private JPanel panel = new JPanel();
    private JTextField totalBuySumm = new JTextField("Сумма покупки");
    private JTextField prepaidPercent = new JTextField("Аванс, %");
    private JTextField oneTimeCommisionPercent = new JTextField("Одноразовая комиссия, %");
    private JTextField everyMounthCommisionPercent = new JTextField("Ежемесячная комиссия, %");
    private JTextField annualRatePercent = new JTextField("Ставка, % годовых");
    private Integer[] listOfTerms = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private JComboBox termOfCredit = new JComboBox(listOfTerms);
    private JTextField oneTimeCommisionSumm = new JTextField("Одноразовая комиссия, сумма");
    private JTextField getEveryMounthCommisionSumm = new JTextField("Ежемесячная комиссия, сумма");

    public CreditCalculatorForm() {
        super("Credit Calculator");
        init();
    }

    public void init() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 400);
        setResizable(true);
        setVisible(true);
        panel.setLayout(null);

        add(panel);

    };


}
