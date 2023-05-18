package com.prosky.homeworktesting2.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String helloCalculator() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public double plusCalculator(double num1, double num2) {
        return num1 + num2;
    }

    public int minusCalculator(int num1, int num2) {
        return num1 - num2;
    }

    //    public String multiplyCalculator(int num1, int num2) {
    public int multiplyCalculator(int num1, int num2) {
//        return String.valueOf(num1 * num2);
        return num1 * num2;
    }

    public double divideCalculator(double num1, double num2) {
        if (num2 != 0)
            return  num1 / num2;
        else
            throw new IllegalArgumentException("Делить на 0 нельзя");
    }
}
