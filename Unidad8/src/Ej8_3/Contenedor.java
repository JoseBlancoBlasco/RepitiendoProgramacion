
package Ej8_3;

import java.util.Arrays;

public class Contenedor<T extends Comparable<T>> {
    private T[] tabla;
    private int tamaño;

    public Contenedor() {
        tabla = crearTabla(0);
        tamaño = 0;
    }

    public void insertarAlPrincipio(T nuevo) {
        T[] nuevaTabla = crearTabla(tamaño + 1);
        nuevaTabla[0] = nuevo;
        for (int i = 1; i <= tamaño; i++) {
            nuevaTabla[i] = tabla[i - 1];
        }
        tabla = nuevaTabla;
        tamaño++;
    }

    public void insertarAlFinal(T nuevo) {
        T[] nuevaTabla = crearTabla(tamaño + 1);
        for (int i = 0; i < tamaño; i++) {
            nuevaTabla[i] = tabla[i];
        }
        nuevaTabla[tamaño] = nuevo;
        tabla = nuevaTabla;
        tamaño++;
    }

    public T extraerDelPrincipio() {
        if (tamaño == 0) {
            return null;
        }
        T[] nuevaTabla = crearTabla(tamaño - 1);
        T primero = tabla[0];
        for (int i = 1; i < tamaño; i++) {
            nuevaTabla[i - 1] = tabla[i];
        }
        tabla = nuevaTabla;
        tamaño--;
        return primero;
    }

    public T extraerDelFinal() {
        if (tamaño == 0) {
            return null;
        }
        T[] nuevaTabla = crearTabla(tamaño - 1);
        T ultimo = tabla[tamaño - 1];
        for (int i = 0; i < tamaño - 1; i++) {
            nuevaTabla[i] = tabla[i];
        }
        tabla = nuevaTabla;
        tamaño--;
        return ultimo;
    }

    public void ordenar() {
        Arrays.sort(tabla, 0, tamaño);
    }

    private T[] crearTabla(int tamaño) {
        return (T[]) new Comparable[tamaño];
    }
    
}

