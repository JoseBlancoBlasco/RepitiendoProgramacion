package ciudadanos;

import core.Recurso;
import core.Dinero;
import core.Movimiento;
import core.Sujeto;
import core.TipoRecurso;


public class Pescadero extends Sujeto implements Dinero, Movimiento {
    
    private double cajaImpuestos;

    public Pescadero() {
        super();
        this.cajaImpuestos = 0;
    }

    public Pescadero(int id, int cantidadVida, int posX, int posY, int velocidadMovimiento,
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
            if (recurso.getTipo() == TipoRecurso.TRUCHAS
                    && this.getCantidadRecursos()[12] >= cantidad
                    && sujeto.getDinero() >= precio * cantidad) {
                this.agregarCantidadRecurso(precio * cantidad, 14);
                this.quitarCantidadRecurso(cantidad, 12);
                addCajaImpuestos(precio * cantidad * getTasaImpuestos());
                this.quitarCantidadRecurso(precio * cantidad * getTasaImpuestos(), 14);
                sujeto.agregarCantidadRecurso(cantidad, 12);
                sujeto.quitarCantidadRecurso(precio * cantidad, 14);
            } else if (recurso.getTipo() == TipoRecurso.CANGREJOS
                    && this.getCantidadRecursos()[13] >= cantidad
                    && sujeto.getDinero() >= precio * cantidad) {
                this.agregarCantidadRecurso(precio * cantidad, 14);
                this.quitarCantidadRecurso(cantidad, 13);
                addCajaImpuestos(precio * cantidad * getTasaImpuestos());
                this.quitarCantidadRecurso(precio * cantidad * getTasaImpuestos(), 14);
                sujeto.agregarCantidadRecurso(cantidad, 13);
                sujeto.quitarCantidadRecurso(precio * cantidad, 14);
            } else {
                if (recurso.getTipo() == TipoRecurso.TRUCHAS
                        && this.getCantidadRecursos()[12] < cantidad) {
                    throw new RecursoInsuficienteException("No hay suficientes TRUCHAS disponibles.");
                } else if (recurso.getTipo() == TipoRecurso.CANGREJOS
                        && this.getCantidadRecursos()[13] < cantidad) {
                    throw new RecursoInsuficienteException("No hay suficientes CANGREJOS disponibles.");
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
