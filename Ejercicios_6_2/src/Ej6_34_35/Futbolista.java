package Ej6_34_35;

public class Futbolista implements Comparable {

    private String DNI;
    private String nombre;
    private int edad;
    private int numeroGoles;

    public Futbolista(String DNI, String nombre, int edad, int numeroGoles) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.edad = edad;
        this.numeroGoles = numeroGoles;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public void setNumeroGoles(int numeroGoles) {
        this.numeroGoles = numeroGoles;
    }
    
    

    @Override
    public String toString() {
        return "Futbolista{" + "DNI=" + DNI + ", nombre=" + nombre + ", edad=" + edad + ", numeroGoles=" + numeroGoles + '}';
    }

    @Override
    public boolean equals(Object o) {
        Futbolista otroFutbolista = (Futbolista) o;
        boolean iguales;
        if (this.DNI.equals(otroFutbolista.DNI)
                && this.edad == otroFutbolista.edad
                && this.nombre.equals(otroFutbolista.nombre)
                && this.numeroGoles == otroFutbolista.numeroGoles) {
            iguales = true;
        } else {
            iguales = false;
        }
        return iguales;
    }

    @Override
    public int compareTo(Object o) {
        return DNI.compareTo(((Futbolista) o).DNI);
    }

}
