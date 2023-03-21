package Ejercicios;

import java.util.Scanner;

public class Prog_Ev01_Ej13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        String nombre = scan.next();
        System.out.println("Introduce tu edad: ");
        int edad = scan.nextInt();
        System.out.println(nombre + ", la proxima decada tendras " + (edad + 10) + " años.");

        if (edad > 0 && edad <= 25) {
            System.out.println("Grupo A.");
        } else if (edad > 25 && edad <= 50) {
            System.out.println("Grupo B.");
        } else if (edad > 50 && edad <= 75) {
            System.out.println("Grupo C.");
        } else if (edad > 75 && edad <= 100) {
            System.out.println("Grupo D.");
        } else {
            System.out.println("Grupo E.");
        }

    }

}
