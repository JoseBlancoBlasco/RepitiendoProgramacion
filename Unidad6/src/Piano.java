/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Giuseppe
 */
public class Piano extends Instrumento{
    
    public Piano(int tamInicial) {
        super();
    }

    @Override
    public void interpretar() {
        System.out.println("Sueno como un piano!");
        for (int i = 0; i < contador; i++) {
            System.out.print(notas[i] + " "); // se imprime cada nota en el array
        }
        System.out.println(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
