package Ejercicios.ArraysPt1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4_11 {

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
        System.out.println("La tabla sin repetidos: ");
        System.out.println(Arrays.toString(sinRepetir(tabla)));
    }

    public static int[] sinRepetir(int[] a) {
        Arrays.sort(a);
        int len = a.length;
        int j = 0;
        for (int i = 0; i < len - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
        }
        a[j++] = a[len - 1];
        int[] c = new int[j];
        for (int k = 0; k < j; k++) {
            c[k] = a[k];
        }
        return c;
    }

}
