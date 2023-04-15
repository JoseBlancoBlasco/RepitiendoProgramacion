public abstract class Sujeto implements Comparable<Sujeto> {

    private int id;
    private int vida;
    private int monedas;
    private int posX;
    private int posY;
    private int velocidad;

    public Sujeto() {
        this.id = 0;
        this.vida = 0;
        this.monedas = 0;
        this.posX = 0;
        this.posY = 0;
        this.velocidad = 0;
    }

    public Sujeto(int id, int vida, int monedas, int posX, int posY, int velocidad) {
        this.id = id;
        this.vida = vida;
        this.monedas = monedas;
        this.posX = posX;
        this.posY = posY;
        this.velocidad = velocidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMonedas() {
        return monedas;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String toString() {
        return "Sujeto{" +
                "id=" + id +
                ", vida=" + vida +
                ", monedas=" + monedas +
                ", posX=" + posX +
                ", posY=" + posY +
                ", velocidad=" + velocidad +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sujeto sujeto = (Sujeto) o;
        return id == sujeto.id &&
                vida == sujeto.vida &&
                monedas == sujeto.monedas &&
                posX == sujeto.posX &&
                posY == sujeto.posY &&
                velocidad == sujeto.velocidad;
    }

    public int compareTo(Sujeto sujeto) {
        return Integer.compare(this.id, sujeto.getId());
    }

    public abstract boolean subir();
    public abstract boolean bajar();
    public abstract boolean derecha();
    public abstract boolean izquierda();
    public abstract boolean irA(int posX, int posY);
    public abstract int cobrar(int cantidad);
    public abstract int pagar(int cantidad);
}

