public class Tablero {
    private static final int TAMANO_TABLERO = 10; // Tamaño fijo del tablero
    private Elemento[][] tablero = new Elemento[TAMANO_TABLERO][TAMANO_TABLERO];

    public void añadirElemento(Elemento elemento, int x, int y) {
        tablero[x][y] = elemento;
    }

    public Elemento getElemento(int x, int y) {
        return tablero[x][y];
    }
}

public abstract class Elemento {
    // Clase base para los elementos que se pueden añadir al tablero
}

public class Agua extends Elemento {
    // Clase para el agua
}

public class Mineral extends Elemento {
    // Clase para los minerales
}

public class Oro extends Mineral {
    // Clase para el oro
}

public class Bosque extends Elemento {
    // Clase para el bosque
}

public class Arbol extends Bosque {
    // Clase para los árboles
}

public abstract class Ganado extends Elemento {
    // Clase base para el ganado
}

public class Oveja extends Ganado {
    // Clase para las ovejas
}

public class Vaca extends Ganado {
    // Clase para las vacas
}

public class Cultivo extends Elemento {
    // Clase para los cultivos
}

public class Cereal extends Cultivo {
    // Clase para el cereal
}

public class Dinero extends Elemento {
    // Clase para el dinero
}

public class Moneda extends Dinero {
    // Clase para las monedas
}

public abstract class Mueble extends Elemento {
    // Clase base para los muebles
}

public class Silla extends Mueble {
    // Clase para las sillas
}

public class Mesa extends Mueble {
    // Clase para las mesas
}

public class Armario extends Mueble {
    // Clase para los armarios
}

public abstract class Pez extends Elemento {
    // Clase base para los peces
}

public class Trucha extends Pez {
    // Clase para las truchas
}

public class CangrejoDeRio extends Pez {
    // Clase para los cangrejos de río
}

public abstract class Sujeto {
    // Clase base para los sujetos
}

// Resto de clases que heredan de Sujeto (Pastor, Agricultor, Minero, Maderero, Pescador, Panadero, Herrero, Carpintero, Carnicero, Pescadero, Alguacil y Alcalde)
