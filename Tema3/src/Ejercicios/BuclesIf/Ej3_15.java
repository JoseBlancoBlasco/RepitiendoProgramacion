package Ejercicios.BuclesIf;

import java.util.Scanner;

public class Ej3_15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce numero: ");
        int num = scan.nextInt();

        if (num >= 0) {
            System.out.println("El valor absoluto de " + num + " es: " + num);
        } else {
            System.out.println("El valor absoluto de " + num + " es: " + (-1 * num));
        }

    }

}
