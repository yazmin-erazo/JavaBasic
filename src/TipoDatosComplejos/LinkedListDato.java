package TipoDatosComplejos;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDato {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Elemento A");
        lista.add("Elemento B");
        lista.add("Elemento C");

        // lINKEDLIST Utiliza una lista enlazada. Es mas rapida que el ArrayList a la hora de modificar datos
        //Se puede inicializar con los elementos de ArrayList de arriba
        LinkedList<String> listaEnlazada = new LinkedList<String>(lista);
        System.out.println(listaEnlazada);
    }
}
