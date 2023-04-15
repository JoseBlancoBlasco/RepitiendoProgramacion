package Ej6_41;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;

public class Socio implements Comparator {

    private int id;
    private String nombre;
    private LocalDate fechaNacimiento;

    public Socio(int id, String nombre, String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f);
    }

    public int edad() {
        return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Socio{" + "Id=" + id + ", Nombre=" + nombre + ", Edad=" + edad() + '}' + "\n";
    }

    @Override
    public int compare(Object o1, Object o2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
