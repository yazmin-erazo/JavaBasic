package SentenciasControl;

public class Bucles {
    public static void main(String[] args) {
        //--- Condicionales
        int numeroIf = -5;

        if (numeroIf > 0) {
            System.out.println("Condicional: Número positivo");
        } else if (numeroIf < 0) {
            System.out.println("Condicional: Número negativo");
        }else {
            System.out.println("Condicional: El número es 0");
        }

        //--- Bucle While
        int numeroWhile = 1;
        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println("Bucle while: " + numeroWhile);
        }

        //--- Bucle Do while
        do {
            System.out.println("Bucle Do while: " + numeroWhile);
            numeroWhile++;
        }while (numeroWhile < 3);

        //--- Bucle For
        for (int numeroFor=0; numeroFor<=3;numeroFor++){
            System.out.println("Bucle For: " + numeroFor);
        }

        //--- Switch
        String estacion = "Verano";
        switch(estacion){
            case "Invierno":
                System.out.println("Switch: Estamos en " + estacion);
                break;
            case "Verano":
                System.out.println("Switch: Estamos en " + estacion);
                break;
            case "Primavera":
                System.out.println("Switch: Estamos en " + estacion);
                break;
            case "Otoño":
                System.out.println("Switch: Estamos en " + estacion);
                break;
            default:
                System.out.println("Switch: No es una estación valida");
        }
    }
}
