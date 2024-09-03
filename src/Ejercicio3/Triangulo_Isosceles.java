package Ejercicio3;

public class Triangulo_Isosceles {
    private double base,lado;

    public Triangulo_Isosceles(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }

    public double getBase() {
        return base;
    }

    public double getLado() {
        return lado;
    }

    public double perimetro() {
        return 2*lado + base;
    }

    public  double area() {
        return (base * Math.sqrt((lado*lado) - ((base*base)/4))/2);
    }

    public String mostrarDatos() {
        return "Base: "+ base +"\nLado: "+ lado +"\nPerimetro: "+ perimetro() + "\nArea: "+ area();
    }
}
