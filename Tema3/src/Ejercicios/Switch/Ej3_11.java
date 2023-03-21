
package Ejercicios.Switch;

import java.util.Scanner;

public class Ej3_11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fecha 1:");
        System.out.print("Introduzca día: ");
        int dia1 = scan.nextInt();
        System.out.print("Introduzca mes: ");
        int mes1 = scan.nextInt();
        System.out.print("Introduzca año: ");
        int anio1 = scan.nextInt();
        System.out.println("Fecha 2:");
        System.out.print("Introduzca día: ");
        int dia2 = scan.nextInt();
        System.out.print("Introduzca mes: ");
        int mes2 = scan.nextInt();
        System.out.print("Introduzca año: ");
        int anio2 = scan.nextInt();

        int totalDias = dia2 - dia1 + 30 * (mes2 - mes1) + 365 * (anio2 - anio1);

        System.out.println("Días de diferencia: " + totalDias);
    }

}
