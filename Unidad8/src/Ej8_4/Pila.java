/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej8_4;

public interface Pila<E> {
    void apilar(E elemento);
    E desapilar();
    boolean isEmpty();
    int size();
}

