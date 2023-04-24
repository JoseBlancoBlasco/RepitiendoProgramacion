
package Ej8_5;

public class Contenedor<E extends Comparable<E>> implements Cola<E> {
    private E[] tabla;

    public Contenedor() {
        tabla = crearTabla(0);
    }
    
    private E[] crearTabla(int tamaño) {
        return (E[]) new Comparable[tamaño];
    }

    @Override
    public void encolar(E elemento) {        
        E[] nuevaTabla = crearTabla(tabla.length + 1);
        System.arraycopy(tabla, 0, nuevaTabla, 0, tabla.length);
        nuevaTabla[tabla.length] = elemento;
        tabla = nuevaTabla;    
    }

    @Override
    public E desencolar() {
        if (tabla.length == 0) {
            return null;
        }
        E[] nuevaTabla = crearTabla(tabla.length - 1);
        E primero = tabla[0];
        for (int i = 1; i < tabla.length; i++) {
            nuevaTabla[i - 1] = tabla[i];
        }
        tabla = nuevaTabla;
        return primero;
    }

    @Override
    public boolean isEmpty() {
        return size()== 0;
    }

    @Override
    public int size() {
        return tabla.length;
    }
}
