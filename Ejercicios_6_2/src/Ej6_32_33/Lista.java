package Ej6_32_33;

import java.util.Arrays;

public class Lista implements Cola, Pila {

    String[] tabla;

    public Lista() {
        tabla = new String[0];
    }

    void insertarPrincipio(String nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = nuevo;
    }

    void insertarFinal(String nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = nuevo;
    }

    void insertar(int posicion, String nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion - 1);
        tabla[posicion] = nuevo;
    }

    public String eliminar(int indice) {
        String eliminado = null;
        if (indice >= 0 && indice < tabla.length) {
            eliminado = tabla[indice];
            for (int i = indice + 1; i < tabla.length; i++) {
                tabla[i - 1] = tabla[i];
            }
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }
        return eliminado;
    }

    public String get(int indice) {
        String obtenido = null;
        if (indice >= 0 && indice < tabla.length) {
            obtenido = tabla[indice];
        }
        return obtenido;
    }

    int buscar(String numeroBuscado) {
        int indice = -1;
        for (int i = 0; i < tabla.length && indice == -1; i++) {
            if (tabla[i].equals(numeroBuscado)) {
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
        for (String e : l1.tabla) {
            resultado.insertarFinal(e);
        }
        for (String e : l2.tabla) {
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
    public void encolar(String elemento) {
        insertarFinal(elemento);
    }

    @Override
    public String desencolar() {
        return eliminar(0);
    }

    @Override
    public void encolarMultiple(int cantidad, String elemento) {
        while (cantidad > 0) {
            insertarFinal(elemento);
            cantidad--;
        }
    }

    @Override
    public void apilar(String elemento) {
        insertarFinal(elemento);
    }

    @Override
    public String desapilar() {
        return eliminar(tabla.length - 1);
    }

    @Override
    public String mirarUltimo() {
        if (tabla.length == 0) {
            return null;
        } else {
            return tabla[tabla.length - 1];
        }
    }

    @Override
    public boolean isEmpty() {
        return tabla.length == 0;
    }
}
