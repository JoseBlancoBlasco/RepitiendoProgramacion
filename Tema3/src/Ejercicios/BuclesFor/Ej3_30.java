package Ejercicios.BuclesFor;

import java.util.Scanner;

public class Ej3_30 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce 5 notas de alumnos.");
        int nota;
        int contador = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce nota nº" + i + ": ");
            nota = scan.nextInt();
            if (nota < 5) {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " suspensos.");

    }

}
