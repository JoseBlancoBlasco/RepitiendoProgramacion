package Ejercicios.BuclesForAnidados;

import java.util.Scanner;

public class Ej3_37 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Cuantas filas para el triangulo de Pascal?");
        int n = scan.nextInt();
        printPascal(n);
    }
    public static void printPascal(int n) {
        for (int line = 1; line <= n; line++) {
            for (int j = 0; j <= n - line; j++) {
            // for left spacing
                System.out.print(" ");
            }

            // used to represent C(line, i)
            int C = 1;
            for (int i = 1; i <= line; i++) {

            // The first value in a line is always 1
                System.out.print(C + " ");
                C = C * (line - i) / i;
            }
            System.out.println();
        }
    }
}
