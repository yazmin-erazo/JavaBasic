package TipoDatosComplejos;

public class StringArray {
    public static void main(String[] args) {
        // ====================== String:  Métodos = .length(), toUpperCase(), startsWith() ...
        String cadena = "Mensaje de texto";
        cadena.length();          // Cantidad de caracteres de la cadena
        cadena.toUpperCase();     // MConvierte cadena en mayúscula
        cadena.startsWith("Men"); // Mirar si la cadena comienza por lo indicado


        //====================== Arrays:  una variable que tiene multiples valores consecutivos del mismo tipo
        int arrayUno[] = {1, 2, 3, 4 , 5}; //Declaramos e inicialozamos en un solo paso
        String nombres[] = {
                "Pepe",
                "Juan",
                "Francisco"
        };

        // Recorriendo el array con For each (Tengo el valor y no la posicion)
        System.out.println("FOR EACH");
        for(String i : nombres){
            System.out.println(i);
        }
        // Recorriendo el array con For (Tengo la posicion y no el valor)
        System.out.println("\nFOR");
        for (int i = 0; i< nombres.length; i++){
            System.out.println("For: " + i + " " + nombres[i]);
        }
        // Recorriendo el array con While
        System.out.println("\nWHILE");
        int contador = 0;
        while (contador < nombres.length){
            System.out.println("While: " + nombres[contador]);
            contador++;
        }
        // ARRAY BIDIMENSIONAL
        System.out.println("\nARRAY BIDIMENSIONAL");
        // int arrayBidi[][] = {
        //  { 1, 2, 3, 4 },
        //  { 10, 20, 30, 40}
        // }

        int arrayBidi[][] = new int[2][4];

        arrayBidi[0][0] = 1;
        arrayBidi[0][1] = 2;
        arrayBidi[0][2] = 3;
        arrayBidi[0][3] = 4;

        arrayBidi[1][0] = 10;
        arrayBidi[1][1] = 20;
        arrayBidi[1][2] = 30;
        arrayBidi[1][3] = 40;

        for (int i = 0; i < arrayBidi.length; i++){
            //System.out.println("valor de i:" + i);
            for (int j = 0; j < arrayBidi[i].length; j++){
                //System.out.println("Valor de i: "+ i + ", valor de j:" + j);
                System.out.println(arrayBidi[i][j]);
            }
        }

    }
}
