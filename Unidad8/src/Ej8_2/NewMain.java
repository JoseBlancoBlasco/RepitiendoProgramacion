package Ej8_2;

import java.util.Arrays;

public class NewMain {

    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static <E> E[] concatenarTablas(E[] tabla1, E[] tabla2) {
        E[] nuevaTabla = Arrays.copyOf(tabla1, tabla1.length + tabla2.length);
        System.arraycopy(tabla2, 0, nuevaTabla, tabla1.length, tabla2.length);
        return nuevaTabla;
    }

}
