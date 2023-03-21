/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.Switch;

import java.util.Scanner;

public class Ej3_10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce dia");
        int dia = scan.nextInt();
        System.out.println("Introduce mes");
        int mes = scan.nextInt();
        System.out.println("Introduce año");
        int anio = scan.nextInt();
        boolean correcto = false;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (dia > 0 && dia <= 31) {
                    System.out.println("Fecha Correcta");
                    correcto = true;
                } else {
                    System.out.println("Fecha incorrecta.");
                    correcto = false;
                }
                break;
            case 2:
                if (dia > 0 && dia <= 28) {
                    System.out.println("Fecha Correcta");
                    correcto = true;
                } else {
                    System.out.println("Fecha incorrecta.");
                    correcto = false;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (dia > 0 && dia <= 30) {
                    System.out.println("Fecha Correcta");
                    correcto = true;
                } else {
                    System.out.println("Fecha incorrecta.");
                    correcto = false;
                }
                break;
            default:
                System.out.println("Fecha incorrecta.");
                correcto = false;
                break;
        }

        if (correcto) {
            dia++;
            if (dia >= 30) {
                dia = 1;
                mes++;
                if (mes >= 12) {
                    mes = 1;
                    anio++;
                }
            }
            if (anio == 0) {
                anio = 1;
            }
            System.out.println("La fecha el dia siguiente sera: ");
            System.out.println(dia + "-" + mes + "-" + anio);
        }

    }
}
