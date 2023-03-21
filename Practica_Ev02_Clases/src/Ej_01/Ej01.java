package Ej_01;

public class Ej01 {
    
    public static void main(String[] args) {
        MarcaPagina libro1 = new MarcaPagina("El principito", 245);
        libro1.pasarPagina(48);
        System.out.println("La ultima pagina leida es la pagina " + libro1.ultimaLeida());
        libro1.pasarPagina(657);
        libro1.nuevaLectura();
        System.out.println("La ultima pagina leida es la pagina " + libro1.ultimaLeida());
    }

}
