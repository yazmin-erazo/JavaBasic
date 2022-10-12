package FuncionClaseInstancia;

public class FuncionClaseInstancia {
    public static void main(String[] args) {
        suma(3,6,9);

        Coche miCoche = new Coche();
        miCoche.AumentarPuerta();
        System.out.println(miCoche.puertas);
    }
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}
class Coche {
    public int puertas = 0;

    public void AumentarPuerta(){
        this.puertas++;
    }
}