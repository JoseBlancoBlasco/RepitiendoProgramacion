package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Prog_Ev02_Chars_Ej08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();
        String[] palabras = frase.split(" ");
        Arrays.sort(palabras);
        System.out.println("Palabras ordenadas de forma alfabética:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
