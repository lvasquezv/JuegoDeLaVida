package com.juegodelavida;

import org.junit.Assert;
import org.junit.Test;

public class JuegoTest {
    @Test
    public void R1_CV_menosDeDosVecinasVivas_Muere() {
        boolean[][] tablero = new boolean[5][5];
        boolean[][] tableroEsperado = new boolean[5][5];
        tablero = Juego.generarTablero(tablero);
        Assert.assertArrayEquals(tablero, tableroEsperado);
    }
}
