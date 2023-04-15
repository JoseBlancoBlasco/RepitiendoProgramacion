package Ej6_34_35;

import java.util.Comparator;

public class ComparaEdadNombre implements Comparator <Futbolista>{

    private ComparaEdad comparaEdad = new ComparaEdad();
    private ComparaNombres comparaNombres = new ComparaNombres();

    @Override
    public int compare(Futbolista f1, Futbolista f2) {
        int comparacionEdad = comparaEdad.compare(f1, f2);
        if (comparacionEdad == 0) {
            return comparaNombres.compare(f1, f2);
        } else {
            return comparacionEdad;
        }
    }
}
