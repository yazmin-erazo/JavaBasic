package Recursividad;

public class Recursividad {
    public static void main(String[] args) {
        suma(10, 20);

        factorial(8);
    }
    public static void suma(int a, int b) {
        int temp = a + b;
        System.out.println("a vale " + a + " b vale " + b + " temp vale " + temp);

        if (b >= 90){
            return;
        }
        suma(a, temp);
    }

    public static int factorial(int numero) {
        int resultado;
        if(numero == 1){
            return 1;
        }
        resultado = factorial(numero - 1) * numero;
        return resultado;
    }
}
