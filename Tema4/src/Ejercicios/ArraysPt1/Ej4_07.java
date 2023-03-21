package Ejercicios.ArraysPt1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4_07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Cual es la longitud de la tabla?: ");
        int longitud = scan.nextInt();
        int tabla[] = new int[longitud];        
        System.out.println("Rellena la tabla.");
        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Posicion " + i + " :");
            tabla[i]=scan.nextInt();
        }
        int maxNum = maximo(tabla);
        System.out.println("El numero maximo es : " + maxNum);
    }

    static int maximo(int t[]) {
        Arrays.sort(t);
        int max = t[t.length - 1];
        return max;        
    }
}
