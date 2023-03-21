package Ejercicios.ArraysPt1;

import java.util.Arrays;

public class Ej4_03 {

    public static void main(String[] args) {
        int datos[] = new int[9];
        int suma = 0;
        //Relleno cada posicion con random del 1 al 100
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (1 + (int) (Math.random() * ((100 - 1) + 1)));            
        }
        for (int i = 0; i < datos.length; i++) {
            System.out.println(datos[i]);
        }
        for (int i = 0; i < datos.length; i++) {
            suma+=datos[i];
        }
        System.out.println("La suma es: " + suma);
    }
}
