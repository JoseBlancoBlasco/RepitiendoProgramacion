
public class Sujeto implements Comparable<Sujeto>, Movimiento {

    private int id;
    private int cantidadVida;
    private int posX;
    private int posY;
    private int velocidadMovimiento;
    private double[] cantidadRecursos;
    private double tasaImpuestos;

    //[harina,pescado, oro, bosque, ganado, fruta, verdura, pan, madera, combustible, muebles, carne, truchas, cangrejos, monedas]
    //    0      1      2      3       4      5       6      7      8         9          10      11      12        13       14
    public Sujeto() {
    }

    public Sujeto(int id, int cantidadVida, int posX, int posY, int velocidadMovimiento, double[] cantidadRecursos, double tasaImpuestos) {
        this.id = id;
        this.cantidadVida = cantidadVida;
        this.posX = posX;
        this.posY = posY;
        this.velocidadMovimiento = velocidadMovimiento;
        this.cantidadRecursos = new double[15];
        this.tasaImpuestos = tasaImpuestos;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidadVida() {
        return cantidadVida;
    }

    public void setCantidadVida(int cantidadVida) {
        this.cantidadVida = cantidadVida;
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

    public int getVelocidadMovimiento() {
        return velocidadMovimiento;
    }

    public void setVelocidadMovimiento(int velocidadMovimiento) {
        this.velocidadMovimiento = velocidadMovimiento;
    }

    public double[] getCantidadRecursos() {
        return cantidadRecursos;
    }

    public void setCantidadRecursos(double[] cantidadRecursos) {
        this.cantidadRecursos = cantidadRecursos;
    }

    public double getDinero() {
        return cantidadRecursos[14];
    }

    public void setDinero(double dinero) {
        cantidadRecursos[14] = dinero;
    }

    public double getTasaImpuestos() {
        return tasaImpuestos;
    }

    public void setTasaImpuestos(double tasaImpuestos) {
        this.tasaImpuestos = tasaImpuestos;
    }
    
    

    // Implementación del método equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Sujeto other = (Sujeto) obj;
        if (id != other.id) {
            return false;
        }
        return true;
    }

    // Implementación del método compareTo()
    @Override
    public int compareTo(Sujeto o) {
        if (this.id == o.getId()) {
            return 0;
        } else if (this.id > o.getId()) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public boolean subir() {
        if (posY > 0) {
            posY--;
            return true;
        }
        return false;
    }

    @Override
    public boolean bajar() {
        if (posY < 49) {
            posY++;
            return true;
        }
        return false;
    }

    @Override
    public boolean derecha() {
        if (posX < 49) {
            posX++;
            return true;
        }
        return false;
    }

    @Override
    public boolean izquierda() {
        if (posX > 0) {
            posX--;
            return true;
        }
        return false;
    }

    @Override
    public boolean irA(int posX, int posY) {
        if (posX >= 0 && posY >= 0 && posX < 50 && posY < 50) {
            this.posX = posX;
            this.posY = posY;
            return true;
        }
        return false;
    }

    public void agregarCantidadRecurso(int cantidad, int indice) {
        cantidadRecursos[indice] += cantidad;
    }

    public void quitarCantidadRecurso(int cantidad, int indice) {
        cantidadRecursos[indice] -= cantidad;
    }

}
