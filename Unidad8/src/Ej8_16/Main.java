
package Ej8_16;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static <E> Set<E> union(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> unionSet = new HashSet<>(conjunto1);
        unionSet.addAll(conjunto2);
        return unionSet;
    }

    public static <E> Set<E> interseccion(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> interseccionSet = new HashSet<>(conjunto1);
        interseccionSet.retainAll(conjunto2);
        return interseccionSet;
    }

    public static void main(String[] args) {
        Set<Integer> conjunto1 = new HashSet<>();
        Set<Integer> conjunto2 = new HashSet<>();

        conjunto1.add(1);
        conjunto1.add(2);
        conjunto1.add(3);

        conjunto2.add(3);
        conjunto2.add(4);
        conjunto2.add(5);

        Set<Integer> union = union(conjunto1, conjunto2);
        Set<Integer> interseccion = interseccion(conjunto1, conjunto2);

        System.out.println("Conjunto 1: " + conjunto1);
        System.out.println("Conjunto 2: " + conjunto2);
        System.out.println("Unión: " + union);
        System.out.println("Intersección: " + interseccion);
    }
}

