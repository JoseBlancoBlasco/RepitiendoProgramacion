package Ej01;

public class CuentaCorriente {

    final String DNI;
    public String nombre;
    private double saldo;
    public String nombreBanco;

    public CuentaCorriente(String DNI, String nombre, String nombreBanco) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.saldo = 0;
        this.nombreBanco = nombreBanco;
    }

    public CuentaCorriente(String DNI, double saldo) {
        this.DNI = DNI;
        this.saldo = saldo;
    }

    public CuentaCorriente(String DNI, String nombre, double saldo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public void sacarDinero(double dinero) {
        if (this.saldo >= dinero) {
            this.saldo -= dinero;
        } else {
            System.out.println("No hay saldo suficiente para efectuar la operacion.");
        }
    }

    public void ingresarDinero(double dinero) {
        this.saldo += dinero;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "DNI=" + DNI + ", nombre=" + nombre + ", saldo=" + saldo + ", nombreBanco=" + nombreBanco + '}';
    }

    
    
    

}
