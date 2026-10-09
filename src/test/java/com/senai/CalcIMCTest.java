package com.senai;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcIMCTest {
    @Test 

    void testCalcularIMC() {
        CalcIMC calcIMC = new CalcIMC();
        double resultado = calcIMC.calcularIMC(70, 1.75);
        assertEquals(22.857142857142858, resultado);
    }
    @Test
    void testCalcularIMCAlturaInvalida() {
        CalcIMC calcIMC = new CalcIMC();
        assertThrows(IllegalArgumentException.class, () -> {
            calcIMC.calcularIMC(70, -1.75);
        });
    }
}
