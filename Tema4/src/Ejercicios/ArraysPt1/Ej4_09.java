package Ejercicios.ArraysPt1;

import java.util.Scanner;

public class Ej4_09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Cual es la longitud de la tabla?: ");
        int longitud = scan.nextInt();
        int tabla[] = new int[longitud];        
        System.out.println("Rellena la tabla.");
        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Posicion " + i + " :");
            tabla[i]=scan.nextInt();
        }
        System.out.println("Que numero quieres encontrar?: ");
        int clave = scan.nextInt();
        System.out.println("El numero " + clave + " está en la posicion " + buscar(tabla,clave));
    }

    static int buscar(int t[], int clave) {
        int indiceBusqueda = 0;
        while (indiceBusqueda < t.length && t[indiceBusqueda] != clave) {
            indiceBusqueda++;
        }
        if (indiceBusqueda < t.length) {
            return indiceBusqueda;
        }else{
            return -1;
        }        
    }
}
