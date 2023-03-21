public class Caja {
    private final int ancho;
    private final int alto;
    private final int fondo;
    private final Unidad unidad;
    private String etiqueta;

    public Caja(int ancho, int alto, int fondo, Unidad unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
        this.etiqueta = "";
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public int getFondo() {
        return fondo;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public String getEtiqueta() {
        return etiqueta;
    }
    
    

    public double getVolumen() {
        double volumen = ancho * alto * fondo;
        if (unidad == Unidad.CM) {
            volumen /= 1000000;
        }
        return volumen;
    }

    public void setEtiqueta(String etiqueta) {
        if (etiqueta.length() > 30) {
            this.etiqueta = etiqueta.substring(0, 30);
        } else {
            this.etiqueta = etiqueta;
        }
    }

    public String toString() {
        return "Caja(" + ancho + ", " + alto + ", " + fondo + ", " + unidad + ") con etiqueta: " + etiqueta;
    }
    
    public enum Unidad {
    CM,
    M
}

}


