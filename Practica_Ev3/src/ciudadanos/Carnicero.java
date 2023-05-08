package ciudadanos;


import core.Recurso;
import core.TipoRecurso;
import core.Dinero;
import core.Movimiento;
import core.Sujeto;


public class Carnicero extends Sujeto implements Dinero, Movimiento {

    private double cajaImpuestos;

    public Carnicero() {
        super();
        this.cajaImpuestos = 0;
    }

    public Carnicero(int id, int cantidadVida, int posX, int posY, int velocidadMovimiento,
            double[] cantidadRecursos, double tasaImpuestos, double cajaImpuestos) {
        super();
        this.cajaImpuestos = cajaImpuestos;
    }

    public double getCajaImpuestos() {
        return cajaImpuestos;
    }

    public void setCajaImpuestos(double cajaImpuestos) {
        this.cajaImpuestos = cajaImpuestos;
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
                && !(sujeto instanceof Carnicero)
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
                recurso.extraerRecurso(1);
                break;
            case PEZ:
                agregarCantidadRecurso(1, 1);
                recurso.extraerRecurso(1);
                break;
            case ORO:
                agregarCantidadRecurso(1, 2);
                recurso.extraerRecurso(1);
                break;
            case BOSQUE:
                agregarCantidadRecurso(1, 3);
                recurso.extraerRecurso(1);
                break;
            case GANADO:
                agregarCantidadRecurso(10, 4);
                recurso.extraerRecurso(10);
                break;
            case FRUTA:
                agregarCantidadRecurso(2, 5);
                recurso.extraerRecurso(2);
                break;
            case VERDURA:
                agregarCantidadRecurso(2, 6);
                recurso.extraerRecurso(2);
                break;
            default:
                break;
        }
    }

    public void addCajaImpuestos(double cantidad) {
        this.cajaImpuestos += cantidad;
    }

    public class RecursoInsuficienteException extends Exception {

        public RecursoInsuficienteException(String message) {
            super(message);
        }
    }

    public class DineroInsuficienteException extends Exception {

        public DineroInsuficienteException(String message) {
            super(message);
        }
    }

    @Override
    public void transaccion(Sujeto sujeto, Recurso recurso, int cantidad, double precio) {
        try {
            if (recurso.getTipo() == TipoRecurso.CARNE
                    && this.getCantidadRecursos()[11] >= cantidad
                    && sujeto.getDinero() >= precio * cantidad) {
                this.agregarCantidadRecurso(precio * cantidad, 14);
                this.quitarCantidadRecurso(cantidad, 11);
                addCajaImpuestos(precio * cantidad * getTasaImpuestos());
                this.quitarCantidadRecurso(precio * cantidad * getTasaImpuestos(), 14);
                sujeto.agregarCantidadRecurso(cantidad, 11);
                sujeto.quitarCantidadRecurso(precio * cantidad, 14);
            } else {
                if (recurso.getTipo() == TipoRecurso.CARNE
                        && this.getCantidadRecursos()[11] < cantidad) {
                    throw new RecursoInsuficienteException("No hay suficiente CARNE disponible.");
                } else {
                    throw new DineroInsuficienteException("No tienes suficiente dinero.");
                }
            }
        } catch (RecursoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (DineroInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public double entregarImpuestos() {
        double entrega = getCajaImpuestos();
        setCajaImpuestos(0);
        return entrega;
    }
}
