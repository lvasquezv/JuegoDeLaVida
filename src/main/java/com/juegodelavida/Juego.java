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
        boolean cv = tablero[f][c];
        if (cv){
            if (cantidadVecinasVivas(tablero, f, c)<2 || cantidadVecinasVivas(tablero,f,c)> 3)
                return false;
            else
                return true;
        }else{
            if (cantidadVecinasVivas(tablero, f, c) ==3)
                return true;
            else
                return false;
        }

    }
    public static int cantidadVecinasVivas(boolean[][] tablero, int f, int c){
        int cantidad = 0;
        if (tablero[f-1][c-1]) cantidad++; if (tablero[f-1][c]) cantidad++; if (tablero[f-1][c+1]) cantidad++;
        if (tablero[f][c-1]) cantidad++; if (tablero[f][c+1]) cantidad++; if (tablero[f+1][c-1]) cantidad++;
        if (tablero[f+1][c]) cantidad++; if (tablero[f+1][c+1]) cantidad++;
        return cantidad;
    }
    public static boolean tieneVecinasVivas(boolean[][] tablero, int f, int c){
        if (!tablero[f-1][c-1] && !tablero[f-1][c] && !tablero[f-1][c+1] && !tablero[f][c-1]
                && !tablero[f][c+1] && !tablero[f+1][c-1] && !tablero[f+1][c] && !tablero[f+1][c+1] )
            return false;
        else
            return true;
    }
}
