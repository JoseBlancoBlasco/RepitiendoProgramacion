package Ej6_48;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable<Socio> {

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

    public String getNombre() {
        return nombre;
    }    

    @Override
    public int compareTo(Socio t) {
        return -1 * fechaNacimiento.compareTo(t.fechaNacimiento);
    }

    @Override
    public String toString() {
        return "Socio{" + "Id=" + id + ", Nombre=" + nombre + ", Edad=" + edad() + '}' + "\n";
    }

}
