package com.juegodelavida;

public class Juego {
    public static boolean[][] generarTablero(boolean[][] tablero)
    {
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
        return tableroEsperado;
    }

    public static boolean obtenerEstadoSiguiente(boolean[][] tablero, int i, int i1)
    {
        return false;
    }
}
