package com.senai;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcPotenciaTest {

    @Test
    void testCalcularPotencia() {
        CalcPotencia calc = new CalcPotencia();
        double resultado = calc.calcularPotencia(220, 5);
        assertEquals(1100.0, resultado);
    }
}