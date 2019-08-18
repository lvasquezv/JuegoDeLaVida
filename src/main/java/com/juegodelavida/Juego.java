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
        if (!tablero[i-1][i1-1] && !tablero[i-1][i1] && !tablero[i-1][i1+1] && !tablero[i][i1-1]
                && !tablero[i][i1+1] && !tablero[i+1][i1-1] && !tablero[i+1][i1] && !tablero[i+1][i1+1] )
            return false;
        else
            return true;
    }
}
