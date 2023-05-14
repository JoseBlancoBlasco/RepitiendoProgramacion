
package Ej8_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Crear una colección para almacenar los números enteros aleatorios
        List<Integer> numeros = new ArrayList<>();

        // Generar 100 números enteros aleatorios entre 1 y 10 y agregarlos a la colección
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int numero = random.nextInt(10) + 1;
            numeros.add(numero);
        }

        // Mostrar la colección antes de la eliminación
        System.out.println("Colección original: " + numeros);

        // Crear una nueva lista y copiar los elementos que no sean iguales a 5
        List<Integer> numerosSinCinco = new ArrayList<>();
        for (int numero : numeros) {
            if (numero != 5) {
                numerosSinCinco.add(numero);
            }
        }

        // Sobrescribir la colección original con la nueva lista
        numeros.clear();
        numeros.addAll(numerosSinCinco);

        // Mostrar la colección después de la eliminación
        System.out.println("Colección después de la eliminación: " + numeros);
    }
}


