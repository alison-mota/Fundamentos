package cursoJavaUdemy.fundamentos;

import javax.swing.*;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Digite o primeiro número");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo número");
        System.out.println(valor1 + valor2);

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);
        System.out.println("Número 1: " + numero1 + " e o número 2: " + numero2);

        System.out.println("O valor real da soma é " + (numero1 + numero2));
        System.out.println("A média dos dois números é " + ((numero1 + numero2)/2));

    }
}
