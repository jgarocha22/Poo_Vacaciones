package Constante;

public class Persona {
    private final String name;      //Asi se declara una variable de tipo constante en java
    private int age;

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void mostrarDatos() {
        System.out.println("El hombre es: "+name);
        System.out.println("La edad es: "+age);
    }

    public void setAge(int age) {
        this.age = age;
    }
}
