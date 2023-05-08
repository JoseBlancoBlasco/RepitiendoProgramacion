package ciudadanos;


import core.Recurso;
import core.TipoRecurso;
import core.Dinero;
import core.Movimiento;
import core.Sujeto;


public class Leñador extends Sujeto implements Dinero, Movimiento {
    
    private double cajaImpuestos;

    public Leñador() {
        super();
    }

    public Leñador(int id, int cantidadVida, int posX, int posY, int velocidadMovimiento,
            double[] cantidadRecursos, double tasaImpuestos, double cajaImpuestos) {
        super();        
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
                agregarCantidadRecurso(1, 1);
                break;
            case ORO:
                agregarCantidadRecurso(1, 2);
                break;
            case BOSQUE:
                agregarCantidadRecurso(10, 3);
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

    public int bosqueEnMadera(Sujeto sujeto, int cantidad) {
        if (cantidad > 0
                && sujeto instanceof Leñador
                && sujeto.getCantidadRecursos()[3] >= cantidad) {
            int maderaObtenida = cantidad * 10;
            sujeto.quitarCantidadRecurso(cantidad, 3);
            this.agregarCantidadRecurso(maderaObtenida, 8);
            return maderaObtenida;
        } else if (cantidad > 0
                && !(sujeto instanceof Leñador)
                && sujeto.getCantidadRecursos()[3] >= cantidad) {
            int maderaObtenida = cantidad * 10;
            sujeto.quitarCantidadRecurso(cantidad, 3);
            this.agregarCantidadRecurso(5, 8); //impuesto por transformar
            sujeto.agregarCantidadRecurso(maderaObtenida - 5, 8);
            return maderaObtenida - 5;
        } else {
            return 0;
        }
    }

    public int bosqueEnCombustible(Sujeto sujeto, int cantidad) {
        if (cantidad > 0
                && sujeto instanceof Leñador
                && sujeto.getCantidadRecursos()[3] >= cantidad) {
            int combustibleObtenido = cantidad * 10;
            sujeto.quitarCantidadRecurso(cantidad, 3);
            this.agregarCantidadRecurso(combustibleObtenido, 9);
            return combustibleObtenido;
        } else if (cantidad > 0
                && !(sujeto instanceof Leñador)
                && sujeto.getCantidadRecursos()[3] >= cantidad) {
            int combustibleObtenido = cantidad * 10;
            sujeto.quitarCantidadRecurso(cantidad, 3);
            this.agregarCantidadRecurso(combustibleObtenido, 9); //impuesto por transformar
            sujeto.agregarCantidadRecurso(combustibleObtenido - 5, 9);
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
            if (recurso.getTipo() == TipoRecurso.MADERA
                    && this.getCantidadRecursos()[8] >= cantidad
                    && sujeto.getDinero() >= precio * cantidad) {
                this.agregarCantidadRecurso(precio * cantidad, 14);
                this.quitarCantidadRecurso(cantidad, 8);
                addCajaImpuestos(precio * cantidad * getTasaImpuestos());
                this.quitarCantidadRecurso(precio * cantidad * getTasaImpuestos(), 14);
                sujeto.agregarCantidadRecurso(cantidad, 8);
                sujeto.quitarCantidadRecurso(precio * cantidad, 14);
            } else if (recurso.getTipo() == TipoRecurso.COMBUSTIBLE
                    && this.getCantidadRecursos()[9] >= cantidad
                    && sujeto.getDinero() >= precio * cantidad) {
                this.agregarCantidadRecurso(precio * cantidad, 14);
                this.quitarCantidadRecurso(cantidad, 9);
                addCajaImpuestos(precio * cantidad * getTasaImpuestos());
                this.quitarCantidadRecurso(precio * cantidad * getTasaImpuestos(), 14);
                sujeto.agregarCantidadRecurso(cantidad, 9);
                sujeto.quitarCantidadRecurso(precio * cantidad, 14);
            } else {
                if (recurso.getTipo() == TipoRecurso.MADERA
                        && this.getCantidadRecursos()[5] < cantidad) {
                    throw new RecursoInsuficienteException("No hay suficiente MADERA disponible.");
                } else if (recurso.getTipo() == TipoRecurso.COMBUSTIBLE
                        && this.getCantidadRecursos()[6] < cantidad) {
                    throw new RecursoInsuficienteException("No hay suficiente COMBUSTIBLE disponible.");
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
