package TipoDatosComplejos;

import java.util.ArrayList;

public class ArrayListDato {
    public static void main(String[] args) {

// A diferencia de los vectores el arraylist no tiene capacity
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Elemento A");
        lista.add("Elemento B");
        lista.add("Elemento C");

        lista.remove("Elemento B");
        System.out.println("Contenido: " + lista);

        // Recorriendo el ArrayList
        for (String nombre : lista) {
            System.out.println(nombre);
        }

        for (int i = 0; i < lista.size() ; i++) {
            System.out.println(lista.get(i));

        }
    }
}
