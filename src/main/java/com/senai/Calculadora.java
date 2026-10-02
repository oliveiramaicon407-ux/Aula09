package com.senai;

public class Calculadora {
    
    public double somar(double a, double b) {
        return a + b;
    }

    public double subtracao(double a, double b) {
        return a - b;
    }

    public double multiplicacao(double a, double b) {
        return a * b;
    }

    public double divisao(double n1, double n2) {
        if (n2 == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return n1 / n2;
    }
}
