package Ejercicios;

import java.util.Random;

public class Prog_Ev02_Ej02 {

    public static void main(String[] args) {

    }    

    void desordenar(int[] tabla) {
        int[] copia = tabla.clone();
        Random rand = new Random();
        for (int i = 0; i < tabla.length; i++) {
            int index = rand.nextInt(tabla.length - i);
            tabla[i] = copia[index];
            copia[index] = copia[tabla.length - i - 1];
        }
    }
//    La función crea una copia del array original, y en cada iteración
//    se elige un elemento aleatorio dentro del rango de elementos
//    no seleccionados, se intercambia con el elemento actual y se elimina
//    de la copia para evitar duplicidades.

}