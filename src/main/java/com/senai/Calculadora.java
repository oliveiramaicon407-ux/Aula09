package com.senai;

public class Calculadora {
    
    public double somar(double a, double b) {
        return a + b;
    }

    // O teste provavelmente vai pedir "subtracao" ou "subtrair". 
    // Vamos colocar os nomes padrão que batem com "multiplicacao" e "divisao"
    public double subtracao(double a, double b) {
        return a - b;
    }

    // Este é o método que causou o último erro:
    public double multiplicacao(double a, double b) {
        return a * b;
    }

    // Este é o método que causou o primeiro erro (mudado de 'dividir' para 'divisao'):
    public double divisao(double n1, double n2) {
        if (n2 == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return n1 / n2;
    }
}
