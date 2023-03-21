package Ejercicios;

import java.util.Scanner;

public class Ej2_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = scan.nextInt();
        boolean check = false;
        do {
            if (edad < 1 || edad > 100) {
                System.out.println("Introduce una edad valida.");
                edad = scan.nextInt();
            } else {
                check = true;
            }
        } while (!check);
        edad++;
        System.out.println("El año que viene tendras " + edad + " años.");
    }

}
