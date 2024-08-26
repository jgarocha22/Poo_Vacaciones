package Sobrecarga;

public class main4 {

    public static void main(String[] args) {
        Persona2 p1 = new Persona2("Palo",21);
        p1.correr();

        Persona2 p2 = new Persona2("1234");
        p2.correr(100);
    }
}
