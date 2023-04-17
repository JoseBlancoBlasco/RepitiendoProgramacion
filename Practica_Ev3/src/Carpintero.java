
public class Carpintero extends Sujeto implements Dinero, Movimiento {

    private int monedas;

    public Carpintero() {
        super();
        this.monedas = 0;
    }

    public Carpintero(int id, int cantidadVida, int cantidadMonedas, int posX, int posY, int velocidadMovimiento,
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

    public int maderaEnMuebles(Sujeto sujeto, int cantidad) {
        if (cantidad > 0 
                && sujeto instanceof Carpintero 
                && sujeto.getCantidadRecursos()[8] >= cantidad) {
            int mueblesObtenidos = cantidad * 10;
            sujeto.quitarCantidadRecurso(cantidad, 10);
            this.agregarCantidadRecurso(cantidad, 10);
            return mueblesObtenidos;
        } else if (cantidad > 0 
                && !(sujeto instanceof Carpintero) 
                && sujeto.getCantidadRecursos()[8] >= cantidad) {
            int mueblesObtenido = cantidad * 10;
            sujeto.quitarCantidadRecurso(cantidad, 10);
            this.agregarCantidadRecurso(cantidad - 5, cantidad); //impuesto por transformar
            sujeto.agregarCantidadRecurso(mueblesObtenido - 5, 10);
            return mueblesObtenido - 5;
        } else {
            return 0;
        }
    }

    public void recolectarRecurso(Recurso recurso) {
        switch (recurso.getTipo()) {
            case HARINA:
                agregarCantidadRecurso(1, 0);
                break;
            case PEZ:
                agregarCantidadRecurso(1, 1);
                break;
            case ORO:
                agregarCantidadRecurso(3, 2);
                break;
            case BOSQUE:
                agregarCantidadRecurso(3, 3);
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
        if (recurso.getTipo() == TipoRecurso.MUEBLES
                && this.getCantidadRecursos()[10] >= cantidad
                && sujeto.getCantidadMonedas() >= 2 * cantidad) {
            this.monedas += 2 * cantidad;
            this.quitarCantidadRecurso(cantidad, 10);
            sujeto.setCantidadMonedas(sujeto.getCantidadMonedas() - cantidad);
            sujeto.agregarCantidadRecurso(cantidad, 10);
        } else {
            System.out.println("No trabajo ese recurso.");
        }
    }

}
