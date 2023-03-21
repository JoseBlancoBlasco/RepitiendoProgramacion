package Ejercicios.BuclesForAnidados;


import java.util.Calendar;

public class Ej3_35 {
    public static void main(String[] args) {
        Calendar fecha = Calendar.getInstance();
        System.out.println("La fecha actual es: " + String.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS", fecha));

        fecha.add(Calendar.MINUTE, 10);
        System.out.println("La fecha del futuro es: " + String.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS", fecha));
    }
}
