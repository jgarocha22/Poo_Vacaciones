package ParametrosYArgumentos;

import javax.swing.JOptionPane;

public class main2 {

    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));

        Operacion2 op = new Operacion2();

        op.sumar(n1,n2);
        op.restar(n1,n2);
        op.multiplicar(n1,n2);
        op.dividir(n1,n2);

        op.mostrarResultados();
    }
}
