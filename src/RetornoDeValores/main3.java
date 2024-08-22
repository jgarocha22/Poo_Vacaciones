package RetornoDeValores;

import javax.swing.*;

public class main3 {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));

        Operacion3 op = new Operacion3();

        int suma = op.sumar(n1,n2);
        int resta = op.restar(n1,n2);
        int multip = op.multiplicar(n1,n2);
        int divi = op.dividir(n1,n2);

        op.mostrarResultados(suma,resta,multip,divi);
        //op.mostrarResultados(op.sumar(n1,n2),op.restar(n1,n2),op.multiplicar(n1,n2),op.dividir(n1,n2)); UNA MANERA PERO FEA
    }
}
