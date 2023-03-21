
import java.util.Arrays;


public class Conjunto extends Lista {

    public void insertar(Integer elemento) {
        if (!this.contiene(elemento)) {
            super.insertarFinal(elemento);
        }
    }

    public boolean contiene(Integer elemento) {
        for (int i = 0; i < this.tabla.length; i++) {
            if (this.tabla[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Conjunto)) {
            return false;
        }
        Conjunto conjunto = (Conjunto) o;
        if (conjunto.tabla.length != tabla.length) {
            return false;
        }
        Integer[] copia1 = Arrays.copyOf(tabla, tabla.length);
        Integer[] copia2 = Arrays.copyOf(conjunto.tabla, conjunto.tabla.length);
        Arrays.sort(copia1);
        Arrays.sort(copia2);
        for (int i = 0; i < copia1.length; i++) {
            if (copia1[i] != copia2[i]) {
                return false;
            }
        }
        return true;
    }

}
