package Ejercicios;

public class Prog_Ev02_Ej06 {

    public static void main(String[] args) {

    }

    //Le paso el tablero y las dos posiciones
    //Si esta dentro del rango entonces se pueden mover entre ellas
    boolean comprobarPosicion(int tablero[][], int posX, int posY) {
        int filas = tablero.length;
        int columnas = tablero[0].length;
        return posX >= 0 && posX < filas && posY >= 0 && posY < columnas;
    }

}
