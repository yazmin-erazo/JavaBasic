package Interfaz;

public class InterfaceImplementacion {
    public static void main(String[] args) {
        Coche coche = new Coche();
        Moto moto = new Moto();

        EjecutarAcelerar(coche);
        EjecutarAcelerar(moto);
    }
    public static void EjecutarAcelerar(Vehiculo vehiculo){
        vehiculo.Acelerar(15);
    }
}


interface Vehiculo{
    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);
}

class Coche implements Vehiculo{
    public void Acelerar(int cuantaVelocidad){
        System.out.println("Coche > Acelerar");
    }
    public void Frenar(int cuantaVelocidad){
        System.out.println("Coche > Frenar");
    }
}

class Moto implements Vehiculo{
    public void Acelerar(int cuantaVelocidad){
        System.out.println("Moto > Acelerar");
    }
    public void Frenar(int cuantaVelocidad){
        System.out.println("Moto > Frenar");
    }
}