
package Ej6_36;

public class Supercola {
    private int[] cola1;
    private int[] cola2;
    private int inicio1, fin1, inicio2, fin2;

    public Supercola(int tam) {
        cola1 = new int[tam];
        cola2 = new int[tam];
        inicio1 = fin1 = inicio2 = fin2 = -1;
    }

    public void encolar1(int elem) {
        if (estaLlena()) {
            System.out.println("Error: La supercola está llena");
            return;
        }

        if (estaVacia()) {
            inicio1 = fin1 = 0;
        } else {
            fin1 = (fin1 + 1) % cola1.length;
        }

        cola1[fin1] = elem;
    }

    public void encolar2(int elem) {
        if (estaLlena()) {
            System.out.println("Error: La supercola está llena");
            return;
        }

        if (estaVacia()) {
            inicio2 = fin2 = 0;
        } else {
            fin2 = (fin2 + 1) % cola2.length;
        }

        cola2[fin2] = elem;
    }

    public Integer desencolar1() {
        if (inicio1 == -1) {
            return null;
        }

        int elem = cola1[inicio1];
        if (inicio1 == fin1) {
            inicio1 = fin1 = -1;
        } else {
            inicio1 = (inicio1 + 1) % cola1.length;
        }

        if (inicio1 == -1 && inicio2 != -1) {
            return desencolar2();
        }

        return elem;
    }

    public Integer desencolar2() {
        if (inicio2 == -1) {
            return null;
        }

        int elem = cola2[inicio2];
        if (inicio2 == fin2) {
            inicio2 = fin2 = -1;
        } else {
            inicio2 = (inicio2 + 1) % cola2.length;
        }

        if (inicio2 == -1 && inicio1 != -1) {
            return desencolar1();
        }

        return elem;
    }

    public boolean estaVacia() {
        return inicio1 == -1 && inicio2 == -1;
    }

    public boolean estaLlena() {
        return (fin1 + 1) % cola1.length == inicio2 || (fin2 + 1) % cola2.length == inicio1;
    }

    public void imprimir() {
        System.out.print("Cola1: ");
        for (int i = inicio1; i != fin1; i = (i + 1) % cola1.length) {
            System.out.print(cola1[i] + " ");
        }
        if (inicio1 != -1) {
            System.out.print(cola1[fin1]);
        }
        System.out.println();

        System.out.print("Cola2: ");
        for (int i = inicio2; i != fin2; i = (i + 1) % cola2.length) {
            System.out.print(cola2[i] + " ");
        }
        if (inicio2 != -1) {
            System.out.print(cola2[fin2]);
        }
        System.out.println();
    }
}

