/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

public class Prog_Ev02_Ej08 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Ingresa el elemento [" + i + "][" + j + "]:");
                matriz[i][j] = scan.nextInt();
            }
        }
        boolean esMagica = comprobarMagica(matriz);
        if (esMagica) {
            System.out.println("La matriz es mágica");
        } else {
            System.out.println("La matriz no es mágica");
        }
    }

    public static boolean comprobarMagica(int[][] matriz) {
        int sumaFila = 0;
        int sumaColumna = 0;
        //int sumaDiagonal1 = 0;
        //int sumaDiagonal2 = 0;
        // Comprobar suma de filas
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sumaFila += matriz[i][j];
            }
            if (i == 0) {
                sumaColumna = sumaFila;
            } else if (sumaFila != sumaColumna) {
                return false;
            }
            sumaFila = 0;
        }
        // Comprobar suma de columnas
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sumaColumna += matriz[j][i];
            }
            if (sumaColumna != sumaColumna) {
                return false;
            }
            sumaColumna = 0;
        }
        // Comprobar suma de diagonales
//        for (int i = 0; i < 4; i++) {
//            sumaDiagonal1 += matriz[i][i];
//            sumaDiagonal2 += matriz[i][3 - i];
//        }
//        if (sumaDiagonal1 != sumaDiagonal2) {
//            return false;
//        }
        return true;
    }
}
