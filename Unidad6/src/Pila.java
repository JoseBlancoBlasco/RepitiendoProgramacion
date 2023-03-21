
public class Pila extends Lista {

    public void apilar(Integer elemento) {
        super.insertarFinal(elemento);
    }

    public Integer desapilar() {
        return super.eliminar(tabla.length - 1);
    }

    public Integer mirarUltimo() {
        if (tabla.length == 0) {
            return null;
        }
        return tabla[tabla.length - 1];
    }

    public boolean isEmpty() {
        return tabla.length == 0;
    }
}
