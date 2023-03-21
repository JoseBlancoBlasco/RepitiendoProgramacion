package Ejercicios;

import java.util.Scanner;

public class Prog_Ev02_Chars_Ej05 {    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();
        System.out.print("Ingresa el número de letras por secuencia: ");
        int n = scanner.nextInt();
        dividirPalabra(palabra, n);
        scanner.close();
    }
    
    public static void dividirPalabra(String palabra, int n) {
        for (int i = 0; i < palabra.length(); i += n) {
            if (i + n < palabra.length()) {
                System.out.println(palabra.substring(i, i + n));
            } else {
                System.out.println(palabra.substring(i));
            }
        }
    }
    
}
