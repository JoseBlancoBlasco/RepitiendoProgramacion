
public class Ej7_4 {

    public static double accesoPorIndice(double v[], int j)
            throws RuntimeException {
        try {
            if (j >= 0 && j <= v.length) {
                return v[j];
            } else {
                throw new RuntimeException("El indice " + j
                        + " no existe en el array");
            }
        } catch (RuntimeException exc) {
            throw exc;
        }
    }

    public static void main(String[] args) {
        double v[] = new double[15];
        accesoPorIndice(v, 16);
    }

}

//El indice 16 no existe en el array