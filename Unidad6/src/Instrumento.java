
import java.util.Arrays;

public abstract class Instrumento {

    protected Nota[] notas;
    protected int contador;

    public Instrumento() {
        notas = new Nota[0];
        contador = 0;
    }

    public void add(Nota nota) {
        if (contador == notas.length) { // si el array está lleno, se redimensiona
            notas = Arrays.copyOf(notas, notas.length + 1);
        }
        notas[contador] = nota; // se agrega la nota en la posición actual
        contador++; // se incrementa el contador
    }
    
    public void interpretar() {
        for (int i = 0; i < contador; i++) {
            System.out.print(notas[i] + " "); // se imprime cada nota en el array
        }
        System.out.println();
    }

    enum Nota {
        DO, RE, MI, FA, SOL, LA, SI
    }

}
