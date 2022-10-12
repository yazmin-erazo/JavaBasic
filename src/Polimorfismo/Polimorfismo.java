package Polimorfismo;

public class Polimorfismo {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.Saludar();

    }
}

// CLASE PADRE
class Persona{
    public void Saludar(){
        System.out.println("Buen día");
    }
}
// CLASE HIJA - Sobreescribe el metodo Saludar (Polimorfismo)
class Cliente extends Persona {
    public void Saludar(){
        System.out.println("Buena tarde");
    }
}