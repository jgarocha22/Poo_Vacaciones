package Sobrecarga;

public class Persona2 {
    //Atributos
    String nombre;
    int edad;
    String dni;

    //Métodos

    public Persona2(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona2(String dni) {
        this.dni = dni;
    }

    public void correr() {
        System.out.println("Soy "+nombre+" tengo "+edad+" años y estoy corriendo una maraton");
    }

    public void correr(int km) {
        System.out.println("He corrido "+km+" kilometros");
    }
}
