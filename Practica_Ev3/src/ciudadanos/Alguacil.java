package ciudadanos;

import core.Recurso;
import core.Dinero;
import core.Movimiento;
import core.Sujeto;

public class Alguacil extends Sujeto implements Dinero, Movimiento {

    private double recaudacion;

    public Alguacil() {
        super();
        this.recaudacion = 0;
    }

    public Alguacil(int id, int cantidadVida, int posX, int posY, int velocidadMovimiento,
            int[] cantidadRecursos, int recaudacion) {
        super();
        this.recaudacion = recaudacion;
    }

    public double getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(int recaudacion) {
        this.recaudacion = recaudacion;
    }

    public void addRecaudacion(double recaudacion) {
        this.recaudacion += recaudacion;
    }

    @Override
    public String toString() {
        return "Alguacil{" + "recaudacion=" + recaudacion + '}';
    }

    @Override
    public boolean subir() {
        if (getPosY() > 0) {
            setPosY(getPosY() - 1);
            return true;
        }
        return false;
    }

    @Override
    public boolean bajar() {
        if (getPosY() < 49) {
            setPosY(getPosY() + 1);
            return true;
        }
        return false;
    }

    @Override
    public boolean derecha() {
        if (getPosX() < 49) {
            setPosX(getPosX() + 1);
            return true;
        }
        return false;
    }

    @Override
    public boolean izquierda() {
        if (getPosX() > 0) {
            setPosX(getPosX() - 1);
            return true;
        }
        return false;
    }

    @Override
    public boolean irA(int posX, int posY) {
        if (posX < 0 || posX > 49 || posY < 0 || posY > 49) {
            return false;
        }
        setPosX(posX);
        setPosY(posY);
        return true;
    }
    
    public void recolectarRecurso(Recurso recurso) {
        switch (recurso.getTipo()) {
            case HARINA:
                agregarCantidadRecurso(1, 0);
                recurso.extraerRecurso(1);
                break;
            case PEZ:
                agregarCantidadRecurso(1, 1);
                recurso.extraerRecurso(1);
                break;
            case ORO:
                agregarCantidadRecurso(1, 2);
                recurso.extraerRecurso(1);
                break;
            case BOSQUE:
                agregarCantidadRecurso(1, 3);
                recurso.extraerRecurso(1);
                break;
            case GANADO:
                agregarCantidadRecurso(1, 4);
                recurso.extraerRecurso(1);
                break;
            case FRUTA:
                agregarCantidadRecurso(1, 5);
                recurso.extraerRecurso(1);
                break;
            case VERDURA:
                agregarCantidadRecurso(1, 6);
                recurso.extraerRecurso(1);
                break;
            default:
                break;
        }
    }

    @Override
    public void transaccion(Sujeto sujeto, Recurso recurso, int cantidad, double precio) {

    }

    public void cobrarImpuestos(Sujeto sujeto) {
        addRecaudacion(sujeto.entregarImpuestos());
    }

    public void entregarRecaudacion(Alcalde alcalde) {
        alcalde.setRecaudacion(alcalde.getRecaudacion() + getRecaudacion());
        setRecaudacion(0);
        System.out.println("Aqui tiene el dinero del pueblo querido emérito.");
    }

}
