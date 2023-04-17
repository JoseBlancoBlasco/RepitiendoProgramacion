
public class Herrero extends Sujeto implements Dinero, Movimiento {

    private int monedas;

    public Herrero() {
        super();
        this.monedas = 0;
    }

    public Herrero(int id, int cantidadVida, int cantidadMonedas, int posX, int posY, int velocidadMovimiento,
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

    public int oroEnMonedas(Sujeto sujeto, int cantidad) {
        if (cantidad > 0 && sujeto instanceof Herrero 
                && this.getCantidadRecursos()[2] >= cantidad) {
            this.quitarCantidadRecurso(cantidad, 2);
            int oroObtenido = cantidad * 10;
            this.monedas += oroObtenido;
            return oroObtenido;
        } else if (cantidad > 0 && !(sujeto instanceof Herrero) 
                && sujeto.getCantidadRecursos()[2] >= cantidad) {
            sujeto.agregarCantidadRecurso(-cantidad, 2);
            int oroObtenido = cantidad * 10;
            this.monedas += 2; //impuesto por transformar
            sujeto.agregarCantidadRecurso(oroObtenido - 2, 2);
            return oroObtenido - 2;
        } else {
            return 0;
        }
    }

    public void recolectarRecurso(Recurso recurso) {
        switch (recurso.getTipo()) {
            case "harina":
                agregarCantidadRecurso(1, 0);
                break;
            case "pescado":
                agregarCantidadRecurso(1, 1);
                break;
            case "oro":
                agregarCantidadRecurso(5, 2);
                break;
            case "bosque":
                agregarCantidadRecurso(1, 3);
                break;
            case "ganado":
                agregarCantidadRecurso(1, 4);
                break;
            case "fruta":
                agregarCantidadRecurso(1, 5);
                break;
            case "verdura":
                agregarCantidadRecurso(1, 6);
                break;
            default:
                break;
        }
    }
    
    @Override
    public void transaccion(Sujeto sujeto, Recurso recurso, int cantidad) {
        if (recurso.getTipo().equals("oro") 
                && this.getCantidadRecursos()[2] >= cantidad
                && sujeto.getCantidadMonedas() >= 8 * cantidad) {
            this.monedas += 8 * cantidad;
            this.quitarCantidadRecurso(cantidad, 2);
            sujeto.agregarCantidadRecurso(cantidad, 2);
            sujeto.setCantidadMonedas(sujeto.getCantidadMonedas() - cantidad);
        } else {
            System.out.println("No trabajo ese recurso.");
        }
    }
}
