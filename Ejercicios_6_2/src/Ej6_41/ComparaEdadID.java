
package Ej6_41;

import java.util.Comparator;

public class ComparaEdadID implements Comparator <Socio>{

    private ComparaEdad comparaEdad = new ComparaEdad();
    private ComparaID comparaID = new ComparaID();

    @Override
    public int compare(Socio s1, Socio s2) {
        int comparacionEdad = comparaEdad.compare(s1, s2);
        if (comparacionEdad == 0) {
            return comparaID.compare(s1, s2);
        } else {
            return comparacionEdad;
        }
    }
}
