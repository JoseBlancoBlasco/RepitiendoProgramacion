
import java.util.Scanner;

public class Ej7_1_2 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = scan.nextLine();

        try {
            char caracter = caracterEn(cadena, 7);
            System.out.println("El carácter en la posición 7 de la cadena es: " + caracter);
        } catch (Exception e) {
            System.out.println("La posición que has intentado recuperar en la cadena no existe.");
        }
    }
    
    public static char caracterEn(String cadena, int posicion) throws Exception {
    if (posicion < 0 || posicion >= cadena.length()) {
        throw new Exception("Posición inválida");
    }
    return cadena.charAt(posicion);
}


}
