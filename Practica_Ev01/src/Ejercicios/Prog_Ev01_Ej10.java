package Ejercicios;

import java.util.Scanner;

public class Prog_Ev01_Ej10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int suma = 0;
        int negativos = 0;

        System.out.println("Cuantos numeros vas a introducir?");
        int totalNumeros = scan.nextInt();
        do {
            System.out.println("Introduce un numero: ");
            num = scan.nextInt();
            suma += num;
            if (num < 0) {
                negativos++;
            }
            totalNumeros--;
        } while (totalNumeros != 0);

        System.out.println("La suma de los numeros introducidos es: " + suma);
        System.out.println("Has introducido " + negativos + " numeros negativos.");
    }

}
