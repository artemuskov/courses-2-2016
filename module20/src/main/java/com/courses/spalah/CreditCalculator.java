package com.courses.spalah;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Artem Uskov on 01.10.2016.
 */
public class CreditCalculator {

    private float totalBuySumm;
    private float prepaidPercent;
    private float oneTimeCommisionPercent;
    private float everyMounthCommisionPercent;
    private float annualRatePercent;
    private Integer termOfCredit;
    private float oneTimeCommisionSumm;
    private float everyMounthCommisionSumm;
    static CreditCalculatorForm form;

    void setVariables() {
        totalBuySumm = form.getTotalBuySumm();
        prepaidPercent = form.getPrepaidPercent();
        oneTimeCommisionPercent = form.getOneTimeCommisionPersent();
        everyMounthCommisionPercent = form.getEveryMounthCommisionPercent();
        annualRatePercent = form.getAnnualRatePercent();
        termOfCredit = form.getTermOfCredit();
        oneTimeCommisionSumm = form.getOneTimeCommisionSumm();
        everyMounthCommisionSumm = form.getEveryMonthCommisionSumm();
    }

    public void addListenerOnButton() {
        CreditCalculatorForm.calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVariables();
            }
        });
    }

    public static void main(String[] args) {

        form = new CreditCalculatorForm();
    }

    public void calculatePrepaidSumm() {

    }


}
