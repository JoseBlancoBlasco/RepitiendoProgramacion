
public class Agricultor extends Sujeto implements Dinero, Movimiento {

    private int monedas;

    public Agricultor() {
        super();
        this.monedas = 0;
    }

    public Agricultor(int id, int cantidadVida, int cantidadMonedas, int posX, int posY, int velocidadMovimiento,
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

    public void recolectarRecurso(Recurso recurso) {
        switch (recurso.getTipo()) {
            case HARINA:
                agregarCantidadRecurso(1, 0);
                break;
            case PEZ:
                agregarCantidadRecurso(3, 1);
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
                agregarCantidadRecurso(10, 5);
                break;
            case VERDURA:
                agregarCantidadRecurso(10, 6);
                break;
            default:
                break;
        }
    }

    @Override
    public void transaccion(Sujeto sujeto, Recurso recurso, int cantidad) {
        if (recurso.getTipo() == TipoRecurso.FRUTA 
                && this.getCantidadRecursos()[5] >= cantidad
                && sujeto.getCantidadMonedas() >= 5 * cantidad) {
            this.monedas += 5 * cantidad;
            this.quitarCantidadRecurso(cantidad, 5);
            sujeto.setCantidadMonedas(sujeto.getCantidadMonedas() - cantidad);
            sujeto.agregarCantidadRecurso(cantidad, 5);
        } else if (recurso.getTipo() == TipoRecurso.VERDURA
                && this.getCantidadRecursos()[6] >= cantidad
                && sujeto.getCantidadMonedas() >= 3 * cantidad) {
            this.monedas += 3 * cantidad;
            this.quitarCantidadRecurso(cantidad, 6);
            sujeto.setCantidadMonedas(sujeto.getCantidadMonedas() - cantidad);
            sujeto.agregarCantidadRecurso(cantidad, 6);
        } else {
            System.out.println("No trabajo ese recurso.");
        }
    }
}
