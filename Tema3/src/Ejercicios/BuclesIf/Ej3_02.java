package Ejercicios.BuclesIf;

import java.util.Scanner;

public class Ej3_02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero.");
        int num1 = scan.nextInt();
        System.out.println("Introduce otro numero.");
        int num2 = scan.nextInt();
        System.out.println(num1 == 0 || num2 == 0 ? "Alguno es cero" : (num1 % num2 == 0 ? "Son divisbles" : "No son divisibles"));
    }

}
