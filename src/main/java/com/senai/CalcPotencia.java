package com.senai;

public class CalcPotencia {

    public double calcularPotencia(double tensao, double corrente) {
        return tensao * corrente;
    }

    public static void main(String[] args) {
        CalcPotencia calc = new CalcPotencia();
        double potencia = calc.calcularPotencia(220, 5);
        System.out.println("Potência: " + potencia + "W");
    }
}