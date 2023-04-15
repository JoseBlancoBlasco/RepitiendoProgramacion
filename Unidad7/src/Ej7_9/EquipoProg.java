
package Ej7_9;

public class EquipoProg {

    private String nombreEquipo;
    private String centro;
    private String lenguaje;
    private int tamano;
    private Programador[] programadores;

    public EquipoProg(String nombreEquipo, String centro, String lenguaje, int tamano) {
        this.nombreEquipo = nombreEquipo;
        this.centro = centro;
        this.lenguaje = lenguaje;
        this.tamano = tamano;
        this.programadores = new Programador[tamano];
    }

    public EquipoProg(String nombreEquipo, String centro, String lenguaje, int tamano, Programador[] programadores) {
        this.nombreEquipo = nombreEquipo;
        this.centro = centro;
        this.lenguaje = lenguaje;
        this.tamano = tamano;
        this.programadores = programadores;
    }

    public boolean estaCompleto() {
        for (Programador programador : programadores) {
            if (programador == null) {
                return false;
            }
        }
        return true;
    }

    public void incluirProgramador(Programador programador) throws EquipoLlenoException {
        for (int i = 0; i < programadores.length; i++) {
            if (programadores[i] == null) {
                programadores[i] = programador;
                return;
            }
        }
        throw new EquipoLlenoException("El equipo está lleno, no se puede incluir más programadores.");
    }

    private boolean validarTexto(String texto) {
        if (texto == null || texto.isEmpty() || texto.length() > 20) {
            return false;
        }
        for (char c : texto.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public void comprobarAtributos() throws AtributosInvalidosException {
        if (!validarTexto(nombreEquipo)) {
            throw new AtributosInvalidosException("El nombre del equipo no es válido.");
        }
        if (!validarTexto(centro)) {
            throw new AtributosInvalidosException("El centro no es válido.");
        }
        if (!validarTexto(lenguaje)) {
            throw new AtributosInvalidosException("El lenguaje de programación no es válido.");
        }
        for (Programador programador : programadores) {
            if (programador != null && (!validarTexto(programador.getNombre()) || !validarTexto(programador.getApellidos()))) {
                throw new AtributosInvalidosException("El nombre o apellidos de uno o más programadores no son válidos.");
            }
        }
    }
}

