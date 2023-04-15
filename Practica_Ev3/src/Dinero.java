public interface Dinero {
    void cobrar(Recurso recurso);
    int pagar(int cantidad);
    int getMonedas();
    void setMonedas(int cantidad);
}

