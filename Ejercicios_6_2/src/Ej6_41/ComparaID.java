package Ej6_41;

import java.util.Comparator;

public class ComparaID implements Comparator<Socio> {

    @Override
    public int compare(Socio s1, Socio s2) {
        return ((Socio)s1).getId() - ((Socio)s2).getId();
    }

}
