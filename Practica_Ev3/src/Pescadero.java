
public class Pescadero extends Sujeto implements Dinero, Movimiento {

    private int cantidadPescado;
    private int monedas;

    public Pescadero() {
        super();
        this.cantidadPescado = 0;
        this.monedas = 0;
    }

    public Pescadero(int id, int posX, int posY, int cantidadPescado, int monedas) {
        super();
        this.cantidadPescado = cantidadPescado;
        this.monedas = monedas;
    }

    public int getCantidadPescado() {
        return cantidadPescado;
    }

    public void setCantidadPescado(int cantidadPescado) {
        this.cantidadPescado = cantidadPescado;
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
        
        if (tipo.equals("trucha")) {
            this.monedas += 5 * cantidad;
        } else if (tipo.equals("cangrejo")) {
            this.monedas += 3 * cantidad;
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

    public boolean pescarTrucha(int cantidad) {
        if (cantidad > 0) {
            int pescadoObtenido = cantidad * 5;
            this.cantidadPescado += pescadoObtenido;
            return true;
        } else {
            return false;
        }
    }

    public boolean pescarCangrejo(int cantidad) {
        if (cantidad > 0) {
            int pescadoObtenido = cantidad * 2;
            this.cantidadPescado += pescadoObtenido;
            return true;
        } else {
            return false;
        }
    }    

}
