public class Tablero {
    private static final int TAMANIO = 50; // tamaño fijo del tablero
    private int[][] tablero;

    public Tablero() {
        tablero = new int[TAMANIO][TAMANIO];
    }

    // getters y setters
    public int[][] getTablero() {
        return tablero;
    }

    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }

    // métodos para acceder a una posición específica del tablero
    public int getValor(int fila, int columna) {
        return tablero[fila][columna];
    }

    public void setValor(int fila, int columna, int valor) {
        tablero[fila][columna] = valor;
    }
}
