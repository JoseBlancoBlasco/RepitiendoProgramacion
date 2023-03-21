package Ejercicios.ArraysPt1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4_05 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float tabla[] = new float[5];
        System.out.println("Introduce 5 numeros decimales: ");
        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Posicion "+i+" : ");
            tabla[i]= scan.nextFloat();
        }
        System.out.println(Arrays.toString(tabla));
        
    }

}
