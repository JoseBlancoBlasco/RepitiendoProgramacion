/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej8_14;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Cliente {
    private String nombre;
    private int edad;

    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

class EdadComparator implements Comparator<Cliente> {
    @Override
    public int compare(Cliente cliente1, Cliente cliente2) {
        return Integer.compare(cliente1.getEdad(), cliente2.getEdad());
    }
}

class NombreComparator implements Comparator<Cliente> {
    @Override
    public int compare(Cliente cliente1, Cliente cliente2) {
        return cliente1.getNombre().compareTo(cliente2.getNombre());
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear el conjunto de clientes original
        Set<Cliente> conjuntoClientes = new TreeSet<>(new EdadComparator());
        conjuntoClientes.add(new Cliente("Juan", 30));
        conjuntoClientes.add(new Cliente("Pedro", 25));
        conjuntoClientes.add(new Cliente("María", 35));

        // Crear un conjunto ordenado por edad
        Set<Cliente> conjuntoOrdenadoPorEdad = new TreeSet<>(new EdadComparator());
        conjuntoOrdenadoPorEdad.addAll(conjuntoClientes);

        // Crear un conjunto ordenado por nombre
        Set<Cliente> conjuntoOrdenadoPorNombre = new TreeSet<>(new NombreComparator());
        conjuntoOrdenadoPorNombre.addAll(conjuntoClientes);

        // Mostrar los conjuntos ordenados por edad y nombre
        System.out.println("Conjunto ordenado por edad:");
        for (Cliente cliente : conjuntoOrdenadoPorEdad) {
            System.out.println("Nombre: " + cliente.getNombre() + ", Edad: " + cliente.getEdad());
        }

        System.out.println("\nConjunto ordenado por nombre:");
        for (Cliente cliente : conjuntoOrdenadoPorNombre) {
            System.out.println("Nombre: " + cliente.getNombre() + ", Edad: " + cliente.getEdad());
        }
    }
}

