package Encapsulamiento.paquete1;
import java.util.Scanner;

public class Clase2 {
    public static void main(String[] args) {
        Clase1 obj1 = new Clase1();
        Scanner tecla = new Scanner(System.in);

        System.out.print("Introduzca su edad: ");
        int age = tecla.nextInt();
        obj1.SetAge(age);

        System.out.print("\nIntroduce tu nombre: ");
        String name = tecla.next();
        obj1.SetName(name);

        System.out.println("\nHola "+obj1.GetName()+" tu edad es: "+obj1.GetAge());
    }
}
