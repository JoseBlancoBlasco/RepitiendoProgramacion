/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej_07;

public class Ej07 {

    public static void main(String[] args) {
        String texto = "Hola mundo";
        int n = 3;
        String textoCifrado = CifradoCesar.cifrarTexto(texto, n);
        System.out.println("Texto original: " + texto);
        System.out.println("Texto cifrado: " + textoCifrado);

    }

}
