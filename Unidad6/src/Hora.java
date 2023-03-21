
public class Hora extends Exception {

    private int hora;
    private int minutos;

    public Hora(int hora, int minutos) {

        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("La hora debe estar entre 0 y 23");
        }
        if (minutos < 0 || minutos > 59) {
            throw new IllegalArgumentException("Los minutos deben estar entre 0 y 59");
        }
        this.hora = hora;
        this.minutos = minutos;
    }

    public void inc() {
        minutos++;
        if (minutos == 60) {
            minutos = 0;
            hora++;
            if (hora == 24) {
                hora = 0;
            }
        }
    }
    
    public boolean setMinutos(int valor) {
        if (valor >= 0 && valor < 60) {
            minutos = valor;
            return true;
        }
        return false;
    }
    
    public boolean setHora(int valor) {
        if (valor >= 0 && valor < 24) {
            hora = valor;
            return true;
        }
        return false;
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }
    
    
    
    public String toString() {
        return String.format("%02d:%02d", hora, minutos);
    }

}
