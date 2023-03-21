package Ejercicios.BuclesForAnidados;

import java.util.Scanner;

public class Ej3_32 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce numero de filas: ");
        int filas = scan.nextInt();
        for (int i = filas; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
