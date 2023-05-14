
package Ej8_20;

import java.util.*;

public class Academico implements Comparable<Academico> {
    private String nombre;
    private int anioIngreso;

    public Academico(String nombre, int anioIngreso) {
        this.nombre = nombre;
        this.anioIngreso = anioIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    @Override
    public int compareTo(Academico otro) {
        return this.nombre.compareTo(otro.nombre);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Año de ingreso: " + anioIngreso;
    }

    public static boolean nuevoAcademico(Map<Character, Academico> academia, Academico nuevo, Character letra) {
        if (!Character.isLetter(letra)) {
            return false;
        }

        letra = Character.toUpperCase(letra);

        if (!academia.containsKey(letra)) {
            academia.put(letra, nuevo);
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Map<Character, Academico> academia = new TreeMap<>();

        Academico academico1 = new Academico("Luisa", 2010);
        Academico academico2 = new Academico("Juan", 2015);
        Academico academico3 = new Academico("Maria", 2005);
        Academico academico4 = new Academico("Pedro", 2018);
        Academico academico5 = new Academico("Ana", 2009);

        nuevoAcademico(academia, academico1, 'A');
        nuevoAcademico(academia, academico2, 'C');
        nuevoAcademico(academia, academico3, 'B');
        nuevoAcademico(academia, academico4, 'D');
        nuevoAcademico(academia, academico5, 'E');

        System.out.println("Listado de académicos sin letra:");
        List<Academico> listaSinLetra = new ArrayList<>(academia.values());
        Collections.sort(listaSinLetra);
        for (Academico academico : listaSinLetra) {
            System.out.println(academico);
        }

        System.out.println("\nListado de académicos con letra:");
        List<Academico> listaConLetra = new ArrayList<>(academia.values());
        Collections.sort(listaConLetra, new Comparator<Academico>() {
            @Override
            public int compare(Academico a1, Academico a2) {
                int cmp = Character.compare(Character.toUpperCase(a1.getNombre().charAt(0)),
                        Character.toUpperCase(a2.getNombre().charAt(0)));
                if (cmp != 0) {
                    return cmp;
                }
                return a1.compareTo(a2);
            }
        });
        for (Academico academico : listaConLetra) {
            System.out.println(academico);
        }
    }
}

