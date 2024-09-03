package Ejercicio2;

public class Carro {

    //Atributos
    private String marca, modelo;
    private float precio;

    public Carro(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public String mostrarPartes() {
        return "Marca: " + marca + "\nModelo: "+ modelo + "\nPrecio: $"+ precio +"\n";
    }
}
