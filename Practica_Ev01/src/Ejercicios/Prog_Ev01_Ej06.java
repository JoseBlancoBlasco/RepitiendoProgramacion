package Ejercicios;

import java.util.Scanner;

public class Prog_Ev01_Ej06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Resolucion de ecuacion: C1x + C2 = 0");
        System.out.println("Introduce C1: ");
        double c1 = scan.nextFloat();
        System.out.println("Introduce C2: ");
        double c2 = scan.nextFloat();
        System.out.println("x = " + (-c2/c1));
    }

}
