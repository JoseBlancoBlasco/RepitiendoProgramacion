package Ejercicios.Switch;

import java.util.Scanner;

public class Ej3_09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce dia");
        int dia = scan.nextInt();
        System.out.println("Introduce mes");
        int mes = scan.nextInt();
        System.out.println("Introduce año");
        int anio = scan.nextInt();
        
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (dia>0 && dia <=31) {
                    System.out.println("Fecha Correcta");
                }else{
                    System.out.println("Fecha incorrecta.");
                }
                break;
            case 2:
                if (dia>0 && dia <=28) {
                    System.out.println("Fecha Correcta");
                }else{
                    System.out.println("Fecha incorrecta.");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (dia>0 && dia <=30) {
                    System.out.println("Fecha Correcta");
                }else{
                    System.out.println("Fecha incorrecta.");
                }
                break;
            default:
                System.out.println("Fecha incorrecta.");
                break;
        }

    }

}
