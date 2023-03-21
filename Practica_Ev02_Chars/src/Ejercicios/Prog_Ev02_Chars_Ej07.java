/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicios;

import java.util.Scanner;


public class Prog_Ev02_Chars_Ej07 {    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce el texto: ");
        String texto = scan.nextLine();
        System.out.print("Introduce la palabra a reemplazar: ");
        String palabraAntigua = scan.nextLine();
        System.out.print("Introduce la nueva palabra: ");
        String palabraNueva = scan.nextLine();
        String textoEditado = reemplazarPalabra(texto, palabraAntigua, palabraNueva);
        System.out.println("Texto editado: " + textoEditado);
        scan.close();
    }
    
    public static String reemplazarPalabra(String texto, String palabraAntigua, String palabraNueva) {
        return texto.replaceAll(palabraAntigua, palabraNueva);
    }
}


