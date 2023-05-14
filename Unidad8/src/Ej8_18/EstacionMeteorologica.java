/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej8_18;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstacionMeteorologica {
    private List<RegistroTemperatura> registros;

    public EstacionMeteorologica() {
        registros = new ArrayList<>();
    }

    public void nuevoRegistro(double temperatura) {
        LocalDateTime hora = LocalDateTime.now();
        RegistroTemperatura registro = new RegistroTemperatura(temperatura, hora);
        registros.add(registro);
        System.out.println("Nuevo registro añadido.");
    }

    public void listarRegistros() {
        if (registros.isEmpty()) {
            System.out.println("No hay registros.");
            return;
        }

        System.out.println("Registros:");
        for (RegistroTemperatura registro : registros) {
            System.out.println(registro);
        }
    }

    public void mostrarEstadistica() {
        if (registros.isEmpty()) {
            System.out.println("No hay registros.");
            return;
        }

        double maxima = Double.MIN_VALUE;
        double minima = Double.MAX_VALUE;
        double suma = 0;

        for (RegistroTemperatura registro : registros) {
            double temperatura = registro.getTemperatura();
            if (temperatura > maxima) {
                maxima = temperatura;
            }
            if (temperatura < minima) {
                minima = temperatura;
            }
            suma += temperatura;
        }

        double promedio = suma / registros.size();

        System.out.println("Estadísticas:");
        System.out.println("Máxima temperatura: " + maxima);
        System.out.println("Mínima temperatura: " + minima);
        System.out.println("Temperatura promedio: " + promedio);
    }

    public static void main(String[] args) {
        EstacionMeteorologica estacion = new EstacionMeteorologica();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("MENU:");
            System.out.println("1. Nuevo registro");
            System.out.println("2. Listar registros");
            System.out.println("3. Mostrar estadística");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la temperatura en grados centígrados: ");
                    double temperatura = scanner.nextDouble();
                    estacion.nuevoRegistro(temperatura);
                    break;
                case 2:
                    estacion.listarRegistros();
                    break;
                case 3:
                    estacion.mostrarEstadistica();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 4);
    }
}

class RegistroTemperatura {
    private double temperatura;
    private LocalDateTime hora;

    public RegistroTemperatura(double temperatura, LocalDateTime hora) {
        this.temperatura = temperatura;
        this.hora = hora;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    @Override
    public String toString() {
        return "Temperatura: " + temperatura + " °C, Hora: " + hora;
    }
}

