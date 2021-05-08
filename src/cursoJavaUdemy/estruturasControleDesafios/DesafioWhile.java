package cursoJavaUdemy.estruturasControleDesafios;

import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String digitado = "";
        int cont = 0;
        Double notas = Double.valueOf(0);

        while (!"-1".equalsIgnoreCase(digitado)) {

            System.out.print("Digite a nota de 0 a 10 ou escreva -1 para finalizar: ");
            digitado = entrada.nextLine();

            Double numero = Double.parseDouble(digitado);

            if ("-1".equals(digitado)) {
                System.out.println("O total de notas inseridas é de " + notas);
                System.out.println("A quantidade de notas inseridas é de " + cont);
                System.out.println("A média das notas é " + notas / cont);

                entrada.close();
                return;
            } else if (numero <= 0 || numero > 10) {
                System.out.println("Insira uma nota válida entre 0 e 10 (ou -1 para calcular a média).");
            } else {
                notas += numero;
                cont++;

            }
        }
        entrada.close();

    }
}
