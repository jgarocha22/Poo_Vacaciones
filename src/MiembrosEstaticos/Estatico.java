package MiembrosEstaticos;


public class Estatico {

    private static String frase = "Primera frase";

    public static int sumar(int n1,int n2){
        return n1 + n2;
    }

    public static void main(String[] args) {

        System.out.println(Estatico.frase);
        System.out.println("La suma es: "+Estatico.sumar(3,4));

        /*Estatico ob1 = new Estatico();
        Estatico ob2 = new Estatico();

        ob2.frase = "Segunda frase";

        System.out.println(ob1.frase);
        System.out.println(ob2.frase);*/
    }
}
