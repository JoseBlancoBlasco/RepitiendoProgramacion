package Ejercicios.ArraysPt1;

import java.util.Scanner;

public class Ej4_06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Cual es la longitud de la tabla?: ");
        int longitud = scan.nextInt();
        int tabla[] = new int[longitud];
        System.out.println("Rellena la tabla.");
        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Posicion " + i + " :");
            tabla[i] = scan.nextInt();
        }
        for (int i = tabla.length - 1; i >= 0; i--) {
            System.out.println(tabla[i]);
        }
    }

}
