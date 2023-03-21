package Ejercicios.BuclesFor;

import java.util.Scanner;

public class Ej3_29 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce numero para factorial: ");
        int num = scan.nextInt();
        int fact = 1;
        for (int i = num; i > 0; i--) {
            fact*=i;
        }
        System.out.println("El factorial de " + num + " es: " + fact);
    }

}
