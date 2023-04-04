package Ej6_45_46_47;

import java.util.Comparator;

public class ComparaStrings implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }

}
