package Ejercicios;

import java.util.Scanner;

public class Prog_Ev01_Ej11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce mes: ");
        int mes = scan.nextInt();
        System.out.println("Introduce año: ");
        int anio = scan.nextInt();

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tiene 31 dias.");
                break;
            case 2:
                System.out.println("Tiene 28 dias.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tiene 30 dias.");
                break;
            default:
                System.out.println("Mes introducido erroneo.");
                break;
        }

        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
            System.out.println("El año es bisiesto.");
        } else {
            System.out.println("El año no es bisiesto.");
        }
    }

}
