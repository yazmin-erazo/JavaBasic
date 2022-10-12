package Herencia;

public class Abstraccion {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Gabriel",33,322305,9.5);
        Trabajador trabajador = new Trabajador("Antonio", 29, 317637,45.5);
    }
}
// CLASE SUPER - PADRE
abstract class Persona{
    private String nombre;
    private int edad;
    private int telefono;

    public Persona(String nombre, int edad, int telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }
}
// CLASE HIJA - CLIENTE HEREDA DE PERSONA
class Cliente extends Persona {
    private Double credito;
    public Cliente(String nombre, int edad, int telefono, double credito) {
        super(nombre, edad, telefono);
        this.credito = credito;
        System.out.println("-- CLIENTE"+ "\nNombre: " + nombre + "\nEdad: " + edad + "\ntelefono: " + telefono + "\nCrédito: " + credito);
    }
}
//CLASE HIJA - TRABAJADOR HEREDA DE PERSONA
class Trabajador extends Persona {
    private Double salario;
    public Trabajador(String nombre, int edad, int telefono, Double salario) {
        super(nombre, edad, telefono);
        this.salario = salario;
        System.out.println("--TRABAJADOR"+ "\nNombre: " + nombre + "\nEdad: " + edad + "\ntelefono: " + telefono + "\nSalario: $ " + salario);
    }
}