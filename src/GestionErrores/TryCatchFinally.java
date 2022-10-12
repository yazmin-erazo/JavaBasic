package GestionErrores;

import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese dos números");

        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();

        try {
            int resultado = numeroA / numeroB;
            System.out.println("Resultado es: " + resultado);
        }catch(ArithmeticException e){
            System.out.println("La exception es: " + e.getClass());
        }catch (Exception e){
            System.out.println("Esta es un excepcion que no es Aritmetica");
        }finally {
            System.out.println("Finally se muestra tanto si funciona bien o no, en cualquier caso");
        }
    }
}
