package EntradaDatos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerEntrada {
    public static void main(String[] args) {

        boolean ok = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingresa dos números: ");

            try {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                ok = true;
            } catch (InputMismatchException e){
                System.out.println("Números invalidos");
            }
        }while (!ok);

    }
}
