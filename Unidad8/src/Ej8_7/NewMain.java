package Ej8_7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class NewMain {
    public static void main(String[] args) {
        // Crear una colección para almacenar los números enteros aleatorios
        List<Integer> numeros = new ArrayList<>();

        // Generar 20 números enteros aleatorios entre 1 y 10 y agregarlos a la colección
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int numero = random.nextInt(10) + 1;
            numeros.add(numero);
        }

        // Crear una lista sin repeticiones usando un conjunto (Set)
        Set<Integer> numerosSinRepeticiones = new HashSet<>(numeros);
        List<Integer> listaSinRepeticiones = new ArrayList<>(numerosSinRepeticiones);

        // Imprimir los resultados
        System.out.println("Colección original: " + numeros);
        System.out.println("Lista sin repeticiones: " + listaSinRepeticiones);
    }
}
