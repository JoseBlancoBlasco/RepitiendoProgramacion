public class Carnicero extends Sujeto implements Dinero, Movimiento {

    private int monedas;

    public Carnicero() {
        super();
        this.monedas = 0;
    }

    public Carnicero(int id, int cantidadVida, int cantidadMonedas, int posX, int posY, int velocidadMovimiento,
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
    
    public int ganadoEnCarne(Sujeto sujeto, int cantidad) {
        if (cantidad > 0 
                && sujeto instanceof Carnicero 
                && sujeto.getCantidadRecursos()[4] >= cantidad) {
            int carneObtenida = cantidad * 10;
            sujeto.quitarCantidadRecurso(cantidad, 3);
            this.agregarCantidadRecurso(carneObtenida, 11);
            return carneObtenida;
        } else if (cantidad > 0 
                && !(sujeto instanceof Leñador) 
                && sujeto.getCantidadRecursos()[4] >= cantidad) {
            int combustibleObtenido = cantidad * 10;
            sujeto.quitarCantidadRecurso(cantidad, 3);
            this.agregarCantidadRecurso(combustibleObtenido, 11); //impuesto por transformar
            sujeto.agregarCantidadRecurso(combustibleObtenido - 5, 11);
            return combustibleObtenido - 5;
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
                agregarCantidadRecurso(1, 2);
                break;
            case BOSQUE:
                agregarCantidadRecurso(1, 3);
                break;
            case GANADO:
                agregarCantidadRecurso(10, 4);
                break;
            case FRUTA:
                agregarCantidadRecurso(2, 5);
                break;
            case VERDURA:
                agregarCantidadRecurso(2, 6);
                break;
            default:
                break;
        }
    }

    @Override
    public void transaccion(Sujeto sujeto, Recurso recurso, int cantidad) {
        if (recurso.getTipo() == TipoRecurso.CARNE 
                && this.getCantidadRecursos()[4] >= cantidad
                && sujeto.getCantidadMonedas() >= 5 * cantidad) {
            this.monedas += 5 * cantidad;
            this.quitarCantidadRecurso(cantidad, 4);
            sujeto.setCantidadMonedas(sujeto.getCantidadMonedas() - cantidad);
            sujeto.agregarCantidadRecurso(cantidad, 11);
        }else {
            System.out.println("No trabajo ese recurso.");
        }
    }
}
