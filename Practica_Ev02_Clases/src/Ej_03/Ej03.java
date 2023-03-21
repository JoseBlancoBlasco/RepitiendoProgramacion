/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej_03;

import java.util.Arrays;
import java.util.Scanner;

public class Ej03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Cuantos colores basicos: ");
        int cantidad = scan.nextInt();
        String colorNuevo = "";
        Colores listaColores = new Colores();
        String[] colores = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.print((i + 1) + ": ");
            //colorNuevo = scan.next();
            listaColores.insertarFinal(scan.next());
            System.out.println("**********");
        }
        
        System.out.println(colores.toString());
        
        for (int i = 0; i < colores.length; i++) {
            System.out.println(colores[i]);
        }
        
        System.out.println(Arrays.toString(colores));

    }

}
