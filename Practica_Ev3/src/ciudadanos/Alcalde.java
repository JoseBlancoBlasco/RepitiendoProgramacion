package ciudadanos;


import core.Recurso;
import core.Dinero;
import core.Movimiento;
import core.Sujeto;
import java.util.List;


public class Alcalde extends Sujeto implements Movimiento, Dinero{

    private double recaudacion;
    
    public Alcalde(){
        super();
        this.recaudacion = 0;
    }

    public Alcalde(int id, int cantidadVida, int posX, int posY, int velocidadMovimiento,
            double[] cantidadRecursos, double tasaImpuestos, double recaudacion) {
        super();
        this.recaudacion = recaudacion;
    }

    public void redistribuirImpuestos(List<Alguacil> alguaciles, List<Sujeto> sujetos) {
        if (alguaciles.isEmpty()) {
            System.out.println("No hay alguaciles para recaudar impuestos.");
            return;
        }

        if (sujetos.isEmpty()) {
            System.out.println("No hay sujetos para redistribuir impuestos.");
            return;
        }

        double impuestosTotales = 0;
        for (Alguacil alguacil : alguaciles) {
            impuestosTotales += alguacil.getRecaudacion();
            alguacil.setRecaudacion(0);
        }

        if (impuestosTotales == 0) {
            System.out.println("No hay impuestos recaudados para redistribuir.");
            return;
        }

        int totalSujetos = sujetos.size();
        double impuestosPorSujeto = impuestosTotales / totalSujetos;

        for (Sujeto sujeto : sujetos) {
            sujeto.getCantidadRecursos()[14] += impuestosPorSujeto;
        }

        this.recaudacion += impuestosTotales;
    }

    public double getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(double recaudacion) {
        this.recaudacion = recaudacion;
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
    
    @Override
    public void transaccion(Sujeto sujeto, Recurso recurso, int cantidad, double precio) {
        System.out.println("Como buen Alcalde que soy, no produzco nada solo hago gasto público.");
    }
    
}
