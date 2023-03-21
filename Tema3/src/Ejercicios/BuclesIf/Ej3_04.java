package Ejercicios.BuclesIf;

import java.util.Scanner;

public class Ej3_04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero.");
        int num1 = scan.nextInt();
        System.out.println(num1 >= 0 ? "Es positivo." : "Es negativo.");
        System.out.println(num1 % 2 == 0 ? "Es par." : "Es impar.");
        System.out.println(num1 % 5 == 0 ? "Es multiplo de 5." : "No es multiplo de 5.");
        System.out.println(num1 % 10 == 0 ? "Es multiplo de 10." : "No es multiplo de 10.");
        System.out.println(num1 < 100 ? "Es menor de 100." : "Es mayor de 100.");

    }

}
