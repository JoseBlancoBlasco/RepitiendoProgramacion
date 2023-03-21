package Ej_04;

public class Cambio {
  private static int[] monedas = {200, 100, 50, 20, 10, 5, 2, 1};
  private static int[] billetes = {500, 200, 100, 50, 20, 10};

  public static void mostrarCambio(int importe, int pagado) {
    int cambio = pagado - importe;
    System.out.println("Cambio: " + cambio);
    System.out.println("Billetes:");
    for (int i = 0; i < billetes.length; i++) {
      int numBilletes = cambio / billetes[i];
      if (numBilletes > 0) {
        System.out.println(billetes[i] + ": " + numBilletes);
        cambio = cambio % billetes[i];
      }
    }
    System.out.println("Monedas:");
    for (int i = 0; i < monedas.length; i++) {
      int numMonedas = cambio / monedas[i];
      if (numMonedas > 0) {
        System.out.println(monedas[i] + ": " + numMonedas);
        cambio = cambio % monedas[i];
      }
    }
  }
}