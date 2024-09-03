package Ejercicio3;

import java.util.Scanner;

public class princ {

    public static double mayorArea(Triangulo_Isosceles[] triangulos) {
        double area;

        area = triangulos[0].area();
        for(int i=1; i< triangulos.length; i++) {
            if(triangulos[i].area() > area) {
                area = triangulos[i].area();
            }
        }
        return area;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base,lado;
        int nTriangulos;

        System.out.println("Indique el numero de triangulos a ingresar: ");
        nTriangulos = entrada.nextInt();

        Triangulo_Isosceles[] triangulos = new Triangulo_Isosceles[nTriangulos];

        for(int i=0; i<triangulos.length; i++) {
            System.out.println("\nDigite los valores para el triangulo "+ (i+1) +":");
            System.out.print("Introduzca la base: ");
            base = entrada.nextDouble();
            System.out.print("Introduzca el lado: ");
            lado = entrada.nextDouble();

            triangulos[i] = new Triangulo_Isosceles(base,lado);

            System.out.println("\n"+ triangulos[i].mostrarDatos());
        }

        System.out.println("\nEl area del triangulo de mayor superficie es: "+mayorArea(triangulos));
    }
}
