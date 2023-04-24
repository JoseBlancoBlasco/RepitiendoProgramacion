
package Ej8_5;

public interface Cola<E> {
    void encolar(E elemento);
    E desencolar();
    boolean isEmpty();
    int size();
}
