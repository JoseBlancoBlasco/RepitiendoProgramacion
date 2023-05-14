
package Ej8_19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GestionRepuestos {
    private Map<String, Integer> existencias;

    public GestionRepuestos() {
        existencias = new HashMap<>();
    }

    public void darDeAlta(String codigo, int unidades) {
        existencias.put(codigo, unidades);
        System.out.println("Producto dado de alta: " + codigo);
    }

    public void darDeBaja(String codigo) {
        if (existencias.containsKey(codigo)) {
            existencias.remove(codigo);
            System.out.println("Producto dado de baja: " + codigo);
        } else {
            System.out.println("El producto no existe en el inventario.");
        }
    }

    public void actualizarExistencias(String codigo, int unidades) {
        if (existencias.containsKey(codigo)) {
            existencias.put(codigo, unidades);
            System.out.println("Existencias actualizadas para el producto: " + codigo);
        } else {
            System.out.println("El producto no existe en el inventario.");
        }
    }

    public void mostrarExistencias() {
        if (existencias.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
        } else {
            System.out.println("Existencias en el inventario:");
            for (Map.Entry<String, Integer> entry : existencias.entrySet()) {
                String codigo = entry.getKey();
                int unidades = entry.getValue();
                System.out.println("Código: " + codigo + ", Unidades: " + unidades);
            }
        }
    }

    public static void main(String[] args) {
        GestionRepuestos gestionRepuestos = new GestionRepuestos();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("MENU:");
            System.out.println("1. Dar de alta un producto");
            System.out.println("2. Dar de baja un producto");
            System.out.println("3. Actualizar existencias de un producto");
            System.out.println("4. Mostrar existencias");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el código del producto: ");
                    String codigoAlta = scanner.next();
                    System.out.print("Ingrese las unidades en stock: ");
                    int unidadesAlta = scanner.nextInt();
                    gestionRepuestos.darDeAlta(codigoAlta, unidadesAlta);
                    break;
                case 2:
                    System.out.print("Ingrese el código del producto a dar de baja: ");
                    String codigoBaja = scanner.next();
                    gestionRepuestos.darDeBaja(codigoBaja);
                    break;
                case 3:
                    System.out.print("Ingrese el código del producto a actualizar: ");
                    String codigoActualizacion = scanner.next();
                    System.out.print("Ingrese las nuevas unidades en stock: ");
                    int nuevasUnidades = scanner.nextInt();
                    gestionRepuestos.actualizarExistencias(codigoActualizacion, nuevasUnidades);
                    break;
                case 4:
                    gestionRepuestos.mostrarExistencias();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 5);
    }
}

