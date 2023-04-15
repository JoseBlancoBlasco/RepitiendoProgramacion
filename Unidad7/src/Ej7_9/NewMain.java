/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ej7_9;


import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los datos del equipo
        System.out.print("Introduce el nombre del equipo: ");
        String nombreEquipo = scanner.nextLine();

        System.out.print("Introduce el centro al que representa el equipo: ");
        String centroEquipo = scanner.nextLine();

        System.out.print("Introduce el lenguaje de programación que va a usar el equipo: ");
        String lenguajeEquipo = scanner.nextLine();

        System.out.print("Introduce el tamaño del equipo: ");
        int tamEquipo = scanner.nextInt();

        scanner.nextLine(); // Consumir el salto de línea

        // Crear el equipo
        EquipoProg equipo = new EquipoProg(nombreEquipo, centroEquipo, lenguajeEquipo, tamEquipo);

        // Añadir los programadores
        for (int i = 0; i < tamEquipo; i++) {
            System.out.printf("Introduce el nombre del programador %d: ", i + 1);
            String nombreProgramador = scanner.nextLine();

            System.out.printf("Introduce el primer apellido del programador %d: ", i + 1);
            String apellido1Programador = scanner.nextLine();

            System.out.printf("Introduce el segundo apellido del programador %d: ", i + 1);
            String apellido2Programador = scanner.nextLine();

            try {
                // Validar los nombres y apellidos
                validarNombre(nombreProgramador);
                validarApellido(apellido1Programador);
                validarApellido(apellido2Programador);

                // Añadir el programador al equipo
                Programador programador = new Programador(nombreProgramador, apellido1Programador);
                equipo.incluirProgramador(programador);

            } catch (InvalidNombreException e) {
                System.out.println(e.getMessage());
                i--; // Volver a solicitar los datos del mismo programador
            } catch (EquipoLlenoException e) {
                System.out.println(e.getMessage());
                break; // Salir del bucle for
            }
        }

        // Mostrar los datos del equipo
        System.out.println("\nDatos del equipo:");
        System.out.println(equipo.toString());
    }

    public static void validarNombre(String nombre) throws InvalidNombreException {
        if (!nombre.matches("^[a-zA-Z]{1,20}$")) {
            throw new InvalidNombreException("El nombre no es válido");
        }
    }

    public static void validarApellido(String apellido) throws InvalidNombreException {
        if (!apellido.matches("^[a-zA-Z]{1,20}$")) {
            throw new InvalidNombreException("El apellido no es válido");
        }
    }
}

