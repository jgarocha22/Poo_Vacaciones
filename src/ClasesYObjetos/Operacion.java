package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Operacion {
    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //Métodos

    //Método para pedir que digite 2 números

    public void leerNumeros() {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número: "));
    }

    //Método para sumar 2 números

    public void sumar() {
        suma = numero1 + numero2;
    }

    //Método para restar 2 números

    public void restar() {
        resta = numero1 - numero2;
    }

    //Método para multiplicar 2 números

    public void multiplicar() {
        multiplicacion = numero1 * numero2;
    }

    //Método para dividir 2 números

    public void dividir() {
        division = numero1/numero2;
    }

    //Método para mostrar los resultados

    public void mostrarResultados() {
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
}
