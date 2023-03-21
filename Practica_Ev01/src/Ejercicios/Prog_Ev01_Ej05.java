package Ejercicios;

import java.util.Scanner;

public class Prog_Ev01_Ej05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Comprobacion de numero multiplo de otro.");
        System.out.println("Introduce el primer numero: ");
        int num1 = scan.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int num2 = scan.nextInt();
        
        if (num2%num1==0) {
            System.out.println(num1 + " es multiplo de " + num2);
        }else{
            System.out.println(num1 + " no es multiplo de " + num2);
        }
    }

}
