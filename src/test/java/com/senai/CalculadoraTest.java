package com.senai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    void testSomar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    void testMultiplicacao() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicacao(3, 2);
        assertEquals(6, resultado);
    }

    @Test
    void testDivisao() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.divisao(6, 2);
        assertEquals(3, resultado);
    }
}



