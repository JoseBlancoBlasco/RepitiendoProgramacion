
public class Panadero extends Sujeto implements Dinero, Movimiento {

    private int panTotal;
    private int monedas;

    public Panadero() {
        super();
        this.panTotal = 0;
        this.monedas = 0;
    }

    public Panadero(int id, int posX, int posY, int panTotal, int monedas) {
        super();
        this.panTotal = panTotal;
        this.monedas = monedas;
    }

    public int getCantidadPescado() {
        return panTotal;
    }

    public void setPanTotal(int pan) {
        this.panTotal = pan;
    }

    @Override
    public void setMonedas(int monedas) {
        this.monedas = monedas;
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
    public void cobrar(Recurso recurso) {
        String tipo = recurso.getTipo();
        int cantidad = recurso.getCantidad();

        if (tipo.equals("pan")) {
            this.monedas += 2 * cantidad;
        }
    }

    @Override
    public int pagar(int cantidad) {
        if (this.getMonedas() >= cantidad) {
            this.setMonedas(this.getMonedas() - cantidad);
            return this.getMonedas();
        } else {
            return -1;
        }
    }

    @Override
    public int getMonedas() {
        return this.monedas;
    }

    public boolean harinaEnPan(int cantidad) {
        if (cantidad > 0) {
            int panObtenido = cantidad * 10;
            this.panTotal += panObtenido;
            return true;
        } else {
            return false;
        }
    }

}
