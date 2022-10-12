package TipoDatosComplejos;

import java.util.Vector;

public class Vectores {
    public static void main(String[] args) {
        //VECTORES
        // si sabemos la cantidad de elementos en el array, iniciarlo con esa capacidad
        Vector<Integer> vector = new Vector(20);

        // para añadirle datos se hace con .add()
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println("Datos del vector: " + vector);

        //Para eliminar datos
        vector.remove(2);
        System.out.println("Datos del vector: " + vector);

        // Cuando se crea un vector, por debajo creamos un array con una capacidad determinada
        // y cuando vamos llenando su capacidad máxima, se crea un nuevo array.
        System.out.println(
                "Tamaño: " + vector.size() +
                        " Capacidad: " + vector.capacity());

        // Comparando vectores
        Vector<Integer> vector2 = new Vector(16);
        vector2.add(1);
        vector2.add(2);

        boolean resultado = vector.equals(vector2);
        System.out.println("Son iguales? " + resultado);


        //Para obtener la posición de los elementos en el vector se usa get()
        for (int i = 0; i < vector2.size(); i++) {
            System.out.println("Valor es: " + vector2.get(i) + " en posición: " + i);
        }

        // Hacer que el vector decresta
        System.out.println("Capacidad: " + vector2.capacity() + " Tamaño: " + vector2.size() );
        vector2.trimToSize();
        System.out.println("Capacidad: " + vector2.capacity() + " Tamaño: " + vector2.size() );


    }
}
