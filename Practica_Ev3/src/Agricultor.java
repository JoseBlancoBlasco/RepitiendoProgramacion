public class Agricultor extends Sujeto implements Dinero, Movimiento {
    private int frutaTotal;
    private int verduraTotal;
    private int monedas;

    public Agricultor() {
        super();
        this.frutaTotal = 0;
        this.verduraTotal = 0;
        this.monedas = 0;
    }

    public Agricultor(int id, int posX, int posY, int frutaTotal,int verduraTotal, int monedas) {
        super();
        this.frutaTotal = frutaTotal;
        this.verduraTotal = verduraTotal;
        this.monedas = monedas;
    }

    public int getFrutaTotal() {
        return this.frutaTotal;
    }

    public void setCantidadPescado(int frutaTotal) {
        this.frutaTotal = frutaTotal;
    }

    public int getVerduraTotal() {
        return verduraTotal;
    }

    public void setVerduraTotal(int verduraTotal) {
        this.verduraTotal = verduraTotal;
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
        
        if (tipo.equals("fruta")) {
            this.monedas += 5 * cantidad;
        } else if (tipo.equals("verdura")) {
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

    public boolean recolectarFruta(int cantidad) {
        if (cantidad > 0) {
            int frutaObtenida = cantidad * 5;
            this.frutaTotal += frutaObtenida;
            return true;
        } else {
            return false;
        }
    }

    public boolean recolectarVerdura(int cantidad) {
        if (cantidad > 0) {
            int verduraObtenida = cantidad * 2;
            this.verduraTotal += verduraObtenida;
            return true;
        } else {
            return false;
        }
    }
}