package Ej_01;

public class MarcaPagina {

    private String libro;
    private int paginasTotales;
    private int paginaActual;

    public MarcaPagina(String libro, int paginasTotales) {
        this.libro = libro;
        this.paginasTotales = paginasTotales;
        this.paginaActual = 0;
    }

    void numeroPaginasTotales(int num) {
        this.paginasTotales = num;
    }

    void pasarPagina(int num) {
        if (num >= paginasTotales) {
            System.out.println("Terminaste el libro!.");
        } else {
            this.paginaActual += num;
        }
    }

    void nuevaLectura() {
        this.paginaActual = 0;
    }

    int ultimaLeida() {
        if (paginaActual==0) {
            System.out.println("No has empezado el libro.");
            return this.paginaActual;
        }else{
            return this.paginaActual;
        }
        
    }

}
