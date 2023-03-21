package Ejercicios.Switch;

import java.util.Scanner;

public class Ej3_07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce una nota");
        int nota = scan.nextInt();
        if (nota >= 0 && nota <= 4) {
            System.out.println("Insuficiente.");
        } else if (nota == 5) {
            System.out.println("Suficiente");
        } else if (nota == 6 || nota == 7) {
            System.out.println("Bien");
        } else if (nota == 8 || nota == 9) {
            System.out.println("Notable");
        } else if (nota == 10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Nota no valida");
        }

        System.out.println("Introduce una nota");
        nota = scan.nextInt();
        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
            case 7:
                System.out.println("Bien");
                break;
            case 8:
            case 9:
                System.out.println("Notable");
                break;
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Nota erronea");                

        }

    }

}
