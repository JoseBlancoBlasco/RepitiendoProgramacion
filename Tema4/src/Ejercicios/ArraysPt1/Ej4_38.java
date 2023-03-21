package Ejercicios.ArraysPt1;
import java.util.Scanner;

public class Ej4_38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase , fraseCodificada="";
		char cod;
		char[] conjunto1= {'e','i','k','m','p','q','r','s','t','u','v'};
		char[] conjunto2= {'p','v','i','u','m','t','e','r','k','q','s'};
		
		frase= sc.nextLine();
		for(int i=0; i<frase.length(); i++) {
			cod = frase.charAt(i);
			cod = codifica(conjunto1, conjunto2, cod);
			fraseCodificada = fraseCodificada + cod;
		}
		System.out.println(fraseCodificada);
	}
	static char codifica(char conjunto1[], char conjunto2[], char c) {
		char codificado;
		int posicion=0;
		posicion=buscar(conjunto1, c);
		if(posicion!=-1)
			codificado = conjunto2[posicion];
		else
			codificado = c;
		
		return codificado;
	}
	
	static int buscar(char t[], char claveBusqueda) {
		int indiceBusqueda=0;
		
		while (indiceBusqueda < t.length &&  t[indiceBusqueda] != claveBusqueda)
		{ 
			indiceBusqueda++;
		}
		if (indiceBusqueda < t.length){
			//claveBusqueda está en la posición indiceBusqueda
		} else { //indiceBusqueda se ha salido del rango
			indiceBusqueda=-1; // no encontrado
		}	
		return indiceBusqueda;
	}
}
