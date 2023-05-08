package ciudadanos;


import core.Recurso;
import core.TipoRecurso;
import core.Dinero;
import core.Movimiento;
import core.Sujeto;


public class Carpintero extends Sujeto implements Dinero, Movimiento {

    private double cajaImpuestos;
    
    public Carpintero() {
        super();
        this.cajaImpuestos = 0;
    }

    public Carpintero(int id, int cantidadVida, int posX, int posY, int velocidadMovimiento,
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
                recurso.extraerRecurso(1);
                break;
            case PEZ:
                agregarCantidadRecurso(1, 1);
                recurso.extraerRecurso(1);
                break;
            case ORO:
                agregarCantidadRecurso(3, 2);
                recurso.extraerRecurso(3);
                break;
            case BOSQUE:
                agregarCantidadRecurso(3, 3);
                recurso.extraerRecurso(3);
                break;
            case GANADO:
                agregarCantidadRecurso(1, 4);
                recurso.extraerRecurso(1);
                break;
            case FRUTA:
                agregarCantidadRecurso(1, 5);
                recurso.extraerRecurso(1);
                break;
            case VERDURA:
                agregarCantidadRecurso(1, 6);
                recurso.extraerRecurso(1);
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
            if (recurso.getTipo() == TipoRecurso.MUEBLES
                    && this.getCantidadRecursos()[10] >= cantidad
                    && sujeto.getDinero() >= precio * cantidad) {
                this.agregarCantidadRecurso(precio * cantidad, 14);
                this.quitarCantidadRecurso(cantidad, 10);
                addCajaImpuestos(precio * cantidad * getTasaImpuestos());
                this.quitarCantidadRecurso(precio * cantidad * getTasaImpuestos(), 14);
                sujeto.agregarCantidadRecurso(cantidad, 10);
                sujeto.quitarCantidadRecurso(precio * cantidad, 14);
            } else {
                if (recurso.getTipo() == TipoRecurso.MUEBLES
                        && this.getCantidadRecursos()[10] < cantidad) {
                    throw new RecursoInsuficienteException("No hay suficientes MUEBLES disponible.");
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
