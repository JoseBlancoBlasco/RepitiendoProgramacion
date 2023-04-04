
package Ej6_48;

import java.util.Comparator;

public class ComparaNombreEdad implements Comparator<Socio>{
    @Override
    public int compare(Socio s1, Socio s2) {
        int resultado = s1.getNombre().compareTo(s2.getNombre());
        if (resultado == 0) {
            resultado = s1.compareTo(s2);
        }
        return resultado;
    }
}
