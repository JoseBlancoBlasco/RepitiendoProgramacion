public class Pastor extends Sujeto {

    public Pastor(int id, int vida, int monedas, int posX, int posY, int velocidad) {
        super(id, vida, monedas, posX, posY, velocidad);
    }

    public Pastor() {
        super();
    }

    @Override
    public int cobrar(int cantidad) {
        setMonedas(getMonedas() + cantidad);
        return getMonedas();
    }

    @Override
    public int pagar(int cantidad) {
        setMonedas(getMonedas() - cantidad);
        return getMonedas();
    }

    @Override
    public boolean subir() {
        if (getPosY() - getVelocidad() >= 0) {
            setPosY(getPosY() - getVelocidad());
            return true;
        }
        return false;
    }

    @Override
    public boolean bajar() {
        if (getPosY() + getVelocidad() <= Tablero.MAX_POS_Y) {
            setPosY(getPosY() + getVelocidad());
            return true;
        }
        return false;
    }

    @Override
    public boolean derecha() {
        if (getPosX() + getVelocidad() <= Tablero.MAX_POS_X) {
            setPosX(getPosX() + getVelocidad());
            return true;
        }
        return false;
    }

    @Override
    public boolean izquierda() {
        if (getPosX() - getVelocidad() >= 0) {
            setPosX(getPosX() - getVelocidad());
            return true;
        }
        return false;
    }

    @Override
    public boolean irA(int posX, int posY) {
        int distancia = (int) Math.sqrt(Math.pow(posX - getPosX(), 2) + Math.pow(posY - getPosY(), 2));
        if (distancia <= getVelocidad()) {
            setPosX(posX);
            setPosY(posY);
            return true;
        } else {
            setPosX(getPosX() + (int) Math.round(getVelocidad() * (posX - getPosX()) / distancia));
            setPosY(getPosY() + (int) Math.round(getVelocidad() * (posY - getPosY()) / distancia));
            return false;
        }
    }

    @Override
    public String toString() {
        return "Pastor " + getId();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pastor)) return false;
        Pastor pastor = (Pastor) o;
        return getId() == pastor.getId();
    }

    @Override
    public int compareTo(Sujeto s) {
        return Integer.compare(getId(), s.getId());
    }
}

