
public class HoraExacta extends Hora {

    private int segundos;

    public HoraExacta(int hora, int minutos, int segundos) {
        super(hora, minutos);
        if (segundos < 0 || segundos > 59) {
            throw new IllegalArgumentException("Los minutos deben estar entre 0 y 59");
        }
        this.segundos = segundos;
    }
    
    public boolean setSegundos(int valor) {
        if (valor >= 0 && valor < 60) {
            this.segundos = valor;
            return true;
        }
        return false;
    }
    
    @Override
    public void inc() {
        if (segundos < 59) {
            segundos++;
        } else {
            segundos = 0;
            super.inc();
        }
    }

    @Override
    public String toString() {
        return super.toString() + ":" + String.format("%02d", segundos);
    }

    public int getSegundos() {
        return segundos;
    }
    
    
    
    public boolean equals(HoraExacta otraHora) {
        return super.getHora() == otraHora.getHora() &&
                super.getMinutos() == otraHora.getMinutos() &&
                this.segundos == otraHora.segundos;
}


}
