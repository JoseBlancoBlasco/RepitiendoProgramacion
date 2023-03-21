package Ejercicios.BuclesWhile;

import java.util.Random;
import java.util.Scanner;

public class Ej3_21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rn = new Random();
        int adivinar = rn.nextInt(100) + 1;
        System.out.println("Intenta adivinar el numero entre 1 y 100");
        int numUsuario = scan.nextInt();
        while (numUsuario > 0) {
            while (numUsuario != adivinar) {
                if (numUsuario > adivinar) {
                    System.out.println("Te pasaste");
                } else {
                    System.out.println("Te quedaste corto");
                }
                System.out.println("Adivina otra vez:");
                numUsuario = scan.nextInt();
            }
            System.out.println("Acertaste!");
            numUsuario = -1;
        }
        System.out.println("Adios");
    }

}
