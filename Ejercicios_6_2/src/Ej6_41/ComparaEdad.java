
package Ej6_41;

import java.util.Comparator;


public class ComparaEdad implements Comparator<Socio>{

    @Override
    public int compare(Socio s1, Socio s2) {
        return ((Socio)s1).edad() - ((Socio)s2).edad();
    }
    
}
