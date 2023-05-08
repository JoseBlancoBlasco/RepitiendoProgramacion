
public class Tablero {

    private static final int TAMANIO = 50; // tamaño fijo del tablero
    private int[][] tablero;

    public Tablero() {
        tablero = new int[TAMANIO][TAMANIO];
    }
    
    public int[][] getTablero() {
        return tablero;
    }

    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }
    
    public int getValor(int fila, int columna) {
        return tablero[fila][columna];
    }

    public void setValor(int fila, int columna, int valor) {
        tablero[fila][columna] = valor;
    }

    public void rellenarTablero() {
        int recursosAñadidos = 0;
        int cantidadMaximaRecursos = (int) (TAMANIO * TAMANIO * 0.3); // 30% del tamaño del tablero
        while (recursosAñadidos < cantidadMaximaRecursos) {
            int filaAleatoria = (int) (Math.random() * TAMANIO);
            int columnaAleatoria = (int) (Math.random() * TAMANIO);
            if (tablero[filaAleatoria][columnaAleatoria] == 0) { // si la casilla está vacía
                int tipoRecursoAleatorio = (int) (Math.random() * 6) + 1; // números entre 1 y 6
                switch (tipoRecursoAleatorio) {
                    case 1:
                        tablero[filaAleatoria][columnaAleatoria] = 1; // 1 representa el recurso pez
                        break;
                    case 2:
                        tablero[filaAleatoria][columnaAleatoria] = 2; // 2 representa el recurso oro
                        break;
                    case 3:
                        tablero[filaAleatoria][columnaAleatoria] = 3; // 3 representa el recurso bosque
                        break;
                    case 4:
                        tablero[filaAleatoria][columnaAleatoria] = 4; // 4 representa el recurso ganado
                        break;
                    case 5:
                        tablero[filaAleatoria][columnaAleatoria] = 5; // 5 representa el recurso fruta
                        break;
                    case 6:
                        tablero[filaAleatoria][columnaAleatoria] = 6; // 6 representa el recurso verdura
                        break;
                }
                recursosAñadidos++;
            }
        }
    }

    public void pintarTablero() {
        for (int fila = 0; fila < TAMANIO; fila++) {
            for (int columna = 0; columna < TAMANIO; columna++) {
                int valor = tablero[fila][columna];
                switch (valor) {
                    case 0:
                        System.out.print(" . "); // Casilla vacía
                        break;
                    case 1:
                        System.out.print(" 🐟 "); // Recurso pez
                        break;
                    case 2:
                        System.out.print(" 🥇 "); // Recurso oro
                        break;
                    case 3:
                        System.out.print(" 🌳 "); // Recurso bosque
                        break;
                    case 4:
                        System.out.print(" 🐄 "); // Recurso ganado
                        break;
                    case 5:
                        System.out.print(" 🍎 "); // Recurso fruta
                        break;
                    case 6:
                        System.out.print(" 🥕 "); // Recurso verdura
                        break;
                }
            }
            System.out.println(); // Nueva línea después de cada fila
        }
    }

    public void agregarCiudadano(Sujeto sujeto) {
        int fila = sujeto.getPosX();
        int columna = sujeto.getPosY();
        tablero[fila][columna] = sujeto.getId();
    }

}
