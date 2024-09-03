package Ejercicio2;

import java.util.Scanner;

public class Principal1 {

    public static int indiceCocheMBarato(Carro[] coches) {
        float precio = coches[0].getPrecio();
        int indice = 0;
        for(int i=1; i<coches.length; i++) {
            if(coches[i].getPrecio() < precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numeroCarros, indiceBarato;

        System.out.println("Digite la cantidad de vehiculos: ");
        numeroCarros = entrada.nextInt();

        Carro[] coches = new Carro[numeroCarros];

        for(int i=0; i< coches.length; i++) {
            entrada.nextLine();
            System.out.println("\nDigite las caracteristicas del coche "+(i+1)+":");
            System.out.print("Introduzca Marca: ");
            marca = entrada.nextLine();
            System.out.print("Introduzca Modelo: ");
            modelo = entrada.nextLine();
            System.out.print("Introduzca Precio: ");
            precio = entrada.nextFloat();

            coches[i] = new Carro(marca,modelo,precio);
        }

        indiceBarato = indiceCocheMBarato(coches);

        System.out.println("\nEl coche mas barato es: ");
        System.out.println(coches[indiceBarato].mostrarPartes());
    }
}
