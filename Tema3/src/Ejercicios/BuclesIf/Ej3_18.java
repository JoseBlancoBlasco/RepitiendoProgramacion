package Ejercicios.BuclesIf;

import java.util.Scanner;

public class Ej3_18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce angulo en grados: ");
        double grados = scan.nextDouble();
        if (grados > 360) {
            do {
                grados = grados - 360;
                //System.out.println(grados);
            } while (grados > 360);
        }
        System.out.println("Los radianes son: " + (grados * Math.PI / 180));
    }
}
