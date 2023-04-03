
package Ej6_42_43_44;

import java.util.Comparator;

public class ComparaNombres implements Comparator<Socio> {

    @Override
    public int compare(Socio s1, Socio s2) {
        return s1.getNombre().compareTo(s2.getNombre());
    }

}
