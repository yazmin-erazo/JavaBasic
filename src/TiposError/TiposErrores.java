package TiposError;

import java.util.Scanner;

public class TiposErrores {
    public static void main(String[] args) {
        //ERROR EN TIEMPO DE EJECUCIÓN
        // Error para el cual no estabamos preparados y hace que el programa aborte

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese dos números");

        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();

        int resultado = numeroA / numeroB;
        System.out.println("Resultado es: " + resultado);

        // No se puede permitir una división entre 0

        // ERROR DE COMPILACIÓN
        //Tipicamente sintactico (A continuación falta el ;)
        //Scanner scanner = new Scanner(System.in)


        // ERROR LOGICO O ERROR HUMANO
        // Cuando mi lógica no es correcta

        int temperatura = 25;
        if (temperatura >= 25) {
            System.out.println("Hace frio!");
        }
    }
}
