
public class Panadero extends Sujeto implements Dinero, Movimiento {

    private int monedas;

    public Panadero() {
        super();
        this.monedas = 0;
    }

    public Panadero(int id, int cantidadVida, int cantidadMonedas, int posX, int posY, int velocidadMovimiento,
            int[] cantidadRecursos, int monedas) {
        super();
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

    public int harinaEnPan(Sujeto sujeto, int cantidad) {
        if (cantidad > 0 && sujeto instanceof Panadero 
                && sujeto.getCantidadRecursos()[0] >= cantidad) {
            int panObtenido = cantidad * 10;
            sujeto.quitarCantidadRecurso(cantidad, 0);
            this.agregarCantidadRecurso(panObtenido, 7);
            return panObtenido;
        } else if (cantidad > 0 && !(sujeto instanceof Panadero) 
                && sujeto.getCantidadRecursos()[0] >= cantidad) {
            int panObtenido = cantidad * 10;
            sujeto.quitarCantidadRecurso(cantidad, 0);
            this.agregarCantidadRecurso(5, 7); //impuesto por transformar
            sujeto.agregarCantidadRecurso(panObtenido - 5, 0);
            return panObtenido - 5;
        } else {
            return 0;
        }
    }

    public void recolectarRecurso(Recurso recurso) {
        switch (recurso.getTipo()) {
            case HARINA:
                agregarCantidadRecurso(10, 0);
                break;
            case PEZ:
                agregarCantidadRecurso(1, 1);
                break;
            case ORO:
                agregarCantidadRecurso(1, 2);
                break;
            case BOSQUE:
                agregarCantidadRecurso(1, 3);
                break;
            case GANADO:
                agregarCantidadRecurso(1, 4);
                break;
            case FRUTA:
                agregarCantidadRecurso(1, 5);
                break;
            case VERDURA:
                agregarCantidadRecurso(1, 6);
                break;
            default:
                break;
        }
    }

    @Override
    public void transaccion(Sujeto sujeto, Recurso recurso, int cantidad) {
        if (recurso.getTipo() == TipoRecurso.HARINA 
                && this.getCantidadRecursos()[7] >= cantidad
                && sujeto.getCantidadMonedas() >= 2 * cantidad) {
            this.monedas += 2 * cantidad;
            this.quitarCantidadRecurso(cantidad, 7);
            sujeto.setCantidadMonedas(sujeto.getCantidadMonedas() - cantidad);
            sujeto.agregarCantidadRecurso(cantidad, 7);
        } else {
            System.out.println("No trabajo ese recurso.");
        }
    }

}
