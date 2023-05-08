package core;

public class Tablero {

    private static final int TAMANIO = 50; // tamaño fijo del tablero
    private int[][] tablero;
    private Recurso[][] recursos;

    public Tablero() {
        tablero = new int[TAMANIO][TAMANIO];
        recursos = new Recurso[TAMANIO][TAMANIO];
    }

    public Recurso[][] getRecursos() {
        return recursos;
    }

    public void setRecursos(Recurso[][] recursos) {
        this.recursos = recursos;
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
                if (recursos[fila][columna] != null) {
                    Recurso recurso = recursos[fila][columna];
                    TipoRecurso tipo = recurso.getTipo();
                    switch (tipo) {
                        case PEZ:
                            System.out.print("🐟");  // Representación del recurso pez
                            break;
                        case ORO:
                            System.out.print("💰");  // Representación del recurso oro
                            break;
                        case BOSQUE:
                            System.out.print("🌳");  // Representación del recurso bosque
                            break;
                        case GANADO:
                            System.out.print("🐄");  // Representación del recurso ganado
                            break;
                        case FRUTA:
                            System.out.print("🍎");  // Representación del recurso fruta
                            break;
                        case VERDURA:
                            System.out.print("🥦");  // Representación del recurso verdura
                            break;
                        default:
                            System.out.print(" ");  // Representación de una posición vacía
                            break;
                    }
                } else {
                    System.out.print(" ");  // Representación de una posición vacía
                }
            }
            System.out.println();  // Salto de línea al final de cada fila
        }
    }

    public void agregarCiudadano(Sujeto sujeto) {
        int fila = sujeto.getPosX();
        int columna = sujeto.getPosY();
        tablero[fila][columna] = sujeto.getId();
    }

}
