package com.juegodelavida;

import org.junit.Assert;
import org.junit.Test;

public class JuegoTest{

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
        boolean valor = Juego.obtenerEstadoSiguiente(tablero,2,4);
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
        boolean valorActual = Juego.obtenerEstadoSiguiente(tablero, 2, 4);
        Assert.assertTrue(valorActual);
    }
}
