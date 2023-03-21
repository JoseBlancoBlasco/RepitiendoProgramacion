package Ej_07;

public class CifradoCesar {
  public static String cifrarTexto(String texto, int n) {
    String textoCifrado = "";
    for (int i = 0; i < texto.length(); i++) {
      char letra = texto.charAt(i);
      if (Character.isLetter(letra)) {
        int posicion = (int) letra;
        int nuevaPosicion = posicion + n;
        if (Character.isUpperCase(letra) && nuevaPosicion > 90) {
          nuevaPosicion = 65 + (nuevaPosicion - 91);
        } else if (Character.isLowerCase(letra) && nuevaPosicion > 122) {
          nuevaPosicion = 97 + (nuevaPosicion - 123);
        }
        char cifrado = (char) nuevaPosicion;
        textoCifrado += cifrado;
      } else {
        textoCifrado += letra;
      }
    }
    return textoCifrado;
  }
}