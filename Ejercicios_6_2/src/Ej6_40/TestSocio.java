/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej6_40;

import java.util.Arrays;

/**
 *
 * @author j.blanco
 */

public class TestSocio {
    
    public static void main(String[] args) {
        
        Socio sc1 = new Socio(1234, "Jose", "10.05.1982");
        Socio sc2 = new Socio(1255, "Juan", "15.02.1980");
        Socio sc3 = new Socio(1202, "Pepe", "15.02.1978");
        Socio sc4= new Socio(1200, "Luis", "15.02.1986");
        
        System.out.println(sc1.toString());
        System.out.println(sc2.toString());
        
        System.out.println(sc1.compareTo(sc2));
        
        Socio[] socios = new Socio[4];
        socios[0]=sc1;
        socios[1]=sc2;
        socios[2]=sc3;
        socios[3]=sc4;
        
        System.out.println(Arrays.deepToString(socios));
        Arrays.sort(socios);
        System.out.println("**************");
        System.out.println(Arrays.deepToString(socios));
    }

}

