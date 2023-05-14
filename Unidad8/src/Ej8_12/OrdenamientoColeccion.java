
package Ej8_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class OrdenamientoColeccion {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        // Generar 20 números aleatorios y agregarlos a la colección
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int numero = random.nextInt(100); // Números aleatorios entre 0 y 99
            numeros.add(numero);
        }

        // Mostrar la colección original
        System.out.println("Colección original:");
        System.out.println(numeros);

        // Ordenar la colección de menor a mayor
        Collections.sort(numeros);

        // Convertir la colección en una tabla
        Integer[] tabla = numeros.toArray(new Integer[0]);

        // Convertir la tabla en una nueva colección
        List<Integer> coleccionOrdenadaMenorAMayor = new ArrayList<>();
        Collections.addAll(coleccionOrdenadaMenorAMayor, tabla);

        // Mostrar la colección ordenada de menor a mayor
        System.out.println("Colección ordenada de menor a mayor:");
        System.out.println(coleccionOrdenadaMenorAMayor);

        // Ordenar la colección de mayor a menor
        Collections.reverse(numeros);

        // Convertir la colección en una tabla
        tabla = numeros.toArray(new Integer[0]);

        // Convertir la tabla en una nueva colección
        List<Integer> coleccionOrdenadaMayorAMenor = new ArrayList<>();
        Collections.addAll(coleccionOrdenadaMayorAMenor, tabla);

        // Mostrar la colección ordenada de mayor a menor
        System.out.println("Colección ordenada de mayor a menor:");
        System.out.println(coleccionOrdenadaMayorAMenor);
    }
}

