package com.juegodelavida;

import org.junit.Assert;
import org.junit.Test;

public class JuegoTest {
    @Test
    public void R1_CV_menosDeDosVecinasVivas_Muere() {
        boolean[][] tablero =
        {
                 {false,false,false,false,false}
                ,{false,false,false,false,false}
                ,{false,false,false,false,false}
                ,{false,false,false,false,false}
                ,{false,false,true ,false,false}
                ,{false,false,false,false,false}
                ,{false,false,false,false,false}
                ,{false,false,false,false,false}
                ,{false,false,false,false,false}
                ,{false,false,false,false,false}
        };
        boolean[][] tableroEsperado =
        {
                {false,false,false,false,false}
                ,{false,false,false,false,false}
                ,{false,false,false,false,false}
                ,{false,false,false,false,false}
                ,{false,false,false,false,false}
                ,{false,false,false,false,false}
                ,{false,false,false,false,false}
                ,{false,false,false,false,false}
                ,{false,false,false,false,false}
                ,{false,false,false,false,false}
        };

        tablero = Juego.generarTablero(tablero);
        Assert.assertArrayEquals(tablero, tableroEsperado);
    }
}
