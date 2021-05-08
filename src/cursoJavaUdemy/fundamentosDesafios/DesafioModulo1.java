package cursoJavaUdemy.fundamentosDesafios;

import java.util.Scanner;

public class DesafioModulo1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        String primeiroNumero = entrada.nextLine().replace(",", ".");

        System.out.print("Digite o segundo número: ");
        String segundoNumero = entrada.nextLine().replace(",", ".");

        System.out.print("Digite a operação: ");
        String operacao = entrada.nextLine();

        Double numero1 = Double.parseDouble(primeiroNumero);
        Double numero2 = Double.parseDouble(segundoNumero);

        entrada.close();

        if ("+".equals(operacao)) {
            System.out.println("O resultado da soma é " + (numero1 + numero2));
            return;
        } else if ("-".equals(operacao)) {
            System.out.println("O resultado da subtração é " + (numero1 - numero2));
            return;
        } else if ("*".equals(operacao)) {
            System.out.println("O resultado da muuplicação é " + (numero1 * numero2));
            return;
        } else if ("/".equals(operacao)) {
            System.out.println("O resultado da divisão é " + (numero1 / numero2));
            return;
        }
        System.out.println("Essa operação não poderá ser feita. Escolha uma das 4 operações básicas (+ , - , * , /).");
        return;
    }
}
