package TipoDatosComplejos;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {
        //Array asociativo. Un Mapa es una especi de diccionarioa que tiene
        //Una clave y un valor
        //<Clave, valor> = no pueden tener la clave duplicadda
        HashMap<String, Integer> mapa = new HashMap<>();

        //para añadir elemento
        mapa.put("clave1", 10);
        mapa.put("clave2", 20);
        mapa.put("clave3", 30);

        System.out.println(mapa);
        System.out.println(mapa.get("clave1"));

        // Recorriendo el mapa

        for (Map.Entry elemento : mapa.entrySet()){
            System.out.println("Elemento clave es: " + elemento.getKey());
            System.out.println("Elemento valor es: " + elemento.getValue());
        }

    }
}
