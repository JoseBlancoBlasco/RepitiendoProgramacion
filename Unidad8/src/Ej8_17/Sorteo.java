
package Ej8_17;

import java.util.*;

public class Sorteo<T> {
    private Set<T> valores;

    public Sorteo() {
        valores = new HashSet<>();
    }

    public boolean add(T elemento) {
        return valores.add(elemento);
    }

    public Set<T> premiados(int numPremiados) {
        if (valores.size() < numPremiados) {
            throw new IllegalArgumentException("No hay suficientes valores para generar la combinación ganadora");
        }

        List<T> listaValores = new ArrayList<>(valores);
        Collections.shuffle(listaValores);

        Set<T> premiados = new HashSet<>(listaValores.subList(0, numPremiados));
        return premiados;
    }

    public static void main(String[] args) {
        Sorteo<Integer> sorteo = new Sorteo<>();

        sorteo.add(1);
        sorteo.add(2);
        sorteo.add(3);
        sorteo.add(4);
        sorteo.add(5);

        Set<Integer> premiados = sorteo.premiados(3);

        System.out.println("Valores posibles: " + sorteo.valores);
        System.out.println("Combinación premiada: " + premiados);
    }
}

