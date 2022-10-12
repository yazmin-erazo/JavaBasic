package Encapsulacion;

public class PrivacidadEncapsulacion {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setNombre("Gabriel");
        persona.setEdad(33);
        persona.setTelefono(322305);

        System.out.println("Nombre: " + persona.getNombre() + "\nEdad: " + persona.getEdad() + " años" + "\nTeléfono: " + persona.getTelefono());
    }
}
class Persona{
    private String nombre;
    private int edad;
    private int telefono;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}