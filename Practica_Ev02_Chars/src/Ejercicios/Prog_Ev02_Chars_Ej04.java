package Ejercicios;

import java.util.Scanner;

public class Prog_Ev02_Chars_Ej04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingresa una palabra o frase: ");
        String palabra = scan.nextLine();
        System.out.println("Palabra modificada: " + modificarPalabra(palabra));
        scan.close();
    }

    public static String modificarPalabra(String palabra) {
        String palabraModificada = "";
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            switch (letra) {
                case 'a':
                    palabraModificada += '@';
                    break;
                case 'e':
                    palabraModificada += '€';
                    break;
                case 'i':
                    palabraModificada += '1';
                    break;
                case 'o':
                    palabraModificada += '0';
                    break;
                case 'u':
                    palabraModificada += '#';
                    break;
                // agregar más casos para las demás letras
                default:
                    palabraModificada += letra;
            }
        }
        return palabraModificada;
    }

}
