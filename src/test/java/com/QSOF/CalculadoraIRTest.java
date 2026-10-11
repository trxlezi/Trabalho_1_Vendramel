package com.QSOF;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculadoraIRTest {

    private static final double TOLERANCIA = 0.000001;

    // C01 — Caminho P2
    @Test
    void deveRetornarZeroParaRendimentoIsento() {
        double resultado = CalculadoraIR.calcularIR(3500.00);

        assertEquals(0.00, resultado, TOLERANCIA);
    }

    // C02 — Caminho P3
    @Test
    void deveAplicarDescontoDe75PorCento() {
        double resultado = CalculadoraIR.calcularIR(5250.00);

        assertEquals(360.9375, resultado, TOLERANCIA);
    }

    // C03 — Caminho P4
    @Test
    void deveAplicarDescontoDe50PorCento() {
        double resultado = CalculadoraIR.calcularIR(5750.00);

        assertEquals(790.625, resultado, TOLERANCIA);
    }

    // C04 — Caminho P5
    @Test
    void deveAplicarDescontoDe25PorCento() {
        double resultado = CalculadoraIR.calcularIR(6250.00);

        assertEquals(1289.0625, resultado, TOLERANCIA);
    }

    // C05 — Caminho P6
    @Test
    void deveAplicarDescontoDe10PorCento() {
        double resultado = CalculadoraIR.calcularIR(7000.00);

        assertEquals(1732.5, resultado, TOLERANCIA);
    }

    // C06 — Caminho P7
    @Test
    void deveCalcularImpostoSemDesconto() {
        double resultado = CalculadoraIR.calcularIR(9000.00);

        assertEquals(2475.0, resultado, TOLERANCIA);
    }

    // C07 — Caminho P1
    @Test
    void deveRejeitarRendimentoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            CalculadoraIR.calcularIR(-0.01);
        });
    }
}