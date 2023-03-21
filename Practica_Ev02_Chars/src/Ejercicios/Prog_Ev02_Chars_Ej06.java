package Ejercicios;

import java.util.Scanner;

public class Prog_Ev02_Chars_Ej06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();
        String camelCase = aCamelCase(frase);
        System.out.println("Nombre de variable: " + camelCase);
        scanner.close();
    }

    public static String aCamelCase(String frase) {
        String[] palabras = frase.toLowerCase().split(" ");
        String camelCase = palabras[0];
        for (int i = 1; i < palabras.length; i++) {
            camelCase += (palabras[i].substring(0, 1).toUpperCase() + palabras[i].substring(1));
        }
        return camelCase;
    }

}
