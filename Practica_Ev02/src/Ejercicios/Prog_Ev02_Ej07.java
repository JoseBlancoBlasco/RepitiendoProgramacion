package Ejercicios;

import java.util.Arrays;

public class Prog_Ev02_Ej07 {

    public static void main(String[] args) {
        int tabla[] = {10,1,5,8,9,2};
        System.out.println(tabla.length);
        System.out.println(Arrays.toString(suma(tabla,3)));
    }

    public static int[] suma(int[] t, int numElementos) {
        int[] resultado = new int[t.length - numElementos + 1];
        //Primero recorro el array desde la posicion 0 hasta numElementos
        for (int i = 0; i < t.length - numElementos + 1; i++) {
            int suma = 0;
            //Sumo los valores y los almaceno en la posicion correspondiente
            for (int j = i; j < i + numElementos; j++) {
                suma += t[j];
            }            
            resultado[i] = suma;
        }
        return resultado;
    }

}
