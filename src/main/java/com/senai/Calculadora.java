package com.senai;

public class Calculadora {
    
    public int somar(int a, int b) {
        return a + b;
    }

    // O teste provavelmente vai pedir "subtracao" ou "subtrair". 
    // Vamos colocar os nomes padrão que batem com "multiplicacao" e "divisao"
    public int subtracao(int a, int b) {
        return a - b;
    }

    // Este é o método que causou o último erro:
    public int multiplicacao(int a, int b) {
        return a * b;
    }

    // Este é o método que causou o primeiro erro (mudado de 'dividir' para 'divisao'):
    public int divisao(int n1, int n2) {
        if (n2 == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return n1 / n2;
    }
}
