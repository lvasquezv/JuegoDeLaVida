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

    public static boolean obtenerEstadoSiguiente(boolean[][] tablero, int f, int c)
    {
        if (!tieneVecinasVivas(tablero, f, c) )
            return false;
        else
            return true;
    }
    public static boolean tieneVecinasVivas(boolean[][] tablero, int f, int c){
        if (!tablero[f-1][c-1] && !tablero[f-1][c] && !tablero[f-1][c+1] && !tablero[f][c-1]
                && !tablero[f][c+1] && !tablero[f+1][c-1] && !tablero[f+1][c] && !tablero[f+1][c+1] )
            return false;
        else
            return true;
    }
}
