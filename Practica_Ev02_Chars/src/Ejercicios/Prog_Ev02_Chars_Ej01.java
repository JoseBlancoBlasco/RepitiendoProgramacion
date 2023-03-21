package Ejercicios;

import java.util.Scanner;

public class Prog_Ev02_Chars_Ej01 {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String frase, fraseCodificada="", fraseDescodificada="";
	char cod;
	char[] conjunto1= {'e','i','k','m','p','q','r','s','t','u','v'};
	char[] conjunto2= {'p','v','i','u','m','t','e','r','k','q','s'};
	
	frase= sc.nextLine();
	for(int i=0; i<frase.length(); i++) {
		cod = frase.charAt(i);
		cod = codifica(conjunto1, conjunto2, cod);
		fraseCodificada = fraseCodificada + cod;
	}
	System.out.println("Texto codificado: " + fraseCodificada);
	
	for(int i=0; i<fraseCodificada.length(); i++) {
		cod = fraseCodificada.charAt(i);
		cod = descodifica(conjunto1, conjunto2, cod);
		fraseDescodificada = fraseDescodificada + cod;
	}
	System.out.println("Texto descodificado: " + fraseDescodificada);
}

    static char codifica(char conjunto1[], char conjunto2[], char c) {
        char codificado;
        int posicion = 0;
        posicion = buscar(conjunto1, c);
        if (posicion != -1) {
            codificado = conjunto2[posicion];
        } else {
            codificado = c;
        }

        return codificado;
    }

    static int buscar(char t[], char claveBusqueda) {
        int indiceBusqueda = 0;

        while (indiceBusqueda < t.length && t[indiceBusqueda] != claveBusqueda) {
            indiceBusqueda++;
        }
        if (indiceBusqueda < t.length) {
            //claveBusqueda está en la posición indiceBusqueda
        } else { //indiceBusqueda se ha salido del rango
            indiceBusqueda = -1; // no encontrado
        }
        return indiceBusqueda;
    }

    static char descodifica(char conjunto1[], char conjunto2[], char c) {
        char descodificado;
        int posicion = 0;
        posicion = buscar(conjunto2, c);
        if (posicion != -1) {
            descodificado = conjunto1[posicion];
        } else {
            descodificado = c;
        }

        return descodificado;
    }
}
