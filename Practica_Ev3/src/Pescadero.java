
public class Pescadero extends Sujeto implements Dinero, Movimiento {

    public Pescadero() {
        super();
    }

    public Pescadero(int id, int cantidadVida, int cantidadMonedas, int posX, int posY, int velocidadMovimiento,
            int[] cantidadRecursos, int monedas) {
        super();
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

    public void recolectarRecurso(Recurso recurso) {
        switch (recurso.getTipo()) {
            case HARINA:
                agregarCantidadRecurso(1, 0);
                break;
            case PEZ:
                agregarCantidadRecurso(10, 1);
                break;
            case ORO:
                agregarCantidadRecurso(1, 2);
                break;
            case BOSQUE:
                agregarCantidadRecurso(1, 3);
                break;
            case GANADO:
                agregarCantidadRecurso(3, 4);
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

    public int pescadoEnTrucha(Sujeto sujeto, int cantidad) {
        if (cantidad > 0 
                && sujeto instanceof Pescadero 
                && sujeto.getCantidadRecursos()[1] >= cantidad) {
            int maderaObtenida = cantidad * 10;
            sujeto.quitarCantidadRecurso(cantidad, 1);
            this.agregarCantidadRecurso(maderaObtenida, 12);
            return maderaObtenida;
        } else if (cantidad > 0 
                && !(sujeto instanceof Pescadero) 
                && sujeto.getCantidadRecursos()[3] >= cantidad) {
            int maderaObtenida = cantidad * 10;
            sujeto.quitarCantidadRecurso(cantidad, 1);
            this.agregarCantidadRecurso(5, 12); //impuesto por transformar
            sujeto.agregarCantidadRecurso(maderaObtenida - 5, 12);
            return maderaObtenida - 5;
        } else {
            return 0;
        }
    }
    
    public int pescadoEnCangrejo(Sujeto sujeto, int cantidad) {
        if (cantidad > 0 
                && sujeto instanceof Pescadero 
                && sujeto.getCantidadRecursos()[1] >= cantidad) {
            int combustibleObtenido = cantidad * 10;
            sujeto.quitarCantidadRecurso(cantidad, 13);
            this.agregarCantidadRecurso(combustibleObtenido, 13);
            return combustibleObtenido;
        } else if (cantidad > 0 
                && !(sujeto instanceof Leñador) 
                && sujeto.getCantidadRecursos()[1] >= cantidad) {
            int combustibleObtenido = cantidad * 10;
            sujeto.quitarCantidadRecurso(cantidad, 1);
            this.agregarCantidadRecurso(combustibleObtenido, 13); //impuesto por transformar
            sujeto.agregarCantidadRecurso(combustibleObtenido - 5, 13);
            return combustibleObtenido - 5;
        } else {
            return 0;
        }
    }

    @Override
    public void transaccion(Sujeto sujeto, Recurso recurso, int cantidad) {
        if (recurso.getTipo() == TipoRecurso.TRUCHAS 
                && this.getCantidadRecursos()[12] >= cantidad
                && sujeto.getCantidadMonedas() >= 5 * cantidad) {
            this.agregarCantidadRecurso(5 * cantidad, 14);
            this.quitarCantidadRecurso(cantidad, 12);
            sujeto.agregarCantidadRecurso(cantidad, 12);
            sujeto.quitarCantidadRecurso(5 * cantidad, 14);            
            
        } else if (recurso.getTipo() == TipoRecurso.CANGREJOS 
                && this.getCantidadRecursos()[13] >= cantidad
                && sujeto.getCantidadMonedas() >= 3 * cantidad) {
            this.agregarCantidadRecurso(5 * cantidad, 14);
            this.quitarCantidadRecurso(cantidad, 13);
            sujeto.agregarCantidadRecurso(cantidad, 13);
            sujeto.quitarCantidadRecurso(5 * cantidad, 14);
        } else {
            System.out.println("No trabajo ese recurso.");
        }
    }
}
