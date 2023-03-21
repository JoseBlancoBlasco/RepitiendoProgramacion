/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

public class Prog_Ev02_Chars_Ej02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palabraSecreta;
        String palabraAdivinada = "";
        int intentos = 7;

        // Pedir al jugador A que ingrese la palabra secreta
        System.out.print("Jugador A, ingresa la palabra secreta: ");
        palabraSecreta = scan.nextLine();

        // Mostrar tantos guiones como letras tenga la palabra secreta
        for (int i = 0; i < palabraSecreta.length(); i++) {
            palabraAdivinada += "-";
        }
        System.out.println("Palabra a adivinar: " + palabraAdivinada);

        // Bucle para que el jugador B intente adivinar la palabra
        while (intentos > 0) {
            System.out.print("Jugador B, adivina una letra: ");
            char letra = scan.nextLine().charAt(0);

            // Comprobar si la letra está en la palabra secreta
            boolean acierto = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    acierto = true;
                    palabraAdivinada = palabraAdivinada.substring(0, i) + letra + palabraAdivinada.substring(i + 1);
                }
            }

            if (acierto) {
                System.out.println("Acierto! La palabra a adivinar es: " + palabraAdivinada);
                if (!palabraAdivinada.contains("-")) {
                    System.out.println("Felicidades, jugador B! Has adivinado la palabra secreta!");
                    break;
                }
            } else {
                intentos--;
                System.out.println("Fallo! Te quedan " + intentos + " intentos. La palabra a adivinar es: " + palabraAdivinada);
            }
        }

        if (intentos == 0) {
            System.out.println("Lo siento, jugador B, has agotado todos tus intentos. La palabra secreta era " + palabraSecreta);
        }

        scan.close();
    }
}

