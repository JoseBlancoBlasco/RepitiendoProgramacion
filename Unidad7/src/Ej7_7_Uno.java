
class Dos {

    private static int metodo() {
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("W");
            valor = valor + 1;
            System.out.println("Valor al final del try: " + valor);
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("42");
            System.out.println("Valor al final del cath: " + valor);
            throw e;
        } finally {
            valor = valor + 1;
            System.out.println("Valor al final de finally: " + valor);
        }
        valor = valor + 1;
        System.out.println("Valor antes del return: " + valor);
        return valor;
    }

    public static void main(String[] args) {
        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.out.println("Excepcion en metodo() ");
            e.printStackTrace();
        }
    }
}

//Valor al final del cath: 43
//java.lang.NumberFormatException: For input string: "W"
//Valor al final de finally: 44
//Excepcion en metodo() 
//	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
//	at java.lang.Integer.parseInt(Integer.java:580)
//	at java.lang.Integer.parseInt(Integer.java:615)
//	at Dos.metodo(Ej7_7_Uno.java:8)
//	at Dos.main(Ej7_7_Uno.java:26)