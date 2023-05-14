
package Ej8_9;

import java.util.ArrayList;
import java.util.Iterator;
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

        // Eliminar todos los elementos que valen 5 utilizando un Iterator
        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            int numero = iterator.next();
            if (numero == 5) {
                iterator.remove();
            }
        }

        // Mostrar la colección después de la eliminación
        System.out.println("Colección después de la eliminación: " + numeros);
    }
}


