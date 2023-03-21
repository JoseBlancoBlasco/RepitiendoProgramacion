
public class CajaCarton extends Caja {

    private static final double FACTOR_VOLUMEN = 0.8; // Factor de reducción del volumen de la caja de cartón

    public CajaCarton(int ancho, int alto, int fondo, Unidad unidad) {
        super(ancho, alto, fondo, unidad);
    }

    public double getVolumen() {
        return super.getVolumen() * FACTOR_VOLUMEN;
    }

    public double getSuperficie() {
        // Calcula la superficie total de cartón utilizado para construir la caja
        double superficieBase = (getAncho() * getFondo()) * 2; // Base superior e inferior
        double superficieLateral = (getAncho() * getAlto() + getFondo() * getAlto()) * 2; // Lados laterales
        return superficieBase + superficieLateral;
    }
}
