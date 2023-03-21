/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.Switch;

import java.util.Scanner;

public class Ej3_12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduzca hora: ");
        int hora = scan.nextInt();
        System.out.print("Introduzca minuto: ");
        int minuto = scan.nextInt();
        System.out.print("Introduzca segundo: ");
        int segundo = scan.nextInt();
        segundo++;
        if (segundo >= 60) {
            segundo = 0;
            minuto++;
            if (minuto >= 60) {
                minuto = 0;
                hora++;
            }
            if (hora >= 23) {
                hora = 0;
            }
        }
        System.out.println("Hora un segundo mas tarde:");
        System.out.println(hora + ":" + minuto + ":" + segundo);

    }
}
