package Ejercicios;

import java.util.Vector;

public class Varios {
    public static void main(String[] args) {
        // FUNCION: Texto al reves
        reverse1("Primer texto vuelve al reves");

        //FUNCION: Recorriendo un array
        String[] nombres = {"Katherine", "Paola", "Lorena"};
        arreglo(nombres);

        //FUNCION: Recorriendo un array Bidimensional

        int numbers[][] = {{10, 20, 30, 40}, {50, 60, 70, 80}};
        bidi(numbers);

        //FUNCION: Creando vector y eliminando los elementos indicados
        Vector<String> vector = new Vector(5);
        vectorImpares(vector, 1, 2);

        //FUNCION: Dando respuesta Cuál es el problema de utilizar un Vector con la capacidad por defecto
        capacidadVector(16);

    }

    // -------------------------------------  Funcion que devuelve un string al reves
    //Escribe el código que devuelva una cadena al revés.
    public static String reverse1(String texto1) {
        StringBuilder str1 = new StringBuilder(texto1);
        texto1 = str1.reverse().toString();
        System.out.println(str1);
        return texto1;
    }

    // ------------------------------------- Funcion que recorre un array unidimensional
    //Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
    public static void arreglo(String[] txtArreglo) {
        for (String arr : txtArreglo) {
            System.out.println(arr);
        }
    }

    // ------------------------------------- Funcion que recorre un array bidimensional
    //Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
    public static void bidi(int[][] numeros) {
        for (int i = 0; i < numeros.length; i++) {

            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Posición de i: " + i + ", Posición de j:" + j + " = " + numeros[i][j]);
            }
        }
    }

    // ------------------------------------- Funcion crea el vector y le elimina los elemntos indicados
    //Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
    public static void vectorImpares(Vector<String> vector, int positionA, int positionB) {
        for (int i = 0; i < vector.capacity(); i++) {
            vector.add("Nombre " + i);
        }
        vector.remove(positionA); // Se elimina Nombre 1
        vector.remove(positionB); // Se elimina Nombre 3 por que las posiciones se corrieron cuando se elimino Nombre 1
        System.out.println(vector);
    }

    // ------------------------------------ Funcion de capacidad por defecto y asignada.
    //Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
    public static void capacidadVector(Integer conCapacidad) {
        Vector<Integer> vector2 = new Vector();
        System.out.println("La capacidad de un vector por defecto es de: " + vector2.capacity());
        Vector<Integer> vector3 = new Vector(conCapacidad);
        System.out.println("La capacidad de un vector al que le asigne la Capacitidad: " + vector3.capacity());
        System.out.println("Rta: Cuando se crea un vector, por debajo creamos un array con una capacidad determinada y cuando vamos llenando su capacidad máxima, se crea un nuevo array.");
    }
}

//1. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.

//2. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares.
// Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.

//3.Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
// Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".

//4. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
// La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".

// 5. Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.