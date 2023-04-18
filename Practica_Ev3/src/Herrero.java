
public class Herrero extends Sujeto implements Dinero, Movimiento {    

    public Herrero() {
        super();        
    }

    public Herrero(int id, int cantidadVida, int cantidadMonedas, int posX, int posY, int velocidadMovimiento,
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

    public int oroEnMonedas(Sujeto sujeto, int cantidad) {
        if (cantidad > 0 
                && sujeto instanceof Herrero 
                && this.getCantidadRecursos()[2] >= cantidad) {
            this.quitarCantidadRecurso(cantidad, 2);
            int monedasObtenidas = cantidad * 10;
            this.agregarCantidadRecurso(monedasObtenidas, 14);
            return monedasObtenidas;
        } else if (cantidad > 0 
                && !(sujeto instanceof Herrero) 
                && sujeto.getCantidadRecursos()[2] >= cantidad) {
            sujeto.quitarCantidadRecurso(cantidad, 2);
            int monedasObtenidas = cantidad * 10;
            this.agregarCantidadRecurso(2, 14);; //impuesto por transformar
            sujeto.agregarCantidadRecurso(monedasObtenidas - 2, 14);
            return monedasObtenidas - 2;
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
                agregarCantidadRecurso(5, 2);
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
        if (recurso.getTipo() == TipoRecurso.ORO
                && this.getCantidadRecursos()[2] >= cantidad
                && sujeto.getCantidadMonedas() >= 8 * cantidad) {
            this.agregarCantidadRecurso(8 * cantidad, 14);            
            this.quitarCantidadRecurso(cantidad, 2);
            sujeto.agregarCantidadRecurso(cantidad, 2);
            sujeto.quitarCantidadRecurso(8 * cantidad, 14);            
        } else {
            System.out.println("No trabajo ese recurso.");
        }
    }   
    
}
