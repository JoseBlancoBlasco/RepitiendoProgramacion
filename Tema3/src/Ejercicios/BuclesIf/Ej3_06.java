package Ejercicios.BuclesIf;

import java.util.Scanner;

public class Ej3_06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero entre 0 y 9.999");
        int num = scan.nextInt();
        int numComprobar = 0;
        boolean check = false;
        do {
            if (num < 1 || num > 9999) {
                System.out.println("Introduce un numero entre 0 y 9.999.");
                num = scan.nextInt();
            } else {
                check = true;
            }
            numComprobar = num;
        } while (!check);
        int cifra, inverso = 0;
        while (num != 0) {
            cifra = num % 10;
            inverso = (inverso * 10) + cifra;
            num /= 10;
        }
        System.out.println("Inverso: " + inverso);

        if (numComprobar == inverso) {
            System.out.println("Es capicua.");
        } else {
            System.out.println("No es capicua.");
        }
    }
}
