package Ejercicios.ArraysPt1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej4_08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Cual es la longitud de la tabla?: ");
        int longitud = scan.nextInt();
        System.out.println("¿Fin del rango de pares?: ");
        int fin = scan.nextInt();
        int tabla[] = new int[longitud];
        tabla = rellenaPares(longitud,fin);
        System.out.println(Arrays.toString(tabla));
    }

    static int[] rellenaPares(int longitud, int fin) {
        int tabla[] = new int[longitud];        
        Random rand = new Random();
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = 2 + rand.nextInt((fin - 2) / 2) * 2;
            //Random rand = new Random();
            //startOfRange+rand.nextInt((endOfRange-startOfRange)/2) *2
        }
        Arrays.sort(tabla);
        return tabla;
    }
}
