package com.prosky.homeworktesting2.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    public void calculatorPlusTest() {
        double actual1 = calculatorService.plusCalculator(5 , 5);
        Assertions.assertEquals(10 , actual1);
        double actual2 = calculatorService.plusCalculator(-2 , 5);
        Assertions.assertEquals(3 , actual2);
        double actual3 = calculatorService.plusCalculator(2 , -5);
        Assertions.assertEquals(-3 , actual3);
    }

    @Test
    public void calculatorMinusTest() {
        double actual1 = calculatorService.minusCalculator(5 , 5);
        Assertions.assertEquals(actual1, 0);
        double actual2 = calculatorService.minusCalculator(-2 , 5);
        Assertions.assertEquals(actual2, -7);
        double actual3 = calculatorService.minusCalculator(2 , -5);
        Assertions.assertEquals(actual3, 7);
    }

    @Test
    public void calculatorMultiplyTest() {
        double actual1 = calculatorService.multiplyCalculator(5 , 5);
        Assertions.assertEquals(25 , actual1);
        double actual2 = calculatorService.multiplyCalculator(-2 , 5);
        Assertions.assertEquals(-10 , actual2);
        double actual3 = calculatorService.multiplyCalculator(-2 , -5);
        Assertions.assertEquals(10 , actual3);
    }

    @Test
    public void calculatorDivideTest() {
        double actual1 = calculatorService.divideCalculator(5 , 5);
        Assertions.assertEquals(1 , actual1);
        double actual2 = calculatorService.divideCalculator(-2 , 5);
        Assertions.assertEquals(-0.4 , actual2);
        double actual3 = calculatorService.divideCalculator(-2 , -5);
        Assertions.assertEquals(0.4 , actual3);
    }

    @Test
    public void calculatorDivideExceptionTest() {
        Assertions.assertThrows(IllegalArgumentException.class,
        ( ) -> calculatorService.divideCalculator(5 , 0));
    }
}
