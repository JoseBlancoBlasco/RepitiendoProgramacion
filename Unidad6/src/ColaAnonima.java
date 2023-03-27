
import java.util.Arrays;
import java.util.Scanner;

public class ColaAnonima {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ListaInterface listita = new ListaInterface();

        Colita cola = new Colita() {
            @Override
            public void insertarFinal(Integer nuevo) {
                listita.tabla = Arrays.copyOf(listita.tabla, listita.tabla.length + 1);
                listita.tabla[listita.tabla.length - 1] = nuevo;
            }

            @Override
            public Integer eliminar(int indice) {
                Integer eliminado = null;
                if (indice >= 0 && indice < listita.tabla.length) {
                    eliminado = listita.tabla[indice];
                    for (int i = indice + 1; i < listita.tabla.length; i++) {
                        listita.tabla[i - 1] = listita.tabla[i];
                    }
                    listita.tabla = Arrays.copyOf(listita.tabla, listita.tabla.length - 1);
                }
                return eliminado;
            }

        };
        
        
        System.out.println("Introduce numero para encolar: ");
        Integer n = scan.nextInt();
        while (n >= 0) {
            cola.insertarFinal(n);
            System.out.println("Introduce numero para encolar: ");
            n = scan.nextInt();
        }
        n = cola.eliminar(0);
        while (n != null) {
            System.out.println("Desencolando: " + n);
            n = cola.eliminar(0);
        }
        System.out.println("");
    }

}

interface Colita {

    void insertarFinal(Integer nuevo);

    public Integer eliminar(int indice);
}
