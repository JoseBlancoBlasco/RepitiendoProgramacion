
public class Recurso {

    private int cantidad;
    private TipoRecurso tipo;

    public Recurso() {
    }

    public Recurso(int cantidad, TipoRecurso tipo) {
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public int extraerRecurso(int cantidad) {
        if (cantidad >= this.cantidad) {
            this.cantidad -= cantidad;
            return cantidad;
        } else {
            System.out.println("Recurso agotado!");
            return 0;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public TipoRecurso getTipo() {
        return tipo;
    }

    public void setTipo(TipoRecurso tipo) {
        this.tipo = tipo;
    }

}
