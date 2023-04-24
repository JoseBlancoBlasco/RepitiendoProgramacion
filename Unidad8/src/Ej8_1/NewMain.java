
package Ej8_1;

import java.util.Arrays;

public class NewMain {
    
    public static void main(String[] args) {
        Integer[] tabla = {1, 2, 3};
        Integer elemento = 4;
        Integer[] nuevaTabla = insertar(elemento, tabla);
        System.out.println(Arrays.toString(nuevaTabla)); // [1, 2, 3, 4]
    }

    public static <E> E[] insertar(E elemento, E tabla[]) {
        E[] nuevaTabla = Arrays.copyOf(tabla, tabla.length + 1);
        nuevaTabla[nuevaTabla.length -1] = elemento;
        return nuevaTabla;
    }

}
