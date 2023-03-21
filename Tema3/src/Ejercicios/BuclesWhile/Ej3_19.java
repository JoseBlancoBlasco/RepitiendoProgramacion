package Ejercicios.BuclesWhile;

import java.util.Scanner;

public class Ej3_19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce numeros, cero para salir.");
        int num = scan.nextInt();
        while (num != 0) {
            if (num % 2 == 0) {
                System.out.println("Es par.");
            } else {
                System.out.println("Es impar.");
            }
            if (num > 0) {
                System.out.println("Es positivo.");
            } else {
                System.out.println("Es negativo.");
            }
            System.out.println("El cuadrado es: " + num * num);
            System.out.println("Introduce otro numero, cero para salir: ");
            num = scan.nextInt();
        }
        System.out.println("Adios!");
    }

}
