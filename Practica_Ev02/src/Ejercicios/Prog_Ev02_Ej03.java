package Ejercicios;

import java.util.Random;

public class Prog_Ev02_Ej03 {

    public static void main(String[] args) {

    }

    int[] desordenar(int[] tabla) {
        int[] copia = tabla.clone();
        Random rand = new Random();
        for (int i = 0; i < copia.length; i++) {
            int index = rand.nextInt(copia.length - i);
            int temp = copia[index];
            copia[index] = copia[copia.length - i - 1];
            copia[copia.length - i - 1] = temp;
        }
        return copia;
    }
    
//    La función crea una copia del array original utilizando el método clone()
//    que es proporcionado por Java, y luego utiliza un algoritmo similar al
//    que se utilizó anteriormente para desordenar los valores de la copia.
//    Al final de la función, se devuelve la copia desordenada.

}
