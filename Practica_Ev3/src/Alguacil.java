
public class Alguacil extends Sujeto implements Dinero, Movimiento {

    private int recaudacion;

    public Alguacil() {
        super();
        this.recaudacion = 0;
    }

    public Alguacil(int id, int cantidadVida, int posX, int posY, int velocidadMovimiento,
            int[] cantidadRecursos, int recaudacion) {
        super();
        this.recaudacion = recaudacion;
    }

    public int getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(int recaudacion) {
        this.recaudacion = recaudacion;
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

    @Override
    public void transaccion(Sujeto sujeto, Recurso recurso, int cantidad) {
        //Implementar
    }

    public void cobrarImpuestos(Sujeto sujeto) {
        double impuestos = sujeto.getDinero() * 0.1;
        recaudacion += impuestos;
        double nuevoDinero = sujeto.getDinero() - impuestos;
        sujeto.setDinero(nuevoDinero);
    }

}
