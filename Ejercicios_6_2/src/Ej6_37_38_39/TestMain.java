
package Ej6_37_38_39;

public class TestMain {
    public static void main(String[] args) {
        Lista lista = new Lista();
        
        lista.encolar("Hola");
        lista.encolar(123);
        lista.encolar(true);
        
        System.out.println("Elemento desencolado: " + lista.desencolar());
        System.out.println("Elemento desencolado: " + lista.desencolar());
        System.out.println("Elemento desencolado: " + lista.desencolar());
        
        lista.apilar("Hola");
        lista.apilar(123);
        lista.apilar(true);
        
        System.out.println("Elemento desapilado: " + lista.desapilar());
        System.out.println("Elemento desapilado: " + lista.desapilar());
        System.out.println("Elemento desapilado: " + lista.desapilar());
    }
}