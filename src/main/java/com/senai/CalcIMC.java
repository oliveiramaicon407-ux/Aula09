package com.senai;

public class CalcIMC {
    public double calcularIMC(double peso, double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("A altura deve ser maior que zero.");
        }
        return peso / (altura * altura);
    }

    public static void main(String[] args) {
        CalcIMC calcIMC = new CalcIMC();
        double resultado = calcIMC.calcularIMC(70, 1.75);
        System.out.println("IMC: " + resultado);
    }
}