
public interface Dinero {

    void transaccion(Sujeto sujeto, Recurso recurso, int cantidad, double precio);

    public double entregarImpuestos();
}
