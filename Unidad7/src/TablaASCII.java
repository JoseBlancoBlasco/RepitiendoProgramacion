public class TablaASCII {
    private int[] tabla = new int[128];
    
    public int get(String simbolo) throws SimboloNoExisteException {
        if (simbolo == null || simbolo.isEmpty()) {
            throw new SimboloNoExisteException("Simbolo nulo o vacio");
        }
        
        char c = simbolo.charAt(0);
        if (c >= tabla.length || tabla[c] == 0) {
            throw new SimboloNoExisteException("Simbolo " + simbolo + " no existe");
        }
        
        return tabla[c];
    }
    
    public void set(String simbolo, int numero) throws SimboloNoExisteException {
        if (simbolo == null || simbolo.isEmpty()) {
            throw new SimboloNoExisteException("Simbolo nulo o vacio");
        }
        
        char c = simbolo.charAt(0);
        if (c >= tabla.length) {
            throw new SimboloNoExisteException("Simbolo " + simbolo + " no existe");
        }
        
        tabla[c] = numero;
    }
    
    public static class SimboloNoExisteException extends Exception {
        public SimboloNoExisteException(String mensaje) {
            super(mensaje);
        }
    }
}
