package com.example.simplecalctest;

public class Calculator {
    public enum Operator {ADD, SUB, DIV, MUL, POW}

    public double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    public double sub(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    public double div(double firstOperand, double secondOperand) {
        if (secondOperand == 0)
            throw new IllegalArgumentException();
        return firstOperand / secondOperand;
    }

    public double mull(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

    public double pow(double firstOperand, double secondOperand) {
        if (firstOperand == 0 && secondOperand < 0)
            throw new IllegalArgumentException();
        return Math.pow(firstOperand, secondOperand);
    }
}
