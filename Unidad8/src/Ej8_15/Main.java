
package Ej8_15;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Set<Integer> conjuntoSinRepetir = new HashSet<>();
        Set<Integer> conjuntoRepetidos = new HashSet<>();
        Set<Integer> conjuntoUnicos = new HashSet<>();

        // Insertar 20 enteros aleatorios entre 1 y 10 en la lista
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int numero = random.nextInt(10) + 1;
            lista.add(numero);
        }

        // Crear los conjuntos de elementos sin repetir, repetidos y únicos
        for (int numero : lista) {
            if (!conjuntoSinRepetir.add(numero)) {
                conjuntoRepetidos.add(numero);
            }
        }

        for (int numero : conjuntoSinRepetir) {
            if (!conjuntoRepetidos.contains(numero)) {
                conjuntoUnicos.add(numero);
            }
        }

        // Mostrar los resultados
        System.out.println("Lista original: " + lista);
        System.out.println("Conjunto sin repetir: " + conjuntoSinRepetir);
        System.out.println("Conjunto de repetidos: " + conjuntoRepetidos);
        System.out.println("Conjunto de elementos únicos: " + conjuntoUnicos);
    }
}

