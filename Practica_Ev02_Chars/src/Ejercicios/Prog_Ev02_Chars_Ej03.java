package Ejercicios;

import java.util.Scanner;

public class Prog_Ev02_Chars_Ej03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una frase con comentarios: ");
        String frase = scanner.nextLine();
        String sinComentarios = eliminarComentarios(frase);
        System.out.println("Frase sin comentarios: " + sinComentarios);
        scanner.close();
    }

    public static String eliminarComentarios(String frase) {
        String sinComentarios = "";
        boolean comentarioActivo = false;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == '/' && frase.charAt(i + 1) == '*') {
                comentarioActivo = true;
                i++;
            } else if (c == '*' && frase.charAt(i + 1) == '/') {
                comentarioActivo = false;
                i++;
            } else if (!comentarioActivo) {
                sinComentarios += c;
            }
        }
        return sinComentarios;
    }

}
