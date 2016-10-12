package com.courses.spalah;

import com.courses.spalah.Homework.CalculationManager;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

/**
 * Created by Artem Uskov on 03.10.2016.
 */
@RunWith(JUnit4.class)
public class CalculationManagerTest {

    CalculationManager calculations;


    @Before
    public void setUp() {
        calculations = new CalculationManager();
    }

    @Test
    public void prepaidSummTest() {
        assertEquals(2000, calculations.calculatePrepaidSumm(10000, 20), 0.01);
    }

    @Test
    public void creditSummTest() {
        assertEquals(8000, calculations.calculateCreditSumm(10000, 2000), 0.01);
    }

    @Test
    public void oneTimeComissionTest() {
        float creditSumm = 8000;
        float oneTimeCommisionPercent = 2;
        float oneTimeCommisionSumm = 80;
        assertEquals(240, calculations.calculateOneTimeCommision(), 0.01);
    }
}
