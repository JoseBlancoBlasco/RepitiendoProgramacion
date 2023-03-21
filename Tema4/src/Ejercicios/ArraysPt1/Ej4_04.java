package Ejercicios.ArraysPt1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4_04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Cual es la longitud de la tabla?: ");
        int longitud = scan.nextInt();
        int tabla[] = new int[longitud];
        int ceros =0;
        float positivos=0;
        float negativos=0;
        System.out.println("Rellena la tabla.");
        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Posicion " + i + " :");
            tabla[i]=scan.nextInt();
            if (tabla[i]==0) {
                ceros++;
            }
            if (tabla[i]>0) {
                positivos+=tabla[i];
            }
            if (tabla[i]<0) {
                negativos-=tabla[i];
            }
        }        
        System.out.println("El numero de ceros es: " + ceros);
        System.out.println("La media de positivos es: " + positivos/longitud);
        System.out.println("La media de negativos es: " + (Math.abs(negativos)/longitud));
        System.out.println(Arrays.toString(tabla));
    }
}
