package core;


import ciudadanos.Herrero;
import ciudadanos.Carnicero;
import ciudadanos.Carpintero;
import ciudadanos.Alguacil;
import ciudadanos.Agricultor;
import ciudadanos.Panadero;
import ciudadanos.Leñador;
import core.Sujeto;
import ciudadanos.Pescadero;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GestionImpuestos {

    public static void main(String[] args) {
        List<Sujeto> sujetos = new ArrayList<>();
        List<Alguacil> alguaciles = new ArrayList<>();

        // Agregar sujetos a la colección
        Agricultor agricultor = new Agricultor();
        sujetos.add(agricultor);
        Alguacil alguacil = new Alguacil();
        alguaciles.add(alguacil);
        Carnicero carnicero = new Carnicero();
        sujetos.add(carnicero);
        Carpintero carpintero = new Carpintero();
        sujetos.add(carpintero);
        Herrero herrero = new Herrero();
        sujetos.add(herrero);
        Leñador leñador = new Leñador();
        sujetos.add(leñador);
        Panadero panadero = new Panadero();
        sujetos.add(panadero);
        Pescadero pescadero = new Pescadero();
        sujetos.add(pescadero);
        
        
        

        // Cobrar impuestos a los sujetos
        Iterator<Sujeto> iterator = sujetos.iterator();
        while (iterator.hasNext()) {
            Sujeto sujeto = iterator.next();            
            alguacil.cobrarImpuestos(sujeto);
        }

        // Ordenar la colección de sujetos por algún criterio
        Collections.sort(sujetos);

        // Mostrar la colección de sujetos
        for (Sujeto sujeto : sujetos) {
            System.out.println(sujeto);
        }
    }
}
