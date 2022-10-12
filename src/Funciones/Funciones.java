package Funciones;

public class Funciones {
    public static void main(String[] args) {
        double total = getPriceIva(15.6);
        System.out.println("Total mas iva: $" + total);
    }

    private static double getPriceIva(double a) {
        double iva = 10.0;
        return a + iva ;
    }
}
