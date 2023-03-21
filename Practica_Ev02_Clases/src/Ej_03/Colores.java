package Ej_03;

import java.util.Arrays;
import java.util.Random;

public class Colores {

    String[] color;
    //= {"Rojo", "Amarillo", "Verde", "Azul"}

    public Colores() {
        this.color = new String[0];
    }

    public void insertarFinal(String colorNuevo) {
        color = Arrays.copyOf(color, color.length + 1);
        color[color.length - 1] = colorNuevo;
    }

    public String[] addColor(String[] color, String colorNuevo) {
        //Longitud del array
        int N = color.length;
        //Array nuevo de N+1 y copio los valores existentes al nuevo
        color = Arrays.copyOf(color, N + 1);
        //Add a new element to the array
        color[N] = colorNuevo;
        return color;
    }

    public String[] elegirAzar(String[] listaColores, int cantidad) {

        int max = listaColores.length;
        int[] posibles = new int[max];
        for (int i = 0; i < posibles.length; i++) {
            posibles[i] = i;
        }

        Random rand = new Random();

        for (int i = 0; i < posibles.length; i++) {
            int randomIndexToSwap = rand.nextInt(posibles.length);
            int temp = posibles[randomIndexToSwap];
            posibles[randomIndexToSwap] = posibles[i];
            posibles[i] = temp;
        }

        return listaColores;
    }

    @Override
    public String toString() {
        return "Colores{" + "color=" + color + '}';
    }
    
    

}
