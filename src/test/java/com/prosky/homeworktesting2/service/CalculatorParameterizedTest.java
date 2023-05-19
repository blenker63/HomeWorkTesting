package com.prosky.homeworktesting2.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collection;
import java.util.List;

public class CalculatorParameterizedTest {
    private final CalculatorService calculatorService = new CalculatorService();

    private static Collection<Arguments> parameters() {
        return List.of(
                Arguments.of(5, 5),
                Arguments.of(-2, 5),
                Arguments.of(-2, -5),
                Arguments.of(2, -5));
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void calculatorPlusTest(int num1, int num2) {
        double actual = calculatorService.plusCalculator(num1, num2);
        double expected = num1 + num2;
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @MethodSource("parameters")
    public void calculatorMinusTest(int num1, int num2) {
        double actual = calculatorService.minusCalculator(num1, num2);
        double expected = num1 - num2;
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @MethodSource("parameters")
    public void calculatorMultiplyTest(int num1, int num2) {
        double actual = calculatorService.multiplyCalculator(num1, num2);
        double expected = num1 * num2;
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @MethodSource("parameters")
    public void calculatorDivideTest(double num1, double num2) {
        double actual = calculatorService.divideCalculator(num1, num2);
        double expected = num1 / num2;
        Assertions.assertEquals(expected, actual);
    }

}
