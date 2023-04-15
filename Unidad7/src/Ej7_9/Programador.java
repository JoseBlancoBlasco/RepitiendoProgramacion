/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej7_9;

public class Programador {
    private String nombre;
    private String apellidos;

    public Programador(String nombre, String apellidos) throws InvalidNombreException {
        if (nombre == null || nombre.isEmpty() || apellidos == null || apellidos.isEmpty()) {
            throw new InvalidNombreException("El nombre y los apellidos del programador no pueden estar vacíos");
        }
        if (!nombre.matches("[a-zA-Z]+") || !apellidos.matches("[a-zA-Z]+")) {
            throw new InvalidNombreException("El nombre y los apellidos del programador solo pueden contener letras");
        }
        if (nombre.length() > 20 || apellidos.length() > 20) {
            throw new InvalidNombreException("El nombre y los apellidos del programador no pueden tener más de 20 caracteres");
        }
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
}

