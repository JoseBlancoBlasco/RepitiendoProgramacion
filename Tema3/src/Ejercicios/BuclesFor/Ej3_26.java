package Ejercicios.BuclesFor;

import java.util.Scanner;

public class Ej3_26 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce 10 numeros para calcular su media.");
        double suma=0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un numero: ");
            suma+=scan.nextInt();
        }
        System.out.println("La media es: " + (suma/10));
    }

}
