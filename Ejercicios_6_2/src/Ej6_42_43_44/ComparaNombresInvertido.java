package Ej6_42_43_44;

import java.util.Comparator;

public class ComparaNombresInvertido implements Comparator<Socio> {

    @Override
    public int compare(Socio s1, Socio s2) {
        return -1 * s1.getNombre().compareTo(s2.getNombre());
    }

}
