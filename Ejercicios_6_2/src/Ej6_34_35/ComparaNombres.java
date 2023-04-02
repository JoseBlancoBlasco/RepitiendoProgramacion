package Ej6_34_35;

import java.util.Comparator;

public class ComparaNombres implements Comparator<Futbolista> {

    @Override
    public int compare(Futbolista f1, Futbolista f2) {
        return ((Futbolista) f1).getNombre().compareTo(((Futbolista) f2).getNombre());
    }

}
