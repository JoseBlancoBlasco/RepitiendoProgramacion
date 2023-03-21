package Ejercicios.BuclesWhile;

import java.util.Scanner;

public class Ej3_22 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce altura en cm: ");
        int arbol = scan.nextInt();
        int contador = 0;
        int arbolAlto = 0;
        while (arbol > 0) {
            if (arbol > arbolAlto) {
                arbolAlto = arbol;
            }
            contador++;
            System.out.println("Introduce altura en cm: ");
            arbol = scan.nextInt();
        }
        System.out.println("El arbol mas alto es: " + contador + " con una altura de " + arbolAlto + "cm.");
    }

}
