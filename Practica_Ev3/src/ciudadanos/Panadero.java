package ciudadanos;


import core.Recurso;
import core.TipoRecurso;
import core.Dinero;
import core.Movimiento;
import core.Sujeto;


public class Panadero extends Sujeto implements Dinero, Movimiento {

    private double cajaImpuestos;

    public Panadero() {
        super();
        this.cajaImpuestos = 0;
    }

    public Panadero(int id, int cantidadVida, int posX, int posY, int velocidadMovimiento,
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
                recurso.extraerRecurso(10);
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
            if (recurso.getTipo() == TipoRecurso.HARINA
                    && this.getCantidadRecursos()[0] >= cantidad
                    && sujeto.getDinero() >= precio * cantidad) {
                this.agregarCantidadRecurso(precio * cantidad, 14);
                this.quitarCantidadRecurso(cantidad, 0);
                addCajaImpuestos(precio * cantidad * getTasaImpuestos());
                this.quitarCantidadRecurso(precio * cantidad * getTasaImpuestos(), 14);
                sujeto.agregarCantidadRecurso(cantidad, 0);
                sujeto.quitarCantidadRecurso(precio * cantidad, 14);
            } else {
                if (recurso.getTipo() == TipoRecurso.CARNE
                        && this.getCantidadRecursos()[0] < cantidad) {
                    throw new RecursoInsuficienteException("No hay suficiente HARINA disponible.");
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
