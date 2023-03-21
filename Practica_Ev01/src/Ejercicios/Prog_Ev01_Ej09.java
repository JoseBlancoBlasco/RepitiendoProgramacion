package Ejercicios;

import java.util.Scanner;

public class Prog_Ev01_Ej09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int num1 = scan.nextInt();
        System.out.println("Introduce el segundo numero");
        int num2 = scan.nextInt();
        System.out.println("Introduce el tercer numero");
        int num3 = scan.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("Los 3 numeros son iguales.");
        } else if (num1 == num2 && num2 != num3) {
            System.out.println("Hay dos numeros iguales.");
        } else if (num1 == num3 && num3 != num2) {
            System.out.println("Hay 2 numeros iguales.");
        } else if (num2 == num3 && num3 != num1) {
            System.out.println("Hay 2 numeros iguales.");
        } else {
            System.out.println("Los numeros son distintos.");
        }

    }

}
