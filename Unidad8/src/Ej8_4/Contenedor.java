
package Ej8_4;

public class Contenedor<E extends Comparable<E>> implements Pila<E> {
    private E[] tabla;

    public Contenedor() {
        tabla = crearTabla(0);
    }
    
    private E[] crearTabla(int tamaño) {
        return (E[]) new Comparable[tamaño];
    }

    @Override
    public void apilar(E elemento) {        
        E[] nuevaTabla = crearTabla(tabla.length + 1);
        System.arraycopy(tabla, 0, nuevaTabla, 0, tabla.length);
        nuevaTabla[tabla.length] = elemento;
        tabla = nuevaTabla;    
    }

    public E desapilar() {
        if (tabla.length == 0) {
            return null;
        }
        E[] nuevaTabla = crearTabla(tabla.length - 1);
        E ultimo = tabla[tabla.length - 1];
        System.arraycopy(tabla, 0, nuevaTabla, 0, tabla.length - 1);
        tabla = nuevaTabla;
        return ultimo;
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

