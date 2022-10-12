package TiposDatos;

public class TipoDatosVariables {
    public static void main(String[] args) {
        // Integers
        byte number1 = 5;
        short number2 = 10;
        int number3 = 30;
        long number4 = 11369333;

        // Decimals
        float number5 = 5.5f;
        double number6 = 10.5d;

        // Boolean
        boolean case1 = false;
        boolean case2 = true;

        //Text
        char character = 'a';
        String text = "I'm a text";

        System.out.println(
                "TIPOS DE DATOS: " +
                        "\nbyte: " + number1 +
                        "\nshort: " + number2 +
                        "\nint: " + number3 +
                        "\nlong: " + number4 +
                        "\nfloat: " + number5 + "f" +
                        "\ndouble: " + number6 + "d" +
                        "\nboolean: " + case1 +
                        "\nboolean: " + case2 +
                        "\nchar: " + character +
                        "\nString: " + text + "\n");

        String name = "Gabriel";
        int dni = 123456;
        float weight = 68.5f;
        boolean married = true;
        System.out.println(
                "EXAMPLE: " +
                        "\nName: " + name +
                        "\nDNI: " + dni +
                        "\nWeight: " + weight +
                        "\nMarried: " + married);
    }
}
