
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Main {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ListaInterface listita = new ListaInterface();
        System.out.println("Intorduce numero para encolar: ");
        Integer n = scan.nextInt();
        while(n>=0){
            listita.encolar(n);
            System.out.println("Intorduce numero para encolar: ");
            n = scan.nextInt();
        }
        n=listita.desencolar();
        while(n!=null){            
            System.out.println("Desencolando: " + n);
            n=listita.desencolar();
        }
        System.out.println("");
              
    }

}
