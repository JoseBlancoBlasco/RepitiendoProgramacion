package Ejercicios.Switch;

import java.util.Scanner;

public class Ej3_13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce DNI: ");
        int numDNI = scan.nextInt();
        int letraDNI = numDNI % 23;

        switch (letraDNI) {
            case 0:
                System.out.println("DNI: " + numDNI + " - " + " T ");
                break;
            case 1:
                System.out.println("DNI: " + numDNI + " - " + " R ");
                break;
            case 2:
                System.out.println("DNI: " + numDNI + " - " + " W ");
                break;
            case 3:
                System.out.println("DNI: " + numDNI + " - " + " A ");
                break;
            case 4:
                System.out.println("DNI: " + numDNI + " - " + " G ");
                break;
            case 5:
                System.out.println("DNI: " + numDNI + " - " + " M ");
                break;
            case 6:
                System.out.println("DNI: " + numDNI + " - " + " Y ");
                break;
            case 7:
                System.out.println("DNI: " + numDNI + " - " + " F ");
                break;
            case 8:
                System.out.println("DNI: " + numDNI + " - " + " P ");
                break;
            case 9:
                System.out.println("DNI: " + numDNI + " - " + " D ");
                break;
            case 10:
                System.out.println("DNI: " + numDNI + " - " + " X ");
                break;
            case 11:
                System.out.println("DNI: " + numDNI + " - " + " B ");
                break;
            case 12:
                System.out.println("DNI: " + numDNI + " - " + " N ");
                break;
            case 13:
                System.out.println("DNI: " + numDNI + " - " + " J ");
                break;
            case 14:
                System.out.println("DNI: " + numDNI + " - " + " Z ");
                break;
            case 15:
                System.out.println("DNI: " + numDNI + " - " + " S ");
                break;
            case 16:
                System.out.println("DNI: " + numDNI + " - " + " Q ");
                break;
            case 17:
                System.out.println("DNI: " + numDNI + " - " + " V ");
                break;
            case 18:
                System.out.println("DNI: " + numDNI + " - " + " H ");
                break;
            case 19:
                System.out.println("DNI: " + numDNI + " - " + " L ");
                break;
            case 20:
                System.out.println("DNI: " + numDNI + " - " + " C ");
                break;
            case 21:
                System.out.println("DNI: " + numDNI + " - " + " K ");
                break;
            case 22:
                System.out.println("DNI: " + numDNI + " - " + " E ");
                break;
            default:
                System.out.println("DNI erroneo");
                break;
        }
    }

}
