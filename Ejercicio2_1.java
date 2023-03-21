import java.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre = scan.next();
		System.out.println("Introduce tu color");
		String color = scan.next();
		System.out.println("Introduce un numero del 1 al 100");
		int numero = scan.nextInt();
		boolean check = false;
		do {
			if (numero < 1 && numero > 100) {
				System.out.println("Introduce un numero del 1 al 100");
				numero = scan.nextInt();
			} else {
				check = true;
			}
		} while (check);
		System.out.println("Tu nombre es: " + nombre);
		System.out.println("Tu color es: " + color);
		System.out.println("Tu numero es: " + numero);
	}

}
