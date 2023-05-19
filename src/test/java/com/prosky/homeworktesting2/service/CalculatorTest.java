package com.prosky.homeworktesting2.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    double num1 = 5;
    double num2 = 5;
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void calculatorPlusTest() {
        double actual = calculatorService.plusCalculator(num1, num2);
        double expected = num1 + num2;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void calculatorMinusTest() {
        double actual = calculatorService.minusCalculator(num1, num2);
        double expected = num1 - num2;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void calculatorMultiplyTest() {
        double actual = calculatorService.multiplyCalculator(num1, num2);
        double expected = num1 * num2;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void calculatorDivideTest() {
        double actual = calculatorService.divideCalculator(num1, num2);
        double expected = num1 / num2;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void calculatorDivideExceptionTest() {
        num2 = 0;
        Assertions.assertThrows(IllegalArgumentException.class,
        ( ) -> calculatorService.divideCalculator(num1, num2));
    }

}
