package RetornoDeValores;

public class Operacion3 {

    //Métodos

    //Método para sumar 2 números

    public int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    //Método para restar 2 números

    public int restar(int numero1, int numero2) {
        return numero1 - numero2;
    }

    //Método para multiplicar 2 números

    public int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }

    //Método para dividir 2 números

    public int dividir(int numero1, int numero2) {
        return numero1/numero2;
    }

    //Método para mostrar los resultados

    public void mostrarResultados(int suma, int resta, int multip, int division) {
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multip);
        System.out.println("La division es: "+division);
    }
}
