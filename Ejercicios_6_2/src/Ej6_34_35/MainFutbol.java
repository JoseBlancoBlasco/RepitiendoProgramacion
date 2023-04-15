
package Ej6_34_35;

import java.util.Arrays;

public class MainFutbol {

    public static void main(String[] args) {
        Futbolista[] futbolistas = new Futbolista[5];
        futbolistas[0] = new Futbolista("12345678A", "Oliver Aton", 29, 678);
        futbolistas[1] = new Futbolista("23456789B", "Julian Ross", 36, 780);
        futbolistas[2] = new Futbolista("34567890C", "Mark Lenders", 29, 206);
        futbolistas[3] = new Futbolista("45678901D", "Tom Baker", 29, 116);
        futbolistas[4] = new Futbolista("56789012E", "Dani Mellow", 21, 82);

        // Ordenar por DNI usando Comparable
        Arrays.sort(futbolistas);
        System.out.println("Ordenados por DNI:");
        for (Futbolista f : futbolistas) {
            System.out.println(f);
        }

        // Ordenar por nombre usando Comparator
        Arrays.sort(futbolistas, new ComparaNombres());
        System.out.println("\nOrdenados por nombre:");
        for (Futbolista f : futbolistas) {
            System.out.println(f);
        }

        // Ordenar por edad y luego por nombre usando Comparator
        Arrays.sort(futbolistas, new ComparaEdad().thenComparing(new ComparaNombres()));
        System.out.println("\nOrdenados por edad y luego por nombre:");
        for (Futbolista f : futbolistas) {
            System.out.println(f);
        }
    }

}

