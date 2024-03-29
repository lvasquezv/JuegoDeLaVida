package com.juegodelavida;

import org.junit.Assert;
import org.junit.Test;

public class JuegoTest {

    @Test
    public void R1_CV_menosDeDosVecinasVivas_Muere() {
        boolean[][] tablero =
                {
                        {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, true, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                };
        boolean valor = Juego.obtenerEstadoSiguiente(tablero, 4, 2);
        Assert.assertFalse(valor);
    }

    @Test
    public void R2_CV_conDosTresVecinasVivas_Vive() {
        boolean[][] tablero =
                {
                        {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, true, false, false}
                        , {false, false, true, false, false}
                        , {false, false, true, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                };
        boolean valorActual = Juego.obtenerEstadoSiguiente(tablero, 4, 2);
        Assert.assertTrue(valorActual);
    }

    @Test
    public void R3_CV_conMasDeTresVecinasVivas_Muere() {
        boolean[][] tablero =
                {
                        {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, true, false, false}
                        , {false, true, true, true, false}
                        , {false, false, true, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                };
        boolean valorActual = Juego.obtenerEstadoSiguiente(tablero, 4, 2);
        Assert.assertFalse(valorActual);
    }

    @Test
    public void R4_CM_conTresVecinasVivas_Vive() {
        boolean[][] tablero =
                {
                        {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, true, false, false}
                        , {false, false, true, false, false}
                        , {false, false, true, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                };
        boolean valorActual = Juego.obtenerEstadoSiguiente(tablero, 3, 1);
        Assert.assertFalse(valorActual);
    }

    @Test
    public void T1_enviandoPosicionDeCeldaFueraDeRango() {
        boolean[][] tablero =
                {
                        {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, true, false, false}
                        , {false, false, true, false, false}
                        , {false, false, true, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                };
        boolean valorActual = Juego.obtenerEstadoSiguiente(tablero, -3, 100);
        Assert.assertFalse(valorActual);
    }

    @Test
    public void T2_enviandoR1enAlgunExtremoDelTablero() {
        boolean[][] tablero =
                {
                        {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {true, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                };
        boolean valor = Juego.obtenerEstadoSiguiente(tablero, 0, 2);
        Assert.assertFalse(valor);

    }

    @Test
    public void T3_obteniendoTableroCompleto_CasosR1R2R4() {
        boolean[][] tablero =
                {
                          {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, true, false, false, false}
                        , {false, true, false, false, false}
                        , {false, true, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                };
        tablero = Juego.generarTablero(tablero);
        boolean[][] tableroEsperado =
                {
                        {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {true, true, true, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                        , {false, false, false, false, false}
                };
        Assert.assertArrayEquals(tableroEsperado, tablero);
    }
}
