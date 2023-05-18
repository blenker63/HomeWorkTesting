package com.prosky.homeworktesting2.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private final CalculatorService calculatorService = new CalculatorService();
    @Test
    public void calculatorPlusTest() {
        Number num1 = calculatorService.plusCalculator( 5 , 5);
        Number num2 = 10.0;
        Assertions.assertEquals(num1 , num2);

    }
}
