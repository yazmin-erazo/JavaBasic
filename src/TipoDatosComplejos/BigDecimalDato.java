package TipoDatosComplejos;

import java.math.BigDecimal;

public class BigDecimalDato {
    public static void main(String[] args) {
        //Lo que requiere una altisima presición no se maneja con Double o Float
        // Se utiliza la clase BigDecimal

        BigDecimal valorA = new BigDecimal(3.14);
        BigDecimal valorB = new BigDecimal(3.15);

        //Suma el BigDecimal "valorB" a "valorA"
        BigDecimal resultado = valorA.add(valorB);

        // Imprime la suma
        System.out.println(resultado.toString());
    }
}
