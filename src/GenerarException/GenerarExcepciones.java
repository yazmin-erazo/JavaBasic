package GenerarException;

import java.io.IOException;

public class GenerarExcepciones {
    public static void main(String[] args) {
        // trhow: generar una exception
        // throws: declarar que una funcion devuelve exceptions
        try{
            divide(4, 0);
        }catch(IOException e){
            System.out.println("Soy una excepción");
        }
    }
    public static int divide(int A, int B) throws ArithmeticException, IOException {
        int resultado = 0;
        try{
            resultado = A / B;

        }catch (ArithmeticException e){
            throw new IOException();
        }
        return resultado;
    }
}
