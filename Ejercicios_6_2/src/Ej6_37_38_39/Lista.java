package Ej6_37_38_39;

import java.util.Arrays;

public class Lista implements Cola, Pila {

    Object[] tabla;

    public Lista() {
        tabla = new Object[0];
    }

    void insertarPrincipio(Object nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = nuevo;
    }

    void insertarFinal(Object nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = nuevo;
    }

    void insertar(int posicion, Object nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion - 1);
        tabla[posicion] = nuevo;
    }

    public Object eliminar(int indice) {
        Object eliminado = null;
        if (indice >= 0 && indice < tabla.length) {
            eliminado = tabla[indice];
            for (int i = indice + 1; i < tabla.length; i++) {
                tabla[i - 1] = tabla[i];
            }
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }
        return eliminado;
    }

    public Object get(int indice) {
        Object obtenido = null;
        if (indice >= 0 && indice < tabla.length) {
            obtenido = tabla[indice];
        }
        return obtenido;
    }

    int buscar(Object objetoBuscado) {
        int indice = -1;
        for (int i = 0; i < tabla.length && indice == -1; i++) {
            if (tabla[i].equals(objetoBuscado)) {
                indice = i;
            }
        }
        return indice;

    }

    public int numeroElementos() {
        return tabla.length;
    }

    @Override
    public String toString() {
        return "Lista{" + "tabla=" + Arrays.toString(tabla) + '}';
    }

    static Lista listaConcatena(Lista l1, Lista l2) {
        Lista resultado = new Lista();
        for (Object e : l1.tabla) {
            resultado.insertarFinal(e);
        }
        for (Object e : l2.tabla) {
            resultado.insertarFinal(e);
        }
        return resultado;
    }

    public boolean equals(Lista otraLista) {
        if (tabla.length != otraLista.tabla.length) {
            System.out.println("Las listas no son iguales");
            return false;
        }
        for (int i = 0; i < tabla.length; i++) {
            if (!tabla[i].equals(otraLista.tabla[i])) {
                System.out.println("Las listas no son iguales");
                return false;
            }
        }
        System.out.println("Las listas son iguales");
        return true;
    }

    @Override
    public void encolar(Object elemento) {
        insertarFinal(elemento);
    }

    @Override
    public Object desencolar() {
        return eliminar(0);
    }

    @Override
    public void apilar(Object elemento) {
        insertarFinal(elemento);
    }

    @Override
    public Object desapilar() {
        return eliminar(tabla.length - 1);
    }

    @Override
    public Object mirarUltimo() {
        return tabla.length - 1;
    }

    @Override
    public boolean isEmpty() {
        return tabla.length == 0;
    }

    @Override
    public void encolarMultiple(int cantidad, Object elemento) {
        while (cantidad > 0) {
            insertarFinal(elemento);
            cantidad--;
        }
    }
}
