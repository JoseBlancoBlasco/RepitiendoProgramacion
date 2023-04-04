
package Ej6_45_46_47;

import Ej6_42_43_44.Socio;

import java.util.Comparator;

public class ComparaSocioEdad implements Comparator<Socio> {

    @Override
    public int compare(Socio o1, Socio o2) {
        return ((Socio)o1).edad() - ((Socio)o2).edad();
    }
    
}
